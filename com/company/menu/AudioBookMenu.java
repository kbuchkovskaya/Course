package com.company.menu;

import com.company.book.AudioBook;
import com.company.book.BookLanguage;
import com.company.book.Genre;
import com.company.book.Storage;
import com.company.exeption.EmptyListExeption;
import sun.invoke.empty.Empty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AudioBookMenu {

    private static final String AUDIO_BOOK_TYPE = "Audio book";

    Storage storage = new Storage();

    Scanner scanner = new Scanner(System.in);

    public void enterAudioBookInfo() {

        AudioBook audioBook = new AudioBook();

        System.out.println("Name: ");
        String aBookName = scanner.next();
        audioBook.setName(aBookName);
        storage.fillBookMap(aBookName, AUDIO_BOOK_TYPE);

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
    }

    public void deleteAudioBook(String audioBookName) {
        if (!storage.getBookMap().isEmpty()) {
            storage.removeBookMap(audioBookName);
        }
    }

    public void listAudioBooks() throws EmptyListExeption {
        if (!storage.getBookMap().isEmpty()) {
            storage.printBookMapInfo();
        }
        throw new EmptyListExeption();
    }
}
