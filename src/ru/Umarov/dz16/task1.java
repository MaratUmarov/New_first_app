package ru.Umarov.dz16;

import java.io.*;

public class task1 {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        Book book1 = new Book("bore", "me", 2001);
        Book book2 = new Book("name", "author", 2002);
        System.out.println();
        library.Books(book1);
        library.Books(book2);
        library.saveBook();
        File bookfile = new File("Booklist", "listOfBooks.txt");
        library.showList(bookfile);
    }
}

