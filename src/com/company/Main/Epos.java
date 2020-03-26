package com.company.Main;

public class Epos extends Book {

    public String eposType = "default";

    public Epos(){

    }

    public Epos(String name, String author, int pages, String eposType){
        super(name, author, pages);
        this.eposType = eposType;
    }

    public void setEposType(String eposType) { this.eposType = eposType; }

    public String getEposType() { return this.eposType; }

}
