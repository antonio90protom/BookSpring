package it.books.service;

import java.util.List;  
import it.books.dto.BookDto;

public interface BookServiceInterface {

	public List<BookDto> getAllBooks();
	
	public List<BookDto> getBook(Integer id);

	public BookDto save(BookDto book); 

	public BookDto delete(Integer id);

	public BookDto update(BookDto book);
 
}
