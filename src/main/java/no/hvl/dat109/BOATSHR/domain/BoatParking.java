package no.hvl.dat109.BOATSHR.domain;

import javax.persistence.*;
import java.util.Set;

public class BoatParking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String locationName;
    private String locationAddress;
    private double locationGps;
    private int availableParking;


    @ManyToOne
    @JoinTable(name = "selskap_boatparking", joinColumns = @JoinColumn(name = "boatparking_id"),
            inverseJoinColumns = @JoinColumn(name = "selskap_id"))
    private Set<Selskap> selskaper;


    @OneToMany(mappedBy = "BoatParking")
    private Set<Boat> boats;

    public BoatParking() {
    }

    public BoatParking(String locationName, String locationAddress, double locationGps, int availableParking, Set<Selskap> selskaper, Set<Boat> boats) {
        this.locationName = locationName;
        this.locationAddress = locationAddress;
        this.locationGps = locationGps;
        this.availableParking = availableParking;
        this.selskaper = selskaper;
        this.boats = boats;
    }

    public Set<Selskap> getSelskap() {
        return selskaper;
    }

    public void setSelskap(Set<Selskap> selskap) {
        this.selskaper = selskap;
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

    public Set<Boat> getBoats() {
        return boats;
    }

    public void setBoats(Set<Boat> boats) {
        this.boats = boats;
    }

    @Override
    public String toString() {
        return "BoatParking{" +
                "id=" + id +
                ", locationName='" + locationName + '\'' +
                ", locationAddress='" + locationAddress + '\'' +
                ", locationGps=" + locationGps +
                ", availableParking=" + availableParking +
                ", selskaper=" + selskaper +
                ", boats=" + boats +
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
