package no.hvl.dat109.BOATSHR.domain;

public class Båt {

    private String typeBoat;
    private int size;
    private int maxCapacity;
    private String engineType;
    private String engineFuel;

    public Båt() {
    }

    public Båt(String typeBoat, int size, int maxCapacity, String engineType, String engineFuel) {
        this.typeBoat = typeBoat;
        this.size = size;
        this.maxCapacity = maxCapacity;
        this.engineType = engineType;
        this.engineFuel = engineFuel;
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
}
