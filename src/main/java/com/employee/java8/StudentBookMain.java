package com.employee.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentBookMain  {

    public static void main(String[] args) {
        List<StudentBook> bookData = new ArrayList<>();
        bookData.add(new StudentBook(1, "Java", 100));
        bookData.add(new StudentBook(2, "Hibernate", 100));
        bookData.add(new StudentBook(3, "Mysql", 100));
        bookData.add(new StudentBook(4, "JSP", 100));
        bookData.add(new StudentBook(5, "Servlet", 100));
        bookData.add(new StudentBook(6, "PHP", 100));
        Collections.sort(bookData, (b1,b2)-> b1.getBookName().compareTo(b2.getBookName()));
        bookData.forEach(System.out::println);
    }

}
