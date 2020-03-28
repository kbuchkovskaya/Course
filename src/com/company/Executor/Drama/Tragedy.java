package com.company.Executor.Drama;

public class Tragedy extends Drama {

    private String tragedy = "tragedy";

    public Tragedy(){

    }

    public Tragedy(String name, String author, int pages, String drama, String tragedy){
        super(name, author, pages, drama);
        this.tragedy = tragedy;
    }

    public void setTragedy(String value) { this.tragedy = value; }

    public String getTragedy() { return this.tragedy = tragedy; }
}
