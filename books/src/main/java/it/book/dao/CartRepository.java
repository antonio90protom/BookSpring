package it.book.dao;
 
import it.books.dto.CartDto;

public interface CartRepository {
	
	public CartDto save(CartDto cart); 
 
}
