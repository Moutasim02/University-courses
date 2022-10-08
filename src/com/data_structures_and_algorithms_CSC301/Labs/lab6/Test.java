package com.data_structures_and_algorithms_CSC301.Labs.lab6;

import java.util.ArrayList;
public class Test {
    static ArrayList<ShoppingMall> Malls = new ArrayList<>();

    public static void main(String[] args) {

        initializeMalls();

        showMalls();

        System.out.println("\n-----------Task 6.1: Show all Malls that are in my area, e.g. khalidiyah -----------------------------------------");
        // Task6.1: Show all Malls that are in my area, e.g. khalidiyah
        for (int i = 0; i < Malls.size(); i++) {
            if (Malls.get(i).getAddress().equals("khalidiyah"))
            System.out.println(Malls.get(i));

        }

        System.out.println("\n-----------Task6.2: Show all Malls that have a particular Shop available, e.g. Sephora-----------------------------------------");
        // Task6.2: Show all Malls that have a particular Shop available, e.g. Sephora
        for (int i = 0; i < Malls.size(); i++) {
            if (Malls.get(i).searchShop("Sephora") != null)
                System.out.println(Malls.get(i));

        }

        System.out.println("\n-----------Task6.3: Marina Mall closed in Corniche -----------------------------------------");
        // Task6.3: Marina Mall closed in Corniche. Complete the partial code below to implement that.
        boolean Done = false;
        for (int i=0; i < Malls.size() && !Done ; i++) {
            ShoppingMall s = Malls.get(i);
            if(s.getName().equals("Marina Mall") && s.getAddress().equals("Corniche")){
                Malls.remove(s);
                Done = true;
            }}
        showMalls();

        System.out.println("\n-----------Challenging Bonus Task: Two Malls merged in one location-----------------------------------------");
        // Task6.4: Two Malls merged in one location. Do necessary actions.
        // example Abu Dhabi Mall and Galleria mall merged
        // all Shops stored in Abu Dhabi Mall will be transferred to Galleria Mall

        //find the indices both Malls in the list.
        int s1Index=-1, s2Index=-1;
        for (int i=0;i<Malls.size();i++) {
            ShoppingMall s = Malls.get(i);
            if(s.getName().equals("Abu Dhabi Mall") && s.getAddress().equals("Al Zahiyah"))
                s1Index = i;
            else if (i < Malls.size())
            s2Index = i;
        }

        if (s1Index>0 && s2Index > 1) { // That is, we have found the two Malls
            ShoppingMall AbuDhabiMall = Malls.get(s1Index);
            ShoppingMall GalleriaMall = Malls.get(s2Index);

            for (int i = 0; i < AbuDhabiMall.getNumberOfListOfShops(); i++) {
                Shop sh = AbuDhabiMall.getStoredShops().get(i);
                GalleriaMall.addShop(sh);
            }
            Malls.remove(s1Index); // delete Abu Dhabi Mall
            GalleriaMall.showStoredShops();
        }
        showMalls();


    }

    public static void initializeMalls() {
        // Initialize Malls
        Malls.add(new ShoppingMall("Marina Mall", "Corniche", "026453627", "8am-10pm"));
        Malls.add(new ShoppingMall("Khalidiya Mall", "khalidiyah", "026423457", "8am-10pm"));
        Malls.add(new ShoppingMall("Mushrif Mall", "Mushrif", "026314523", "8am-10pm"));
        Malls.add(new ShoppingMall("Abu Dhabi Mall", "Al Zahiyah", "026314615", "8am-10pm"));
        Malls.add(new ShoppingMall("Galleria Mall", "Maryah Island", "026323415", "8am-10pm"));
        Malls.add(new ShoppingMall("Moutasim El Ayoubi", "Maryah Island", "1080415", "8am-10pm"));



        // add 3 Shops to each ShoppingMall
        for (int i = 0; i < 4; i++) {
            Malls.get(i).addShop(new Shop("Prada", "9am-10pm", "First Floor", "No current offers"));
            Malls.get(i).addShop(new Shop("Dior", "9am-10pm", "Second Floor", "Free gift with purchase of 500"));
            Malls.get(i).addShop(new Shop("Nike", "9am-10pm","First Floor", "10% off"));
        }

        for (int i = 4; i < 5; i++) {
            Malls.get(i).addShop(
                    new Shop("Sephora", "9am-10pm", "Third Floor", "No current offers"));
            Malls.get(i).addShop(
                    new Shop("Puma", "9am-10pm", "First Floor", "Buy 1 get 1"));
            Malls.get(i).addShop(
                    new Shop("Boots", "9am-10pm", "Second Floor", "25-75% off"));
        }
    }

    private static void showMalls() {
        System.out.println("All Malls are-----------------------------------------");
        for (ShoppingMall s : Malls)
            System.out.println(s);
    }

}


