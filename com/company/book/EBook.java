package com.company.book;

import java.time.LocalDate;

/**
 * An <code>EBook</code> object represent
 * book subtype - e-books
 */
public class EBook extends Book implements Price{

    /**
     * Discount for all e-books
     */
    final int DISCOUNT_EBOOK = 20;

    private double memory;
    private String webSite;
    private EBookType eType;

    public EBook(){

    }

    public EBook(String name, String author, LocalDate publicationYear, double price, Genre genre, double memory, String webSite, EBookType eType) {
        super(name, author, publicationYear, price, genre);
        this.memory = memory;
        this.webSite = webSite;
        this.eType = eType;
    }

    public double getMemory() {
        return this.memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public String getWebSite() {
        return this.webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public EBookType geteType() {
        return this.eType;
    }

    public void seteType(EBookType eType) {
        this.eType = eType;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "memory=" + memory +
                ", webSite='" + webSite + '\'' +
                ", eType=" + eType +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + priceWithDiscount() +
                ", genre=" + genre +
                '}';
    }

    /**
     * Count e-book price
     * @return price with discount
     */
    @Override
    public double priceWithDiscount() {
        price = price - (price * DISCOUNT_EBOOK * 0.01);
        return price;
    }
}
