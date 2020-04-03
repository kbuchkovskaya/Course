package com.company.Executor.Executor;

import com.company.Executor.Book.IFiction;
import com.company.Executor.Drama.Comedy;
import com.company.Executor.Drama.Tragedy;
import com.company.Executor.Epos.Epos;
import com.company.Executor.Epos.Fairytale;
import com.company.Executor.Epos.Novel;
import com.company.Executor.Lyrics.Romance;
import com.company.Executor.Lyrics.Sonnet;
import com.company.Executor.Places.Shop;

class Executor {

    public static void main(String[] args) {

        Shop shop = new Shop();

        IFiction fairytail = new Fairytale("name", "author", 12, "epos", "fairytail");

        shop.setFiction(fairytail);
        System.out.println("Shop: " + shop.getFiction().getInfoFiction());

        System.out.println("===============");

        IFiction novel = new Novel("name", "author", 12, "epos", "novel");

        shop.setFiction(novel);
        System.out.println("Shop: " + shop.getFiction().getInfoFiction());

        System.out.println("===============");

        IFiction comedy = new Comedy("name", "author", 12, "drama", "comedy");

        shop.setFiction(comedy);
        System.out.println("Shop: " + shop.getFiction().getInfoFiction());

        System.out.println("===============");

        IFiction tragedy = new Tragedy("name", "author", 12, "drama", "tragedy");

        shop.setFiction(tragedy);
        System.out.println("Shop: " + shop.getFiction().getInfoFiction());

        System.out.println("===============");

        IFiction romance = new Romance("name", "author", 12, "lyrics", "romance");

        shop.setFiction(romance);
        System.out.println("Shop: " + shop.getFiction().getInfoFiction());

        System.out.println("===============");

        IFiction sonnet = new Sonnet("name", "author", 12, "lyrics", "sonnet");

        shop.setFiction(sonnet);
        System.out.println("Shop: " + shop.getFiction().getInfoFiction());

        System.out.println("===============");
        
    }
}
