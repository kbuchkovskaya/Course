package com.company;

import com.company.exeption.EmptyListExeption;
import com.company.exeption.IncorrectInputDataExeption;
import com.company.exeption.MenuExeption;
import com.company.menu.AudioBookMenu;
import com.company.menu.EBookMenu;
import com.company.menu.PaperBookMenu;

import java.io.IOException;
import java.util.*;

public class Executor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            PaperBookMenu paperBookMenu = new PaperBookMenu();
            EBookMenu eBookMenu = new EBookMenu();
            AudioBookMenu audioBookMenu = new AudioBookMenu();

            System.out.println("What do you wand to do? 1 - Add book; 2- Delete book; 3 - Books list; 4 - Exit: ");
            int choiseAddDeleteList = scanner.nextInt();
            do {
                switch (choiseAddDeleteList) {
                    case 1:
                        System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                        int choiseBook = scanner.nextInt();
                        try {
                            do {
                                switch (choiseBook) {
                                    case 1:
                                        paperBookMenu.enterPaperBookInfo();
                                        System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                        choiseBook = scanner.nextInt();
                                        break;
                                    case 2:
                                        eBookMenu.enterEBookInfo();
                                        System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                        choiseBook = scanner.nextInt();
                                        break;
                                    case 3:
                                        audioBookMenu.enterAudioBookInfo();
                                        System.out.println("Which book do you want to add? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                        choiseBook = scanner.nextInt();
                                        break;
                                    default:
                                        break;
                                }
                            } while (choiseBook == 1 || choiseBook == 2 || choiseBook == 3);
                            throw new MenuExeption();
                        } catch (MenuExeption | InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("What do you wand to do? 1 - Add book; 2- Delete book; 3 - Books list; 4 - Exit: ");
                        choiseAddDeleteList = scanner.nextInt();
                        break;
                    case 2:
                        System.out.println("Which book do you want to delete? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                        choiseBook = scanner.nextInt();
                        try {
                            do {
                                switch (choiseBook) {
                                    case 1:
                                        System.out.println("Enter book name which you want to delete: ");
                                        String paperBookName = scanner.next();
                                        paperBookMenu.deletePaperBook(paperBookName);
                                        System.out.println("Which book do you want to delete? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                        choiseBook = scanner.nextInt();
                                        break;
                                    case 2:
                                        System.out.println("Enter book name which you want to delete: ");
                                        String eBookName = scanner.next();
                                        eBookMenu.deleteEBook(eBookName);
                                        System.out.println("Which book do you want to delete? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                        choiseBook = scanner.nextInt();
                                        break;
                                    case 3:
                                        System.out.println("Enter book name which you want to delete: ");
                                        String audioBookName = scanner.next();
                                        audioBookMenu.deleteAudioBook(audioBookName);
                                        System.out.println("Which book do you want to delete? 1 - Paper book; 2 - E-book; 3 - Audio book; 4 - Exit: ");
                                        choiseBook = scanner.nextInt();
                                        break;
                                    default:
                                        System.out.println("Incorrect value or nothing to delete!");
                                        break;
                                }
                            } while (choiseBook == 1 || choiseBook == 2 || choiseBook == 3);
                            throw new MenuExeption();
                        } catch (MenuExeption | InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("What do you wand to do? 1 - Add book; 2- Delete book; 3 - Books list; 4 - Exit: ");
                        choiseAddDeleteList = scanner.nextInt();
                        break;
                    case 3:
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
                        System.out.println("What do you wand to do? 1 - Add book; 2- Delete book; 3 - Books list; 4 - Exit: ");
                        choiseAddDeleteList = scanner.nextInt();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } while (choiseAddDeleteList == 1 || choiseAddDeleteList == 2 || choiseAddDeleteList == 3 || choiseAddDeleteList == 4);
            throw new MenuExeption();
        } catch (MenuExeption e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("String entered!");
        } finally {
            System.exit(0);
        }
    }
}