package com.company;

import com.company.exeption.EmptyListExeption;
import com.company.menu.MainMenu;

import java.io.IOException;

public class Executor {

    public static void main(String[] args) throws IOException, EmptyListExeption {

        MainMenu mainMenu = new MainMenu();
        mainMenu.menu();

        }
    }
