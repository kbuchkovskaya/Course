package com.company.Main;

public class Drama extends Book{
    public String dramaType = "Drama type: ";

    public Drama(){

    }

    public Drama(String name, String author, int pages, String dramaType){
        super (name, author, pages);
        this.dramaType = dramaType;
    }

    public void setDrama(String value) { this.dramaType = value; }

    public String getDrama() { return this.dramaType = dramaType; }

/*    public void printDramaType(){
        System.out.println("Drama type: ");
    }*/

}
