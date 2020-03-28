package com.company.Executor.Epos;

public class Novel extends Epos {

    private String novel = "default";

    public Novel(){

    }

    public Novel(String name, String author, int pages, String epos, String novel){
        super(name, author, pages, epos);
        this.novel = novel;
    }

    public void setNovel(String novel) { this.novel = novel; }

    public String getNovel() { return this.novel; }
}
