package edu.uaslp.examen;

public class Book {
    private String title;
    private String isbn;
    private String author;
    private short stars;

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public String getAuthor (){
        return getIsbn();
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public short getStars(){
        return stars;
    }
    public void setStars(short stars){
        this.stars = stars;
    }
}
