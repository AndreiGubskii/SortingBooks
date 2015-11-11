package com.homedev.sortingbooks;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book {
    private String name;
    private String authorName;
    private Date publishDate;

    public Book(){

    }

    public Book(String name,String authorName,Date publishDate){
        this.name = name;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getBook(){
        SimpleDateFormat date = new SimpleDateFormat("dd.mm.yyyy");
        return (name + " " + authorName + " Дата публикации: " + date.format(publishDate));
    }

    public static Date setPublishDate(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
        return new Date(calendar.getTimeInMillis());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
