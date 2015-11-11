package com.homedev.sortingbooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static List<Book> books = new ArrayList<>();
    private static List<Book> sortingBooks = new ArrayList<>();

    public static void main(String... args){
        books = Helper.addBooks(100);
        sortingBooks = Helper.sortingBooks(books);

        for(Book book : sortingBooks){
            System.out.print(book.getBook() + "\n");
        }
    }
}
