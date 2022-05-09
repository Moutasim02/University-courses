package com.programming_II_CSC202.Labs.Lab_5;
// Moutasim El Ayoubi - 1080415

public class Mac extends Laptop {
    private String manufacturingDate;
    private String releaseDate;

    public Mac(String brand, int size) {
        super(brand, size);
    }

    public Mac(String manufacturingDate, String releaseDate, String brand, int size) {
        super(brand, size);
        this.manufacturingDate = manufacturingDate;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return
                "ManufacturingDate='" + manufacturingDate + '\'' +
                "\nReleaseDate='" + releaseDate + '\''
                ;
    }
}
