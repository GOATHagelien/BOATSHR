package no.hvl.dat109.BOATSHR.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Selskap {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int nmr;
    private String sAddress;

    /*
    @OneToMany
    @JoinColumn(name = "selskap_id")
    private Set<BoatParking> boatParking = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "kunde_id")
    private Set<Kunde> kunde = new HashSet<>();

*/
    public Selskap() {
    }

    public Selskap(Long id, String name, int nmr, String sAddress) {
        this.id = id;
        this.name = name;
        this.nmr = nmr;
        this.sAddress = sAddress;
    }


/*
    public Set<Kunde> getKunde() {
        return kunde;
    }

    public void setKunde(Set<Kunde> kunde) {
        this.kunde = kunde;
    }

    public Set<BoatParking> getBoatParking() {
        return boatParking;
    }


    public void setBoatParking(Set<BoatParking> boatParking) {
        this.boatParking = boatParking;
    }

*/


    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNmr() {
        return nmr;
    }

    public void setNmr(int nmr) {
        this.nmr = nmr;
    }

    @Override
    public String toString() {
        return "Selskap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nmr=" + nmr +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Selskap selskap = (Selskap) o;

        if (nmr != selskap.nmr) return false;
        if (id != null ? !id.equals(selskap.id) : selskap.id != null) return false;
        if (name != null ? !name.equals(selskap.name) : selskap.name != null) return false;
        return sAddress != null ? sAddress.equals(selskap.sAddress) : selskap.sAddress == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + nmr;
        result = 31 * result + (sAddress != null ? sAddress.hashCode() : 0);
        return result;
    }
}