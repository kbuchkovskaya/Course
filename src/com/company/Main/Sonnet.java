package com.company.Main;

public class Sonnet extends Lyrics {
    String sonnet = "sonnet";

    public Sonnet(){

    }

    public Sonnet(String name, String author, int pages, String lyricsType, String sonnet){
        super(name, author, pages, lyricsType);
        this.sonnet = sonnet;
    }


    public void setSonnet(String value) { this.sonnet = value; }

    public String getSonnet() { return this.sonnet = sonnet; }
}
