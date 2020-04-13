package com.company.book;

/**
 * Audio book language
 */
public enum BookLanguage{

    UKR ("Ukrainian"), ENG("English"), RUS("Russian"), IT("Italian");

    private String bookLanguage;

    BookLanguage(String bookLanguage) { this.bookLanguage = bookLanguage; }
}
