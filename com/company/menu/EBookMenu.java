package com.company.menu;

import com.company.book.EBook;
import com.company.book.EBookType;
import com.company.book.Genre;
import com.company.book.Storage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EBookMenu {

    Storage storage = new Storage();

    Scanner scanner = new Scanner(System.in);

    List<EBook> listEBook = new ArrayList<>();

    public void enterEBookInfo() {

        EBook eBook = new EBook();

        System.out.println("Name: ");
        String eBookName = scanner.next();
        eBook.setName(eBookName);
        //storage.getBookMap().put(eBook.getName(), "222");

        System.out.println("Author: ");
        String eAuthor = scanner.next();
        eBook.setAuthor(eAuthor);

        System.out.println("Public year (yyyy-dd-mm): ");
        String ePubYear = scanner.next();
        eBook.setPublicationYear(LocalDate.parse(ePubYear));

        System.out.println("Price: ");
        String ePrice = String.valueOf(scanner.nextDouble());
        eBook.setPrice(Double.parseDouble(ePrice));

        System.out.println("Choose one of the genre...");
        String eGenre = scanner.next();
        eBook.setGenre(Genre.valueOf(eGenre));

        System.out.println("Memory: ");
        String eMemory = String.valueOf(scanner.nextDouble());
        eBook.setMemory(Double.parseDouble(eMemory));

        System.out.println("Website: ");
        String eWebSite = scanner.next();
        eBook.setWebSite(eWebSite);

        System.out.println("E-book type: ");
        String eBookType = scanner.next();
        eBook.seteType(EBookType.valueOf(eBookType));

        storage.addEBook(eBook);
        listEBook.add(eBook);
    }

    public void deleteEBook(String eBookName) {
        if(!this.listEBook.isEmpty()){
            listEBook.removeIf(eBook -> eBook.getName().equals(eBookName));
        }
    }

    public void listEBooks() {
        if (!this.listEBook.isEmpty())
            System.out.println("E-books: " + "\n" + listEBook.toString());
    }
}
