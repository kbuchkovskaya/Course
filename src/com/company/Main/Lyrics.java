package com.company.Main;

public class Lyrics extends Book {

    public String lyricsType = "default";

    public Lyrics(){

    }

    public Lyrics(String name, String author, int pages, String lyricsType){
        super(name, author, pages);
        this.lyricsType = lyricsType;
    }

    public void setLyricsType(String lyricsType) { this.lyricsType = lyricsType; }

    public String getLyricsType() { return this.lyricsType; }
}
