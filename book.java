package com.company;

public class book {
    private String name;
    private String genre;
    private int year;
    public book(String n, String s, int a)
    {
        name = n;
        genre = s;
        year = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("name: %s \n genre: %s \n year: %s ", this.name, this.genre, this.year);
    }
}
