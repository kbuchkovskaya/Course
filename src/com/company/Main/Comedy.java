package com.company.Main;

public class Comedy extends Drama {

    public String comedy = "Comedy";

    public Comedy(){

    }

    public Comedy(String name, String author, int pages, String dramaType, String comedy){
        super(name, author, pages, dramaType);
        this.comedy = comedy;
    }

    public void setComedy(String value) { this.comedy = value; }

    public String getComedy() { return this.comedy = comedy; }



}
