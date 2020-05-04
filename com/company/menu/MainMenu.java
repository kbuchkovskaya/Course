package com.company.menu;

import com.company.book.Storage;
import com.company.exeption.EmptyListExeption;
import com.company.exeption.MenuExeption;
import com.company.utils.RWFromProperties;
import com.company.utils.ReadingFromFile;
import com.company.utils.WrittingToFile;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    public static final String PATH_FIRST = "C:\\Users\\User\\IdeaProjects\\Shop\\file.txt";
    public static final String PATH_SECOND = "C:\\Users\\User\\IdeaProjects\\Shop\\file2.txt";

    Scanner scanner = new Scanner(System.in);

    PaperBookMenu paperBookMenu = new PaperBookMenu();
    EBookMenu eBookMenu = new EBookMenu();
    AudioBookMenu audioBookMenu = new AudioBookMenu();

    Storage storage = new Storage();

    ReadingFromFile readingFromFile = new ReadingFromFile();
    RWFromProperties rwFromProperties = new RWFromProperties();
    WrittingToFile writtingToFile = new WrittingToFile();

    public void addBook(){
        System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
        int choiseAddBook = scanner.nextInt();
        try {
            do{
                switch (choiseAddBook){
                    case 1:
                        paperBookMenu.enterPaperBookInfo(this.storage);
                        break;
                    case 2:
                        eBookMenu.enterEBookInfo(this.storage);
                        break;
                    case 3:
                        audioBookMenu.enterAudioBookInfo(this.storage);
                        break;
                    default:
                        break;
                }
                System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                choiseAddBook = scanner.nextInt();
            } while (choiseAddBook == 1 || choiseAddBook == 2 || choiseAddBook == 3);
            throw new MenuExeption();
        } catch (MenuExeption | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteBook(){
        System.out.println("Which book do you want to delete? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
        int choiseDeleteBook = scanner.nextInt();
        try {
            do {
                switch (choiseDeleteBook) {
                    case 1:
                        paperBookMenu.deletePaperBook(this.storage);
                        break;
                    case 2:
                        eBookMenu.deleteEBook(this.storage);
                        break;
                    case 3:
                        audioBookMenu.deleteAudioBook(this.storage);
                        break;
                    default:
                        break;
                }
                System.out.println("Which book do you want to delete? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                choiseDeleteBook = scanner.nextInt();
            } while (choiseDeleteBook == 1 || choiseDeleteBook == 2 || choiseDeleteBook == 3);
            throw new MenuExeption();
        } catch (MenuExeption | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public void booksInfo() throws IOException, EmptyListExeption {

        if (!storage.getBookMap().isEmpty()){
            System.out.println("List: ");
            storage.printBookMapInfo();
        } else throw new EmptyListExeption();

        System.out.println("Properties: ");
        rwFromProperties.setMapToProperties(PATH_SECOND, storage.getBookMap());
        rwFromProperties.getMapFromProperties(PATH_FIRST);

        System.out.println("File: ");
        writtingToFile.writingToFile(PATH_FIRST, storage.getBookMap());
        readingFromFile.readFromFile(PATH_FIRST);
    }

    public void menu() throws IOException, EmptyListExeption {
        System.out.println("What do you wand to do? 1 - Add book; 2- Delete book; 3 - Books list; 4 - Exit: ");
        int choise = scanner.nextInt();
        do {
            switch (choise) {
                case 1:
                    addBook();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    booksInfo();
                    System.out.println("================================");
                    System.out.println("Available books: " + Storage.bookCounter);
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
            System.out.println("What do you wand to do? 1 - Add book; 2- Delete book; 3 - Books list; 4 - Exit: ");
            choise = scanner.nextInt();
        } while (choise == 1 || choise == 2 || choise == 3);
    }

}
