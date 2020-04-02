package com.company.Executor.Lyrics;

import com.company.Executor.Book.IFiction;

public class Sonnet extends Lyrics implements IFiction {

    private String sonnet = "sonnet";

    public Sonnet(){

    }

    public Sonnet(String name, String author, int pages, String lyrics, String sonnet){
        super(name, author, pages, lyrics);
        this.sonnet = sonnet;
    }


    public void setSonnet(String value) { this.sonnet = value; }

    public String getSonnet() { return this.sonnet = sonnet; }

    @Override
    public String getInfoFiction() {
        String pagesStr = String.valueOf(getPages());
        String infoFiction = "Sonnet: " + getName() + ", " + getAuthor() + ", " + pagesStr + " pages, " + getLyrics();
        return infoFiction;
    }
}
