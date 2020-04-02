package com.company.Executor.Epos;

import com.company.Executor.Book.IFiction;

public class Novel extends Epos implements IFiction {

    private String novel = "default";

    public Novel(){

    }

    public Novel(String name, String author, int pages, String epos, String novel){
        super(name, author, pages, epos);
        this.novel = novel;
    }

    public void setNovel(String novel) { this.novel = novel; }

    public String getNovel() { return this.novel; }


    @Override
    public String getInfoFiction() {
        String pagesStr = String.valueOf(getPages());
        String infoFiction = "Novel: " + getName() + ", " + getAuthor() + ", " + pagesStr + " pages, " + getEpos();
        return infoFiction;
    }
}
