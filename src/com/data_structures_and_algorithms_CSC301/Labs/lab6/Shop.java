package com.data_structures_and_algorithms_CSC301.Labs.lab6;

public class Shop {

    private String Name, Timings, Level, Offers;

    public Shop(String name, String Timings, String Level, String Offers) {
        this.Name = name;
        this.Timings = Timings;
        this.Level = Level;
        this.Offers = Offers;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTimings() {
        return Timings;
    }

    public void setTimings(String Timings) {
        this.Timings = Timings;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getOffers() {
        return Offers;
    }

    public void setOffers(String Offers) {
        this.Offers = Offers;
    }

    @Override
    public String toString() {
        return String.format("[%15s %20s %20s %35s]", Name, Timings, Level, Offers);
    }
}
