package com.programming_II_CSC202.Labs.Lab3.task4;

public class House {
    //Moutasim El Ayoubi 1080415
    private String country;
    private String city;
    private int size;
    private int noOfRooms;

    House() {
    }

    public House(String country, String city, int size, int noOfRooms) {
        this.country = country;
        this.city = city;
        this.size = size;
        this.noOfRooms = noOfRooms;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    @Override
    public String toString() {
        return "Country: " + country + ", city: " + city
                + " ,size: " + size + " ,number of rooms: " + noOfRooms;
    }

}

