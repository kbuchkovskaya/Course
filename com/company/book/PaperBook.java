package com.company.book;

import java.time.LocalDate;

/**
 * An <code>PaperBook</code> object represent
 * book subtype - paper books
 */

public class PaperBook extends Book {

    private CoverType cover;
    private Accessories accessories;
    private Size size;

    public PaperBook() {

    }

    public PaperBook(String name, String author, LocalDate publicationYear, double price, Genre genre, CoverType cover, Accessories accessories, Size size) {
        super(name, author, publicationYear, price, genre);
        this.cover = cover;
        this.accessories = accessories;
        this.size = size;
    }

    public CoverType getCover() {
        return this.cover;
    }

    public void setCover(CoverType cover) {
        this.cover = cover;
    }

    public Accessories getAccessories() {
        return this.accessories;
    }

    public void setAccessories(Accessories accessories) {
        this.accessories = accessories;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "cover=" + cover +
                ", accessories=" + accessories +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", genre=" + genre +
                '}';
    }

    public void soldBooks(String bookPlural) {
        System.out.print("Sold " + bookPlural + ": ");
    }

    public void soldBooks(int soldBooksQuantity) {
        System.out.println(soldBooksQuantity);
    }

}
