package com.company.Executor.Drama;

import com.company.Executor.Book.IFiction;

public class Comedy extends Drama implements IFiction {

    private String comedy = "Comedy";

    public Comedy(){

    }

    public Comedy(String name, String author, int pages, String drama, String comedy){
        super(name, author, pages, drama);
        this.comedy = comedy;
    }

    public void setComedy(String value) { this.comedy = value; }

    public String getComedy() { return this.comedy = comedy; }


    @Override
    public String getInfoFiction() {
        String pagesStr = String.valueOf(getPages());
        String infoFiction = "Comedy: " + getName() + ", " + getAuthor() + ", " + pagesStr + " pages, " + getDrama();
        return infoFiction;
    }
}
