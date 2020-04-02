package com.company.Executor.Epos;

import com.company.Executor.Book.Book;

public class Epos extends Book {

    private String epos = "default";

    public Epos(){

    }

    public Epos(String name, String author, int pages, String epos){
        super(name, author, pages);
        this.epos = epos;
    }

    public void setEpos(String epos) { this.epos = epos; }

    public String getEpos() { return this.epos; }

    @Override
    public void read() {

    }

}
