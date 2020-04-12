package com.company.book;

import java.util.*;

/**
 * Storage for lists of paper book, e-book and audio book
 * and for Map
 */
public class Storage {

    private List<PaperBook> listPaperBooks;
    private List<EBook> listEBooks;
    private List<AudioBook> listAudioBooks;
    private Map<String, Integer> bookMap;

    public Storage(){
        listPaperBooks = new ArrayList<>();
        listEBooks = new LinkedList<>();
        listAudioBooks = new ArrayList<>();
        bookMap = new HashMap<>();
    }

    public void setListPaperBooks(List<PaperBook> listPaperBooks) {
        this.listPaperBooks = listPaperBooks;
    }

    public List<PaperBook> getListPaperBooks() { return this.listPaperBooks; }

    public void setListEBooks(List<EBook> listEBooks) {
        this.listEBooks = listEBooks;
    }

    public List<EBook> getListEBooks() {
        return this.listEBooks;
    }

    public void setListAudioBooks(List<AudioBook> listAudioBooks) {
        this.listAudioBooks = listAudioBooks;
    }

    public List<AudioBook> getListAudioBooks() {
        return this.listAudioBooks;
    }

    public void setPaperBook (PaperBook paperBook){
        listPaperBooks.add(paperBook);
    }

    public void removePaperBook(int index){
        listPaperBooks.remove(index);
    }

    public void setEBook (EBook eBook){
        listEBooks.add(eBook);
    }

    public void removeEBook(int index){
        listEBooks.remove(index);
    }

    public void setAudioBook (AudioBook audioBook){
        listAudioBooks.add(audioBook);
    }

    public void removeAudioBook (int index){ listAudioBooks.remove(index); }

    public Map<String, Integer> getBookMap() { return bookMap; }

    public void setBookMap(Map<String, Integer> bookMap) { this.bookMap = bookMap; }
}
