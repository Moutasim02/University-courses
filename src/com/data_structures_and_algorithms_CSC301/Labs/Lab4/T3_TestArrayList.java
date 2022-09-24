package com.data_structures_and_algorithms_CSC301.Labs.Lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class T3_TestArrayList {
    public static void main(String[] args) {
        ArrayList<T1_Stock> stocksHistory0415 = new ArrayList<>();
        try {
            readData("MarketHistory.txt", stocksHistory0415);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Number of history items: " + stocksHistory0415.size());
        System.out.println("500th trading history:" + stocksHistory0415.get(500));

        System.out.println("History Content:");
        for (Iterator<T1_Stock> history = stocksHistory0415.iterator(); history.hasNext(); ) {
            System.out.print(history.next());
        }

        System.out.println("Testing Sorting based on COMPANY NAME");
        Collections.sort(stocksHistory0415);
        for (T1_Stock sh : stocksHistory0415) {
            System.out.print(sh);
        }

        System.out.println("Testing Sorting based on COMPANY NAME and ADJClose PRICE");
        ADJCloseComparator priceComparator = new ADJCloseComparator();
        Collections.sort(stocksHistory0415, priceComparator);
        System.out.println(stocksHistory0415);

        System.out.println("Testing Extracting SubCollection based on SYMBOL");
        ArrayList<T1_Stock> shADIB = new ArrayList<>();
        for (T1_Stock sh : stocksHistory0415)
            if (sh.Symbol15.equals("ADIB"))
                shADIB.add(sh);
        System.out.println(shADIB);
        System.out.println("ADIB History: number of entries = " + shADIB.size());
        System.out.println("            : MAX ADJClose price = " + Collections.max(shADIB));
        System.out.println("            : MIN ADJClose price = " + Collections.min(shADIB));

/*        // T4
        System.out.println("Practice1: Create a new list containing all companies' Symbol:");
        //Practice1 code:  To implement it.
        ArrayList<String> allSymbols1080415 = new ArrayList<>();
       */
    }

    public static void readData(String fileName, ArrayList<T1_Stock> stocksHistory)
            throws Exception {
        java.io.File file = new java.io.File(fileName);
        Scanner input = new Scanner(file);
        input.nextLine(); //Discard 1st line
        while (input.hasNext()) {
            Scanner in = new Scanner(input.nextLine());
            in.useDelimiter("\t");
            float ADJClose = in.nextFloat();
            float Change = in.nextFloat();
            float Close = in.nextFloat();
            String CompanyName = in.next();
            String Date = in.next();
            float High = in.nextFloat();
            int ID = in.nextInt();
            float LastTradePrice = in.nextFloat();
            float Low = in.nextFloat();
            float Open = in.nextFloat();
            float PercentageChange = in.nextFloat();
            float PreviousClose = in.nextFloat();
            String Sector = in.next();
            String Symbol = in.next();
            int TradeCount = in.nextInt();
            float Value = in.nextFloat();
            int Volume = in.nextInt();
            stocksHistory.add(new T1_Stock(ADJClose, Change, Close, High, LastTradePrice,
                    Low, Open, PercentageChange, PreviousClose, Value, CompanyName,
                    Date, Sector, Symbol, ID, TradeCount, Volume));
        }
        input.close();
    }
}

