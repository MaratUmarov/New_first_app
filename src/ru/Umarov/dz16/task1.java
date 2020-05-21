package ru.Umarov.dz16;

import java.io.*;
import java.util.*;

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

class Library {
    ArrayList<Book> addBook = new ArrayList<Book>();

    public void addBook(Book b) {
        this.addBook.add(b);
    }

    public void listBook() {
        for (int i = 0; i < addBook.size(); i++)
            System.out.println(addBook.get(i));
    }

    public void saveBook() throws IOException {
        File dir = new File("Booklist");
        String s = "listOfBooks.txt";
        File bookfile = new File(dir, s);
        boolean b = dir.mkdir();
        try {
            if (bookfile.createNewFile())
                System.out.println("ok");
        } catch (IOException e) {
            e.getMessage();
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(bookfile));
objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showList(File bookfile) throws FileNotFoundException {

        ArrayList<Book> showBook = new ArrayList<>();
        try (FileReader fileReader = new FileReader(bookfile)) {
            System.out.println(fileReader);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        for (Book p : showBook)
            System.out.println(p.getName() + "  " + p.getAuthor() + "  " + p.getYear());
    }
}

public class task1 {
    public static void main(String[] args, File bookfile) throws Exception {

        Library library = new Library();
        Book book1 = new Book("bore", "me", 2001);
        Book book2 = new Book("name", "author", 2002);
        library.addBook(book1);
        library.addBook(book2);
        library.listBook();
        library.saveBook();
        library.showList(bookfile);
    }
}

