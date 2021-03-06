package no.hvl.dat109.BOATSHR.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BoatParking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String locationName;

    @NotNull
    private String locationAddress;

    private double locationGps;
    private int availableParking;


    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "selskap_id")
    private Selskap selskap;


    @OneToMany
    @JoinColumn(name = "BoatParking_id")
    private Set<Boat> boats = new HashSet<>();
*/
    public BoatParking() {
    }

    public BoatParking(String locationName, String locationAddress, double locationGps, int availableParking) {
        this.locationName = locationName;
        this.locationAddress = locationAddress;
        this.locationGps = locationGps;
        this.availableParking = availableParking;
    }


    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public double getLocationGps() {
        return locationGps;
    }

    public void setLocationGps(double locationGps) {
        this.locationGps = locationGps;
    }

    public int getAvailableParking() {
        return availableParking;
    }

    public void setAvailableParking(int availableParking) {
        this.availableParking = availableParking;
    }

    /*public Set<Boat> getBoats() {
        return boats;
    }

    public void setBoats(Set<Boat> boats) {
        this.boats = boats;
    }
*/
    @Override
    public String toString() {
        return "BoatParking{" +
                "id=" + id +
                ", locationName='" + locationName + '\'' +
                ", locationAddress='" + locationAddress + '\'' +
                ", locationGps=" + locationGps +
                ", availableParking=" + availableParking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoatParking that = (BoatParking) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
