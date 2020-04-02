package com.company.Executor.Drama;

import com.company.Executor.Book.Book;

public class Drama extends Book  {

    private String drama = "default ";

    public Drama(){

    }

    public Drama(String name, String author, int pages, String drama){
        super (name, author, pages);
        this.drama = drama;
    }

    public void setDrama(String value) { this.drama = value; }

    public String getDrama() { return this.drama = drama; }

    @Override
    public void read() {

    }

}
