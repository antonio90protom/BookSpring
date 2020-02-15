package it.books.service.impl;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.book.dao.BookRepository;
import it.books.dto.BookDto;
import it.books.service.BookServiceInterface;

@Service 
public class BookService implements BookServiceInterface {

	@Autowired
	private BookRepository dao;

	@Override
	public List<BookDto> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	@Transactional
	public BookDto save(BookDto book) {
		return dao.save(book);
	}

	@Override
	@Transactional
	public BookDto delete(Integer id) {
		return dao.delete(id); 
	}

	@Override
	@Transactional
	public BookDto update(BookDto book) {
		return dao.update(book);
	}

	@Override
	public List<BookDto> getBook(Integer id) { 
		return dao.getBook(id);
	} 

}
