package com.data_structures_and_algorithms_CSC301.Labs.Lab7.T1_and_T2;

public class Book {
    private long ISBN;
    private int pages;
    private String authorName, title;

    public Book(long ISBN, int pages, String title, String authorName) {
        this.ISBN = ISBN;
        this.pages = pages;
        this.title = title;
        this.authorName = authorName;
        
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    

    public long getISBN() {
        return this.ISBN;
    }

    public int getPages() {
        return pages;
    }
    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("[%15d %5d %15s %40s]", ISBN, pages, authorName, title);
    }
}
