package com.company;

import com.company.book.*;
import com.company.shop.EShop;
import com.company.shop.Payment;
import com.company.shop.Shop;
import com.company.shop.Store;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.awt.*;
import java.time.LocalDate;

import static com.company.book.Genre.*;

public class Executor {

    public static void main(String[] args) {

        PaperBook paperBook1 = new PaperBook("papeBookName", "author", LocalDate.of(2018, 12, 12),200,  Genre.SONNET, CoverType.SOFT, new Accessories(1), Size.MEDIUM);
        PaperBook paperBook2 = new PaperBook("papeBookName", "author", LocalDate.of(2014, 1, 25), 130, Genre.TRAGEDY, CoverType.TOUGH, new Accessories(4), Size.LARGE);
        PaperBook paperBook3 = new PaperBook("papeBookName", "author", LocalDate.of(2000, 11, 05), 198, Genre.FAIRYTAIL, CoverType.TOUGH, new Accessories(5), Size.SMALL);
        PaperBook paperBook4 = new PaperBook("papeBookName", "author", LocalDate.of(2013, 9, 15), 189, Genre.NOVEL, CoverType.SOFT, new Accessories(0), Size.MEDIUM);

        EBook eBook1 = new EBook("name", "author", LocalDate.ofYearDay(2016, 25), 4459, FAIRYTAIL, 12.3, "webSite", EBookType.DJV);
        EBook eBook2 = new EBook("name", "author", LocalDate.ofYearDay(2003, 02), 125, NOVEL, 1.3, "webSite", EBookType.PDF);
        EBook eBook3 = new EBook("name", "author", LocalDate.ofYearDay(2009, 01), 189, COMEDY, 112.9, "webSite", EBookType.DOC);

        AudioBook audioBook1 = new AudioBook("name", "author", LocalDate.of(2005, 03,  31), 156, ROMAN, BookLanguage.UKR, 15.2 );
        AudioBook audioBook2 = new AudioBook("name", "author", LocalDate.of(2020, 4, 05), 159, SONNET, BookLanguage.ENG, 15.2 );
        AudioBook audioBook3 = new AudioBook("name", "author", LocalDate.of(2018, 1, 31), 258, COMEDY, BookLanguage.IT, 5.9 );

        Genre genre = SONNET;
        Store store = null;
        Store.Department newDepartment = null;
        EShop eShop = null;

            switch (genre) {
                case SONNET:
                    store = new Store("storeName", paperBook1, "address" );
                    newDepartment = new Store.Department("Fiction");
                    System.out.println(store.toString());
                    System.out.println(newDepartment.toString());
                    store.pay();
                    paperBook1.soldBooks("book");
                    paperBook2.soldBooks(1);
                    System.out.println("\n");

                    eShop = new EShop("name", audioBook2, "webSite");
                    System.out.println(eShop.toString());
                    eShop.pay();
                    System.out.println("\n");

                    break;

                case COMEDY:
                    eShop = new EShop("storeName", eBook3, "webSite" );
                    System.out.println(store.toString());
                    eShop.pay();
                    System.out.println("\n");

                    eShop = new EShop("storeName", audioBook3, "webSite" );
                    System.out.println(store.toString());
                    eShop.pay();
                    System.out.println("\n");

                    break;

                case NOVEL:
                    store = new Store("storeName", paperBook4, "address" );
                    System.out.println(store.toString());
                    store.pay();
                    System.out.println("\n");

                    eShop = new EShop("storeName", eBook2, "webAddress" );
                    System.out.println(store.toString());
                    eShop.pay();
                    System.out.println("\n");

                    break;

                case ROMAN:
                    eShop = new EShop("storeName", audioBook1, "address" );
                    System.out.println(store.toString());
                    eShop.pay();
                    System.out.println("\n");

                    break;

                case TRAGEDY:
                    store = new Store("storeName", paperBook2, "address" );
                    System.out.println(store.toString());
                    store.pay();
                    System.out.println("\n");

                    break;

                case FAIRYTAIL:
                    store = new Store("storeName", paperBook3, "address" );
                    System.out.println(store.toString());
                    store.pay();
                    System.out.println("\n");

                    eShop = new EShop("storeName", eBook1, "address" );
                    System.out.println(store.toString());
                    eShop.pay();
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("0 books were found");
                    break;

            }
        }
}


