package com.company.menu;

import com.company.book.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class PaperBookMenu {

    Storage storage = new Storage();

    Scanner scanner = new Scanner(System.in);

    List<PaperBook> listPaperBook = new ArrayList<>();

    public void enterPaperBookInfo() {

        PaperBook paperBook = new PaperBook();

        System.out.println("Name: ");
        String ppName = scanner.next();
        paperBook.setName(ppName);
        storage.getBookMap().put(paperBook.getName(), "111");

        System.out.println("Author: ");
        String ppAuthor = scanner.next();
        paperBook.setAuthor(ppAuthor);

        System.out.println("Public year (yyyy-dd-mm): ");
        String ppPubYear = scanner.next();
        paperBook.setPublicationYear(LocalDate.parse(ppPubYear));

        System.out.println("Price: ");
        String ppPrice = String.valueOf(scanner.nextDouble());
        paperBook.setPrice(Double.parseDouble(ppPrice));

        System.out.println("Choose one of the genre...");
        String ppGenre = scanner.next();
        paperBook.setGenre(Genre.valueOf(ppGenre));

        System.out.println("Choose one of the cover type...");
        String ppCoverType = scanner.next();
        paperBook.setCover(CoverType.valueOf(ppCoverType));

        System.out.println("Bookmark: ");
        String ppAccess = scanner.next();
        paperBook.setAccessories(new Accessories(1));

        System.out.println("Choose one of the size...");
        String ppSize = scanner.next();
        paperBook.setSize(Size.valueOf(ppSize));

        storage.addPaperBookInfo(paperBook);
        listPaperBook.add(paperBook);
    }

    public void deletePaperBook(String bookName) {
        if (!this.listPaperBook.isEmpty()) {
            this.listPaperBook.removeIf(paperBook -> paperBook.getName().equals(bookName));
        }

    }

    public void listPaperBook() {
        if (!this.listPaperBook.isEmpty())
            System.out.println("Paper books: " + "\n" + listPaperBook.toString());
    }
}
