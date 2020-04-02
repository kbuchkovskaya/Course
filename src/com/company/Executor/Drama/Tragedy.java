package com.company.Executor.Drama;

import com.company.Executor.Book.IFiction;

public class Tragedy extends Drama implements IFiction {

    private String tragedy = "tragedy";

    public Tragedy(){

    }

    public Tragedy(String name, String author, int pages, String drama, String tragedy){
        super(name, author, pages, drama);
        this.tragedy = tragedy;
    }

    public void setTragedy(String value) { this.tragedy = value; }

    public String getTragedy() { return this.tragedy = tragedy; }

    @Override
    public String getInfoFiction() {
        String pagesStr = String.valueOf(getPages());
        String infoFiction = "Tragedy: " + getName() + ", " + getAuthor() + ", " + pagesStr + " pages, " + getDrama();
        return infoFiction;
    }
}
