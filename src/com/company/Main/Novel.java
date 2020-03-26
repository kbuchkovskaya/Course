package com.company.Main;

public class Novel extends Epos {

    public String novel = "default";

    public Novel(){

    }

    public Novel(String name, String author, int pages, String eposType, String novel){
        super(name, author, pages, eposType);
        this.novel = novel;
    }

    public void setNovel(String novel) { this.novel = novel; }

    public String getNovel() { return this.novel; }
}
