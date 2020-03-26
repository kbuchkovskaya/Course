package com.company.Main;

class Main {
    public Main(){

    }

    public static void main(String[] args) {

        Tragedy tragedy1 = new Tragedy("name", "author", 35, "drama", "tragedy");
        System.out.println("Book name: " + tragedy1.getName());
        System.out.println("Book author: " + tragedy1.getAuthor());
        System.out.println("Pages quantity: " + tragedy1.getPages());
        System.out.println("Genre: " + tragedy1.getDrama());
        System.out.println("Drama type: " + tragedy1.getTragedy());

        System.out.println("==========");

        Comedy comedy1 = new Comedy("name", "author", 35, "drama", "comedy");
        System.out.println("Book name: " + comedy1.name);
        System.out.println("Book author: " + comedy1.author);
        System.out.println("Pages quantity: " + comedy1.pages);
        System.out.println("Genre: " + comedy1.dramaType);
        System.out.println("Drama type: " + comedy1.comedy);

        System.out.println("==========");

        Romance romance1 = new Romance("name", "author", 12, "lyricsType", "romance");
        System.out.println("Book name: " + romance1.name);
        System.out.println("Book author: " + romance1.author);
        System.out.println("Pages quantity: " + romance1.pages);
        System.out.println("Genre: " + romance1.lyricsType);
        System.out.println("Lyrics type: " + romance1.romance);

        System.out.println("==========");

        Sonnet sonnet1 = new Sonnet("name", "author", 45, "lyricsType", "sonnet");
        System.out.println("Book name: " + sonnet1.name);
        System.out.println("Book author: " + sonnet1.author);
        System.out.println("Pages quantity: " + sonnet1.pages);
        System.out.println("Genre: " + sonnet1.lyricsType);
        System.out.println("Lyrics type: " + sonnet1.sonnet);

        System.out.println("==========");

        Fairytale fairytale1 = new Fairytale("name", "author", 468, "eposType", "fairytale");
        System.out.println("Book name: " + fairytale1.name);
        System.out.println("Book author: " + fairytale1.author);
        System.out.println("Pages quantity: " + fairytale1.pages);
        System.out.println("Genre: " + fairytale1.eposType);
        System.out.println("Epos type: " + fairytale1.fairytale);

        System.out.println("==========");

        Novel novel1 = new Novel("name", "author", 245, "eposType", "novel");
        System.out.println("Book name: " + novel1.name);
        System.out.println("Book author: " + novel1.author);
        System.out.println("Pages quantity: " + novel1.pages);
        System.out.println("Genre: " + novel1.eposType);
        System.out.println("Epos type: " + novel1.novel);
    }
}
