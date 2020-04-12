package com.company.shop;

import com.company.book.Book;

/**
 * A <code>Store</code> object represent
 * shop type - store
 */
public final class Store extends Shop {

    private String address;

    public Store() {

    }

    public Store(String name, Book book, String address) {
        super(name, book);
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return bookInfo() + "\n" +
                "Store{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }

    @Override
    public void pay() {
        System.out.println("Payment method: with cash");
    }

    public static class Department {

        String name;

        public Department() {

        }

        public Department(String name) {
            this.name = name;
        }

        public String getName() { return this.name; }

        public void setName(String name) { this.name = name; }

        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }
}
