package no.hvl.dat109.BOATSHR.domain;

public class Båtplass {

    private String locationName;
    private String locationAddress;
    private double locationGps;
    private int availableParking;

    public Båtplass() {
    }

    public Båtplass(String locationName, String locationAddress, double locationGps, int availableParking) {
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
}
