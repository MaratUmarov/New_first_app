package com.company;

import java.io.*;
import java.util.ArrayList;
public class Library{ // Класс Библиотека

    ArrayList<Book> books = new ArrayList<Book>();
    public void addBook(Book b) { //метод "Добавить книгу в библиотеку
        this.books.add(b);
    }
    public void show() { //метод "Показать список книг"
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
    public void save() {
     File dir=new File("C:\\Users");
        File f= new File("с:\\Users\\notes.txt");
      dir.mkdir();
        System.out.println(dir.mkdir());
     try {
         if (f.createNewFile())
             System.out.println("OK");
              }catch (Exception e){
         System.out.println(e.getMessage());
     }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("с:\\Users\\notes.txt"))) {
                oos.writeObject(books);
                System.out.println("File has been written");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    public void recover() {
        ArrayList<Book> newBook = new ArrayList<Book>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("с:\\Users\\notes.txt"))) {
            newBook = ((ArrayList<Book>) ois.readObject());
            System.out.println("File has been written");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        for (Book p : newBook)
            System.out.println(p.getTitle()+"- "+ p.getAuthor()+";");

    }
}