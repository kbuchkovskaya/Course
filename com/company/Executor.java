package com.company;

import com.company.book.*;

import java.time.LocalDate;
import java.util.*;

public class Executor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Storage storage = new Storage();

        PaperBook paperBook = new PaperBook();
        EBook eBook = new EBook();
        AudioBook audioBook = new AudioBook();

        Set<String> badWords = new HashSet<>();
        badWords.add("fuck");
        badWords.add("wtf");
        badWords.add("shit");

        System.out.println("What do you wand to do? 1 - Add book; 2- Delete book; 3 - Books list; 4 - Exit: ");
        int choiseAddDeleteList = scanner.nextInt();
        do {
            switch (choiseAddDeleteList) {
                case 1:
                    System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                    int choiseBook = scanner.nextInt();
                    do {
                        switch (choiseBook) {
                            case 1:
                                System.out.println("Name: ");
                                String ppName = scanner.next();
                                while (badWords.contains(ppName.toLowerCase())){
                                    System.out.println("Please choose a different book name!");
                                    System.out.println("Name: ");
                                    ppName = scanner.next();
                                }
                                paperBook.setName(ppName);
                                storage.getBookMap().put(paperBook.getName(), 111);

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

                                storage.setPaperBook(paperBook);

                                System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                choiseBook = scanner.nextInt();
                                break;
                            case 2:
                                System.out.println("Name: ");
                                String eBookName = scanner.next();
                                while (badWords.contains(eBookName.toLowerCase())){
                                    System.out.println("Please choose a different book name!");
                                    System.out.println("Name: ");
                                    eBookName = scanner.next();
                                }
                                eBook.setName(eBookName);
                                storage.getBookMap().put(eBook.getName(), 222);

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

                                storage.setEBook(eBook);

                                System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                choiseBook = scanner.nextInt();
                                break;
                            case 3:
                                System.out.println("Name: ");
                                String aBookName = scanner.next();
                                while (badWords.contains(aBookName.toLowerCase())){
                                    System.out.println("Please choose a different book name!");
                                    System.out.println("Name: ");
                                    aBookName = scanner.next();
                                }
                                while (badWords.contains(aBookName.toLowerCase()));
                                audioBook.setName(aBookName);
                                storage.getBookMap().put(audioBook.getName(), 333);

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

                                storage.setAudioBook(audioBook);

                                System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                choiseBook = scanner.nextInt();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Incorrect value");
                                break;
                        }
                    } while (choiseBook != 4);
                    System.out.println("What do you wand to do? 1 - Add book; 2- Delete book; 3 - Books list; 4 - Exit: ");
                    choiseAddDeleteList = scanner.nextInt();
                case 2:
                    System.out.println("Which book do you want to delete? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                    choiseBook = scanner.nextInt();
                    do {
                        switch (choiseBook) {
                            case 1:
                                int paperBookCounter;
                                for (paperBookCounter = 0; paperBookCounter < storage.getListPaperBooks().size(); paperBookCounter++) {
                                    System.out.print(paperBookCounter + 1 + " ");
                                    System.out.println(storage.getListPaperBooks());
                                }
                                if(storage.getListPaperBooks().isEmpty()){
                                    System.out.println("Empty list. Please add books!");
                                }
                                else
                                    if(storage.getListPaperBooks().contains(paperBook)){
                                        System.out.println("Which paper book do you want to delete: ");
                                        paperBookCounter = scanner.nextInt() - 1;
                                        while (paperBookCounter < storage.getListPaperBooks().size()) {
                                            storage.removePaperBook(paperBookCounter);
                                            }
                                        if(storage.getListPaperBooks().isEmpty()){
                                            System.out.println("Empty list. Please add books!");
                                        }
                                        else
                                            System.out.println(storage.getListPaperBooks());
                                    }
                                System.out.println("Which book do you want to delete? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                choiseBook = scanner.nextInt();
                                break;
                            case 2:
                                int eBookCounter;
                                for (eBookCounter = 0; eBookCounter < storage.getListEBooks().size(); eBookCounter++) {
                                    System.out.print(eBookCounter + 1 + " ");
                                    System.out.println(storage.getListEBooks());
                                }
                                if(storage.getListEBooks().isEmpty()){
                                    System.out.println("Empty list. Please add books!");
                                }
                                else
                                if(storage.getListEBooks().contains(eBook)){
                                    System.out.println("Which e-book do you want to delete: ");
                                    eBookCounter = scanner.nextInt() - 1;
                                    while (eBookCounter < storage.getListEBooks().size()) {
                                        storage.removeEBook(eBookCounter);
                                    }
                                    if(storage.getListEBooks().isEmpty()){
                                        System.out.println("Empty list. Please add books!");
                                    }
                                    else
                                        System.out.println(storage.getListEBooks());
                                }
                                System.out.println("Which book do you want to delete? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                choiseBook = scanner.nextInt();
                                break;
                            case 3:
                                int audioBookCounter;
                                for (audioBookCounter = 0; audioBookCounter < storage.getListAudioBooks().size(); audioBookCounter++) {
                                    System.out.print(audioBookCounter + 1 + " ");
                                    System.out.println(storage.getListAudioBooks());
                                }
                                if(storage.getListAudioBooks().isEmpty()){
                                    System.out.println("Empty list. Please add books!");
                                }
                                else
                                if(storage.getListAudioBooks().contains(audioBook)){
                                    System.out.println("Which audio book do you want to delete: ");
                                    audioBookCounter = scanner.nextInt() - 1;
                                    while (audioBookCounter < storage.getListAudioBooks().size()) {
                                        storage.removeAudioBook(audioBookCounter);
                                    }
                                    if(storage.getListAudioBooks().isEmpty()){
                                        System.out.println("Empty list. Please add books!");
                                    }
                                    else
                                        System.out.println(storage.getListAudioBooks());
                                }
                                System.out.println("Which book do you want to delete? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                choiseBook = scanner.nextInt();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Incorrect value or nothing to delete!");
                                break;
                        }
                    } while (choiseBook != 4);
                    System.out.println("What do you wand to do? 1 - Add book; 2- Delete book; 3 - Books list; 4 - Exit: ");
                    choiseAddDeleteList = scanner.nextInt();
                case 3:
                    if(storage.getBookMap().isEmpty())
                        System.out.println("List is empty! Please add books!");
                    else
                    {
                        System.out.println("List of books: ");
                        System.out.println(storage.getBookMap().keySet());
                    }
                    System.out.println("What do you wand to do? 1 - Add book; 2- Delete book; 3 - Books list; 4 - Exit: ");
                    choiseAddDeleteList = scanner.nextInt();
                    break;
                case 4:
                    break;
                default:
                     System.out.println("Incorrect value!");
                     break;
            }
        } while (choiseAddDeleteList != 4);
    }
}