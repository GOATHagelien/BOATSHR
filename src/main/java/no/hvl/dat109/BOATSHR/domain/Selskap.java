package no.hvl.dat109.BOATSHR.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Selskap {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int nmr;

    @OneToMany
    @JoinColumn(name = "selskap_id")
    private Set<BoatParking> boatParking = new HashSet<>();

    @OneToMany
    private Set<Kunde> kunde;

    public Selskap() {
    }

    public Selskap(Long id, String name, int nmr) {
        this.id = id;
        this.name = name;
        this.nmr = nmr;
    }



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
                ", boatParking=" + boatParking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Selskap selskap = (Selskap) o;

        return id != null ? id.equals(selskap.id) : selskap.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}