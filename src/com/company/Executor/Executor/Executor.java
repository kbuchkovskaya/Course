package com.company.Executor.Executor;

import com.company.Executor.Drama.Comedy;
import com.company.Executor.Drama.Tragedy;
import com.company.Executor.Epos.Fairytale;
import com.company.Executor.Epos.Novel;
import com.company.Executor.Lyrics.Romance;
import com.company.Executor.Lyrics.Sonnet;

class Executor {

    public static void main(String[] args) {

        Tragedy tragedy1 = new Tragedy("name", "author", 35, "drama", "tragedy");
        System.out.println("Book name: " + tragedy1.getName());
        System.out.println("Book author: " + tragedy1.getAuthor());
        System.out.println("Pages quantity: " + tragedy1.getPages());
        System.out.println("Kind of literature: " + tragedy1.getDrama());
        System.out.println("Genre: " + tragedy1.getTragedy());

        System.out.println("==========");

        Comedy comedy1 = new Comedy("name", "author", 35, "drama", "comedy");
        System.out.println("Book name: " + comedy1.getName());
        System.out.println("Book author: " + comedy1.getAuthor());
        System.out.println("Pages quantity: " + comedy1.getPages());
        System.out.println("Kind of literature: " + comedy1.getDrama());
        System.out.println("Genre: " + comedy1.getComedy());

        System.out.println("==========");

        Romance romance1 = new Romance("name", "author", 12, "lyrics", "romance");
        System.out.println("Book name: " + romance1.getName());
        System.out.println("Book author: " + romance1.getAuthor());
        System.out.println("Pages quantity: " + romance1.getPages());
        System.out.println("Kind of literature: " + romance1.getLyrics());
        System.out.println("Genre: " + romance1.getRomance());

        System.out.println("==========");

        Sonnet sonnet1 = new Sonnet("name", "author", 45, "lyrics", "sonnet");
        System.out.println("Book name: " + sonnet1.getName());
        System.out.println("Book author: " + sonnet1.getAuthor());
        System.out.println("Pages quantity: " + sonnet1.getPages());
        System.out.println("Kind of literature: " + sonnet1.getLyrics());
        System.out.println("Genre: " + sonnet1.getSonnet());

        System.out.println("==========");

        Fairytale fairytale1 = new Fairytale("name", "author", 468, "epos", "fairytale");
        System.out.println("Book name: " + fairytale1.getName());
        System.out.println("Book author: " + fairytale1.getAuthor());
        System.out.println("Pages quantity: " + fairytale1.getPages());
        System.out.println("Kind of literature: " + fairytale1.getEpos());
        System.out.println("Genre: " + fairytale1.getFairytale());

        System.out.println("==========");

        Novel novel1 = new Novel("name", "author", 245, "epos", "novel");
        System.out.println("Book name: " + novel1.getName());
        System.out.println("Book author: " + novel1.getAuthor());
        System.out.println("Pages quantity: " + novel1.getPages());
        System.out.println("Kind of literature: " + novel1.getEpos());
        System.out.println("Genre: " + novel1.getNovel());
    }
}
