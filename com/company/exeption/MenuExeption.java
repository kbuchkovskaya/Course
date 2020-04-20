package com.company.exeption;

public class MenuExeption extends Exception {
    private static final String MENU_EXEPTION = "Nothing selected!";

    public MenuExeption() {
        super(MENU_EXEPTION);
    }
}
