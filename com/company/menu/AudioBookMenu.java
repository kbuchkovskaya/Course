package com.company.menu;

import com.company.book.AudioBook;
import com.company.book.BookLanguage;
import com.company.book.Genre;
import com.company.book.Storage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AudioBookMenu {

    Storage storage = new Storage();

    Scanner scanner = new Scanner(System.in);

    List<AudioBook> listAudioBook = new ArrayList<>();

    public void enterAudioBookInfo() {

        AudioBook audioBook = new AudioBook();

        System.out.println("Name: ");
        String aBookName = scanner.next();
        audioBook.setName(aBookName);
        storage.getBookMap().put(audioBook.getName(), "333");

        System.out.println("Author: ");
        String aAuthor = scanner.next();
        audioBook.setAuthor(aAuthor);

        System.out.println("Public year (yyyy-dd-mm): ");
        String aPubYear = scanner.next();
        audioBook.setPublicationYear(LocalDate.parse(aPubYear));

        System.out.println("Price: ");
        String aPrice = String.valueOf(scanner.nextDouble());
        audioBook.setPrice(Double.parseDouble(aPrice));

        System.out.println("Choose one of the genre...");
        String aGenre = scanner.next();
        audioBook.setGenre(Genre.valueOf(aGenre));

        System.out.println("Book language: ");
        String aBookLanguage = scanner.next();
        audioBook.setLanguage(BookLanguage.valueOf(aBookLanguage));

        System.out.println("Memory: ");
        String aMemory = String.valueOf(scanner.nextDouble());
        audioBook.setMemory(Double.parseDouble(aMemory));

        storage.addAudioBook(audioBook);
        listAudioBook.add(audioBook);
    }

    public void deleteAudioBook(String audioBookName) {
        if (!this.listAudioBook.isEmpty()){
            listAudioBook.removeIf(audioBook -> audioBook.equals(audioBook));
        } else System.out.println("List is empty!");
    }

    public void listAudioBooks() {
        if (!this.listAudioBook.isEmpty())
            System.out.println("Audio books: " + "\n" + listAudioBook.toString());
    }
}
