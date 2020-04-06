package com.company.book;

import java.time.LocalDate;

public class AudioBook extends Book implements Price {

    final int DISCOUNT_AUDIO_BOOK = 10;

    private BookLanguage language;
    private double memory;

    public AudioBook(){

    }

    public AudioBook(String name, String author, LocalDate publicationYear, double price, Genre genre, BookLanguage language, double memory) {
        super(name, author, publicationYear, price, genre);
        this.language = language;
        this.memory = memory;
    }

    public BookLanguage getLanguage() {
        return this.language;
    }

    public void setLanguage(BookLanguage language) {
        this.language = language;
    }

    public double getMemory() {
        return this.memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }


    @Override
    public String toString() {
        return "AudioBook{" +
                "language=" + language +
                ", memory=" + memory +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + priceWithDiscount() +
                ", genre=" + genre +
                '}';
    }

    @Override
    public double priceWithDiscount() {
            price = price - (price * DISCOUNT_AUDIO_BOOK * 0.01);
        return price;
    }
}
