package com.data_structures_and_algorithms_CSC301.Labs.Lab4;

public class T1_Stock implements Comparable<T1_Stock> {
    float ADJClose15, Change15, Close15, High15, LastTradePrice15, Low15, Open15, PercentageChange15,
            PreviousClose15, Value15;
    String CompanyName15, Date15, Sector15, Symbol15;
    int ID15, TradeCount15, Volume15;

    T1_Stock(float ADJClose, float Change, float Close, float High, float LastTradePrice,
             float Low, float Open, float PercentageChange,
             float PreviousClose, float Value, String CompanyName, String Date,
             String Sector, String Symbol, int ID, int TradeCount, int Volume) {
        this.ADJClose15 = ADJClose;
        this.Change15 = Change;
        this.Close15 = Close;
        this.High15 = High;
        this.LastTradePrice15 = LastTradePrice;
        this.Low15 = Low;
        this.Open15 = Open;
        this.PercentageChange15 = PercentageChange;
        this.PreviousClose15 = PreviousClose;
        this.Value15 = Value;
        this.CompanyName15 = CompanyName;
        this.Date15 = Date;
        this.Sector15 = Sector;
        this.Symbol15 = Symbol;
        this.ID15 = ID;
        this.TradeCount15 = TradeCount;
        this.Volume15=Volume;
    }

    public String toString() {
        return "\n" + ID15 + "\t" + Low15 + "\t" + Open15 + "\t" + Symbol15 + "\t" +
                TradeCount15 + "\t" + Volume15;

    }

    public String toStringFull() {
        return ADJClose15 + "\t" + Change15 + "\t" + Close15 + "\t" + CompanyName15 + "\t" +
                Date15 + "\t" + High15 + "\t" + ID15 + "\t" +
                LastTradePrice15 + "\t" + Low15 + "\t" + Open15 + "\t" + PercentageChange15 +
                "\t" + PreviousClose15 + "\t" + Sector15 + "\t" +
                Symbol15 + "\t" + TradeCount15 + "\t" + Value15 + "\t" + Volume15;
    }

    @Override
    public int compareTo(T1_Stock arg0) {
        // Two stocks are identical if they have the same name.
        // Use compareTo method
        return this.CompanyName15.compareTo(arg0.CompanyName15);
    }
}
