package com.company.Executor.Epos;

import com.company.Executor.Book.IFiction;

public class Fairytale extends Epos implements IFiction {

    private String fairytale = "default";

    public Fairytale(){

    }

    public Fairytale(String name, String author, int pages, String epos, String fairytale){
        super(name, author, pages, epos);
        this.fairytale = fairytale;
    }

    public void setFairytale(String fairytale){ this.fairytale = fairytale; }

    public String getFairytale() { return this.fairytale; }

    @Override
    public String getInfoFiction() {
        String pagesStr = String.valueOf(getPages());
        String infoFiction = "Fairytail: " + getName() + ", " + getAuthor() + ", " + pagesStr + " " + "pages, " + getEpos();
        return infoFiction;
    }
}
