package com.company.Main;

public class Book {
    public String name = "default";
    public String author = "default";
    public int pages = 0;

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

    /*    public void printInfo(){
        System.out.println("Book name: " + this.name);
        System.out.println("Book author: " + this.author);
        System.out.println("Pages quantity: " + this.pages);
    }*/
}
