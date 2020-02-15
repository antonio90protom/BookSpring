package it.books.controller.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import it.books.dto.BookDto;
import it.books.service.impl.BookService; 

@RestController
@RequestMapping(value = "/api/books")
public class BookController {
//aaaaaaaaaaaaaaa
	@Autowired
	private BookService bookService; 

	@GetMapping()
	public ResponseEntity<List<BookDto>> getAllBooks() {
		return new ResponseEntity<List<BookDto>>(bookService.getAllBooks(), HttpStatus.OK);
	}

	@GetMapping(value = "/info/{id}")
	public ResponseEntity<List<BookDto>> getBook(@PathVariable("id") Integer id) {
		return new ResponseEntity<List<BookDto>>(bookService.getBook(id), HttpStatus.OK);
	}

	@PostMapping(value = "/newBook")
	public BookDto insertBook(@RequestBody BookDto book) {
		return bookService.save(book);
	}

	@DeleteMapping(value = "/{id}")
	public BookDto deleteBook(@PathVariable("id") Integer id) {
		return bookService.delete(id);
	}

	@PatchMapping(value = "/edit/{id}")
	public BookDto updateBook(@PathVariable("id") Integer id, @RequestBody BookDto book) {
		book.setId(id);
		return bookService.update(book);
	}

}
