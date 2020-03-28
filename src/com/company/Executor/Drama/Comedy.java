package com.company.Executor.Drama;

public class Comedy extends Drama {

    private String comedy = "Comedy";

    public Comedy(){

    }

    public Comedy(String name, String author, int pages, String drama, String comedy){
        super(name, author, pages, drama);
        this.comedy = comedy;
    }

    public void setComedy(String value) { this.comedy = value; }

    public String getComedy() { return this.comedy = comedy; }



}
