package com.company.book;

/**
 * Bookmark for paper books
 * @author Kate Buchkovska
 */
public class Accessories{

    private int bookmark;

    public Accessories() {
    }

    public Accessories(int bookmark) {
        this.bookmark = bookmark;
    }

    public int getBookmark() {
        return this.bookmark;
    }

    public void setBookmark(int bookmark) {
        this.bookmark = bookmark;
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "bookmark=" + bookmark +
                '}';
    }
}
