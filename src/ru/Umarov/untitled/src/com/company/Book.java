package com.company;

import java.io.Serializable;

class Book implements Serializable{ //Сериализуемый класс Книга
    String title;
    String author;
    String editionYear;

    Book(String title, String author, String editionYear) {
        this.title = title;
        this.author = author;
        this.editionYear = editionYear;
    }
    String getTitle() {return title;}
    String getAuthor(){ return author;}

}
