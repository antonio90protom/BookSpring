package it.books.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 
import it.book.dao.CartRepository; 
import it.books.dto.CartDto;
import it.books.service.CartServiceInterface;

@Service
 public class CartService implements CartServiceInterface {

	@Autowired
	
	private CartRepository dao;

	@Override
	@Transactional
	public CartDto save(CartDto cart) {
		return dao.save(cart);
	}

//	@Override
//	public List<BookDto> getBooks (Integer id) {
//		return dao.getBooks(id);
//	}
//
//	@Override
//	public BookDto svuota(Integer id) {
//		return dao.emptyIdUtente(id);
//	}
//
//	@Override
//	public BookDto delete(Integer id) {
//		return dao.delete(id);
//	}
//
//	@Override
//	public void Sum(Integer id) {
//		dao.Sum(id);
//		
//	}

}