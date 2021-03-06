package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BibliotecaApp {
    public static List bookList = new ArrayList();

    public void appInit() {
        BooksData booksData = new BooksData();
        for (Iterator i = booksData.BOOKSDATA.iterator(); i.hasNext();){
            bookList.add((Books) i.next());
        }
    }

    public String showBooks() {
        String buffer = "";
        for (Iterator i = bookList.iterator(); i.hasNext();){
            buffer += showOneBook((Books) i.next());
        }
        return buffer;
    }

    public String showOneBook(Books book) {
        if (book.getName()!=null || book.getAuthor()!= null || book.getDate() != null){
            String buffer = BooksFormat.format(book.getName(), book.getAuthor(), book.getDate());
            System.out.println(buffer);
            return buffer;
        }else{
            System.out.println("error! The book does not exist!");
            return null;
        }
    }

}
