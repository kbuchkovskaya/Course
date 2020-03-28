package com.company.Executor.Epos;

import com.company.Executor.Book.Book;
import com.company.Executor.Book.IKindOfLiterature;

public class Epos extends Book implements IKindOfLiterature {

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
