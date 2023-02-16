package edu.uaslp.examen;

import java.util.ArrayList;

public class BookCollection {
    private String name;
    private Book[] colletions;

    public BookCollection(String name){
        colletions = new Book();
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addBook (Book book){

    }
    public ArrayList getBooks (){
        return colletions;
    }
    public int getStars(){
        return Book.getStars();
    }
}
