package com.company.book;

import java.util.*;

/**
 * Storage for lists of paper book, e-book and audio book
 * and for Map
 */
public class Storage {

    private Map<String, String> bookMap;
    private List<? super Book> listOfBooks = new ArrayList<>();
    ;
    private Set<String> badWords = new HashSet<>();

    public Storage() {
        bookMap = new HashMap<>();

    }

    public Storage(List<? super Book> addListOfBooks) {
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

    public Set<String> getBadWords() {
        return badWords;
    }

    public Map<String, String> getBookMap() {
        return bookMap;
    }

    public void addPaperBookInfo(PaperBook paperBook) {
        this.listOfBooks.add(paperBook);
    }

    public void addEBook(EBook eBook) {
        this.listOfBooks.add(eBook);
    }

    public void addAudioBook(AudioBook audioBook) {
        this.listOfBooks.add(audioBook);
    }

    public void fillBookMap(String bookName, String type) {
        bookMap.put(bookName, type);
    }

    public void removeBookMap(String bookName) {
        bookMap.keySet().removeIf(key -> key.equals(bookName));
    }

    public void printBookMapInfo() {
        bookMap.forEach((nameOfBook, type) -> System.out.println("Book type: " + type + "    " + "Book name: " + nameOfBook));
    }
}
