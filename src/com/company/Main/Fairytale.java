package com.company.Main;

public class Fairytale extends Epos {

    public String fairytale = "default";

    public Fairytale(){

    }

    public Fairytale(String name, String author, int pages, String eposType, String fairytale){
        super(name, author, pages, eposType);
        this.fairytale = fairytale;
    }

    public void setFairytale(String fairytale){ this.fairytale = fairytale; }

    public String getFairytale() { return this.fairytale; }
}
