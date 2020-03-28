package com.company.Executor.Lyrics;

public class Romance extends Lyrics {

    private String romance = "Romance";

    public Romance(){

    }

    public Romance(String name, String author, int pages, String lyrics, String romance){
        super(name, author, pages, lyrics);
        this.romance = romance;
    }

    public void setRomance(String romance) { this.romance = romance; }

    public String getRomance() { return this.romance = romance; }

}
