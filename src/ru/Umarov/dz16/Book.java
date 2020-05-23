package ru.Umarov.dz16;

import java.io.Serializable;

class Book implements Serializable {
    private String name;
    private String author;
    private int year;

    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }
}
