package com.company.menu;

import com.company.book.Storage;
import com.company.exeption.EmptyListExeption;
import com.company.exeption.MenuExeption;
import com.company.shop.Store;

import java.net.StandardProtocolFamily;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    Scanner scanner = new Scanner(System.in);

    //Storage storage = new Storage();

    PaperBookMenu paperBookMenu = new PaperBookMenu();
    EBookMenu eBookMenu = new EBookMenu();
    AudioBookMenu audioBookMenu = new AudioBookMenu();

    public void addBook(){
        System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
        int choiseAddBook = scanner.nextInt();
        try {
            do{
                switch (choiseAddBook){
                    case 1:
                        paperBookMenu.enterPaperBookInfo();
                        break;
                    case 2:
                        eBookMenu.enterEBookInfo();
                        break;
                    case 3:
                        audioBookMenu.enterAudioBookInfo();
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
                        paperBookMenu.deletePaperBook();
                        break;
                    case 2:
                        eBookMenu.deleteEBook();
                        break;
                    case 3:
                        audioBookMenu.deleteAudioBook();
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

    public void listOfBooks() {
        try {
            paperBookMenu.listPaperBook();
        } catch (EmptyListExeption e) {
            System.out.println(e.getMessage() + "of paper books!");
        }
        try {
            eBookMenu.listEBooks();
        } catch (EmptyListExeption e) {
            System.out.println(e.getMessage() + "of e-books!");
        }
        try {
            audioBookMenu.listAudioBooks();
        } catch (EmptyListExeption e) {
            System.out.println(e.getMessage() + "of audio books!");
        }
    }

    public void menu(){
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
                    listOfBooks();
                    System.out.println("================================");
                    System.out.println("Book's quantity: " + Storage.bookCounter);
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
