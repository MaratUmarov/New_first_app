package ru.Umarov.dz16;

import java.io.*;
import java.util.ArrayList;

class Library {
    ArrayList<Book> Books = new ArrayList<>();

    public void addBook(Book b) {
        this.Books.add(b);
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
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(bookfile))) {
            objectOutputStream.writeObject(Books);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void importBooks(File bookfile)  {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(bookfile))) {
            Books = ((ArrayList<Book>) objectInputStream.readObject());
            System.out.println(Books);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        for (Book p : Books)
            System.out.println(p.getName() + "  " + p.getAuthor() + "  " + p.getYear());
    }
}
