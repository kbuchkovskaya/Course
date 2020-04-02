package com.company.Executor.Lyrics;

import com.company.Executor.Book.IFiction;

public class Romance extends Lyrics implements IFiction {

    private String romance = "Romance";

    public Romance(){

    }

    public Romance(String name, String author, int pages, String lyrics, String romance){
        super(name, author, pages, lyrics);
        this.romance = romance;
    }

    public void setRomance(String romance) { this.romance = romance; }

    public String getRomance() { return this.romance = romance; }

    @Override
    public String getInfoFiction() {
        String pagesStr = String.valueOf(getPages());
        String infoFiction = "Romance: " + getName() + ", " + getAuthor() + ", " + pagesStr + " pages, " + getLyrics();
        return infoFiction;
    }
}
