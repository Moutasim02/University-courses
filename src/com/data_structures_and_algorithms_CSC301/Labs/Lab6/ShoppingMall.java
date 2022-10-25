package com.data_structures_and_algorithms_CSC301.Labs.Lab6;


import java.util.ArrayList;

public class ShoppingMall {

    private String Name, Address, Phone, OpeningHours;
    private ArrayList<Shop> ListOfShops;

    public ShoppingMall(String name, String address, String phone, String openingHours) {
        this.Name = name;
        this.Address = address;
        this.Phone = phone;
        this.OpeningHours = openingHours;
        this.ListOfShops = new ArrayList<>();
    }

    public ArrayList<Shop> getStoredShops() {
        return ListOfShops;
    }

    public int getNumberOfListOfShops() {
        return ListOfShops.size();
    }

    public void setListOfShops(ArrayList<Shop> ListOfShops) {
        this.ListOfShops = ListOfShops;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getOpeningHours() {
        return OpeningHours;
    }

    public void setOpeningHours(String openingHours) {
        OpeningHours = openingHours;
    }

    public void addShop(Shop shop) { // adds a new Shop to the the store
        boolean updated = false;
        for (int i = 0; i < ListOfShops.size() && !updated;
             i++) {
            Shop sh = ListOfShops.get(i);

        }
        if (!updated) // Shop is not stored, and we need to add it to the store
            ListOfShops.add(shop);
    }

    public void showStoredShops() {
        String header = String.format(" %15s %20s %20s %35s", "Name", "Timings", "Level", "Offers");
        System.out.println(header);
        for (Shop sh : ListOfShops)
            System.out.println(sh);
    }

    public Shop searchShop(String name) {
        for (Shop sh : ListOfShops)
            if (sh.getName().equals(name))
                return sh;
        return null;
    }

    public boolean RemoveShop(String name) {
        for (Shop sh : ListOfShops)
            if (sh.getName().equals(name)) {
                ListOfShops.remove(sh);
                return true;
            }
        return false;
    }

    @Override
    public String toString() {
        return String.format("[%20s %15s %10s %10s]", Name, Address, Phone, OpeningHours);
    }

}

