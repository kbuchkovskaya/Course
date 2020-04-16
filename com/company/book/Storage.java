package com.company.book;

import java.util.*;

/**
 * Storage for lists of paper book, e-book and audio book
 * and for Map
 */
public class Storage {

    private Map<String, String> bookMap;
    private Set<String> badWordsSet;
    private List<? super Book> listOfBooks;
    private Set <String> badWords = new HashSet<>();

    public Storage() {
        bookMap = new HashMap<>();
        badWordsSet = new HashSet<>();
        listOfBooks = new ArrayList<>();
    }

    public Storage( List<? super Book> addListOfBooks) {
        this.listOfBooks = addListOfBooks;
    }

    public List<? super Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<? super Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void setBookMap(Map<String, String> bookMap) {
        this.bookMap = bookMap;
    }

    public Map<String, String> getBookMap() {
        return bookMap;
    }

    public void addPaperBookInfo(PaperBook paperBook) {
        this.listOfBooks.add(paperBook);
    }

    public void addEBook(EBook eBook) { this.listOfBooks.add(eBook); }

    public void addAudioBook(AudioBook audioBook) { this.listOfBooks.add(audioBook); }

    public void getBooksInfo(Map<String, String> bookMap){
        for (Map.Entry entry : bookMap.entrySet()) {
            System.out.println("Key" + entry.getKey() + "Value" + entry.getValue());
        }
    }
}
