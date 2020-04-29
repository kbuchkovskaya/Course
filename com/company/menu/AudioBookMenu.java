package com.company.menu;

import com.company.book.*;
import com.company.exeption.EmptyListExeption;

import java.time.LocalDate;
import java.util.EnumSet;
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
        float aPrice = scanner.nextFloat();
        audioBook.priceWithDiscount(aPrice);
        audioBook.setPrice(aPrice);

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
        Storage.increaseBookQuantity();
    }

    public void deleteAudioBook() {
        System.out.println("Enter book name which you want to delete: ");
        String audioBookName = scanner.next();
        if (!storage.getBookMap().isEmpty()) {
            storage.removeBookMap(audioBookName);
            Storage.decreaseBookQuantity();
            System.out.println("Book deleted successfully!");
        }
    }

    public void listAudioBooks() throws EmptyListExeption {
        if (!storage.getBookMap().isEmpty()) {
            storage.printBookMapInfo();
        } else throw new EmptyListExeption();
    }
}
