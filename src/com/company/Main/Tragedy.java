package com.company.Main;

public class Tragedy extends Drama{

    public String tragedy = "tragedy";

    public Tragedy(){

    }

    public Tragedy(String name, String author, int pages, String dramaType, String tragedy){
        super(name, author, pages, dramaType);
        this.tragedy = tragedy;
    }

    public void setTragedy(String value) { this.tragedy = value; }

    public String getTragedy() { return this.tragedy = tragedy; }
}
