package com.company.Main;

public class Romance extends Lyrics {
    String romance = "Romance";

    public Romance(){

    }

    public Romance(String name, String author, int pages, String lyricsType, String romance){
        super(name, author, pages, lyricsType);
        this.romance = romance;
    }

    public void setRomance(String romance) { this.romance = romance; }

    public String getRomance() { return this.romance = romance; }

}
