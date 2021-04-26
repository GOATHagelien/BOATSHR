package no.hvl.dat109.BOATSHR.domain;

public class Selskap {
    String name;
    Int nmr;
    String address;

    public Selskap() {
    }

    public Selskap(String name, Int nmr, String address) {
        this.name = name;
        this.nmr = nmr;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Int getNmr() {
        return nmr;
    }

    public void setNmr(Int nmr) {
        this.nmr = nmr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
