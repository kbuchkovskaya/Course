package com.company.Executor.Book;

public abstract class Book {

    private String name = "default";
    private String author = "default";
    private int pages = 0;

    public Book(){

    }

    public Book(String name, String author, int pages){
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public void setAuthor(String author) { this.author = author; }

    public String getAuthor() { return this.author; }

    public void setPages(int pages) { this.pages = pages; }

    public int getPages() { return this.pages; }

    public abstract void read();

}
