package com.company.Executor.Lyrics;

public class Sonnet extends Lyrics {

    private String sonnet = "sonnet";

    public Sonnet(){

    }

    public Sonnet(String name, String author, int pages, String lyrics, String sonnet){
        super(name, author, pages, lyrics);
        this.sonnet = sonnet;
    }


    public void setSonnet(String value) { this.sonnet = value; }

    public String getSonnet() { return this.sonnet = sonnet; }
}
