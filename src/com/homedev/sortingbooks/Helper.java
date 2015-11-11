package com.homedev.sortingbooks;

import java.util.*;

import static java.util.Collections.swap;

public class Helper {
    public static List<Book> sortingBooks(List<Book> books) {
        for (int i = 0; i < books.size() - 1; i++) {
            for (int j = 0; j < books.size() - i - 1; j++) {
                if (books.get(j).getPublishDate().after(books.get(j + 1).getPublishDate())) {
                    swap(books, j, j + 1);
                }
            }
        }
        return books;
    }

    public static int random(int min,int max){
        return (int)(min + Math.random()*((max-min)+1));
    }

    public static List<Book> addBooks(int countBook){
        List<Book> books = new ArrayList<>();
        for(int i=0;i<countBook;i++){
            books.add(new Book("Книга "+(i+1), "Автор "+(i+1),
                    Book.setPublishDate(Helper.random(1980,2015),Helper.random(0,11), Helper.random(1,31))));
        }
        return books;
    }
}
