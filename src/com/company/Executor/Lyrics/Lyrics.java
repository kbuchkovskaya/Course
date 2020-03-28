package com.company.Executor.Lyrics;

import com.company.Executor.Book.Book;
import com.company.Executor.Book.IKindOfLiterature;

public class Lyrics extends Book implements IKindOfLiterature {

    private String lyrics = "default";

    public Lyrics(){

    }

    public Lyrics(String name, String author, int pages, String lyrics){
        super(name, author, pages);
        this.lyrics = lyrics;
    }

    public void setLyrics(String lyrics) { this.lyrics = lyrics; }

    public String getLyrics() { return this.lyrics; }

    @Override
    public void read() {

    }
}