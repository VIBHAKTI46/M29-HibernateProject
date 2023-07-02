package org.tnsif.service;
import java.util.List;
import org.tnsif.dao.BookDao;
import org.tnsif.dao.BookDaoImpl;
import org.tnsif.entities.Book;
public class BookServiceImpl implements BookService{
	
	private BookDao dao;
	
	public BookServiceImpl() {
		dao=new BookDaoImpl();
	}

	@Override
	public Book getBookByID(int id) {
		
		return dao.getBookBYID(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public Long getBookCount() {
		return dao.getbookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		return dao.getAuthorBook(author);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTite(title);
	}

	@Override
	public List<Book> getBookByPrice(double low, double high) {
		// TODO Auto-generated method stub
		return dao.getBookByPrice(low, high);
	}

}