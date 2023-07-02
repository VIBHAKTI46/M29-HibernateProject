package org.tnsif.dao;

import java.util.List;

import org.tnsif.entities.Book;

public interface BookDao {
Book getBookBYID(int id);//single entity
List<Book>getAllBooks();//all the books
Long getbookCount();//count
List<Book>getAuthorBook(String author);//Particular author
List<Book>getBookByTite(String title);//for particular title
List<Book>getBookByPrice(Double low,Double high);//price range
List<Book> getBookByTitle(String title);
}
