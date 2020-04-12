package com.company.shop;

import com.company.book.Book;

/**
 * A <code>EShop</code> object represent
 * shop type - E-shop
 */
public final class EShop extends Shop {

    private String webSite;

    public EShop() {

    }

    public EShop(String name, Book book, String webSite) {
        super(name, book);
        this.webSite = webSite;
    }

    public String getWebSite() {
        return this.webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Override
    public String toString() {
        return bookInfo() + "\n" +
                "EShop{" +
                "webSite='" + webSite + '\'' +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }

    @Override
    public void pay() {
        System.out.println("Payment method: by card");
    }
}
