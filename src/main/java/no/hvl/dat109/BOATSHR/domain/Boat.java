package no.hvl.dat109.BOATSHR.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Boat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String typeBoat;
    private int size;
    private int maxCapacity;
    private String engineType;
    private String engineFuel;


    @ManyToOne
    @JoinTable(name = "BoatParking_Boat", joinColumns = @JoinColumn(name = "Boat_id"),
            inverseJoinColumns = @JoinColumn(name = "BoatParking_id"))
    private Set<BoatParking> boatParking;

    public Boat() {
    }

    public Boat(String typeBoat, int size, int maxCapacity, String engineType, String engineFuel) {
        this.typeBoat = typeBoat;
        this.size = size;
        this.maxCapacity = maxCapacity;
        this.engineType = engineType;
        this.engineFuel = engineFuel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<BoatParking> getBoatParking() {
        return boatParking;
    }

    public void setBoatParking(Set<BoatParking> boatParking) {
        this.boatParking = boatParking;
    }

    public String getTypeBoat() {
        return typeBoat;
    }

    public void setTypeBoat(String typeBoat) {
        this.typeBoat = typeBoat;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineFuel() {
        return engineFuel;
    }

    public void setEngineFuel(String engineFuel) {
        this.engineFuel = engineFuel;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "id=" + id +
                ", typeBoat='" + typeBoat + '\'' +
                ", size=" + size +
                ", maxCapacity=" + maxCapacity +
                ", engineType='" + engineType + '\'' +
                ", engineFuel='" + engineFuel + '\'' +
                ", boatParking=" + boatParking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Boat boat = (Boat) o;

        return id != null ? id.equals(boat.id) : boat.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}