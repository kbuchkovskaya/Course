package com.company.Executor.Epos;

public class Fairytale extends Epos {

    private String fairytale = "default";

    public Fairytale(){

    }

    public Fairytale(String name, String author, int pages, String epos, String fairytale){
        super(name, author, pages, epos);
        this.fairytale = fairytale;
    }

    public void setFairytale(String fairytale){ this.fairytale = fairytale; }

    public String getFairytale() { return this.fairytale; }
}
