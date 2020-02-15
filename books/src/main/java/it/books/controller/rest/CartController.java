package it.books.controller.rest;
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import it.books.dto.CartDto;
import it.books.service.impl.CartService;

@RestController
@RequestMapping(value = "/api/MyCart")
public class CartController {

	@Autowired
	private CartService cartService; 
	
	@PostMapping()
	public CartDto newCart(@RequestBody CartDto cart) {
		return cartService.save(cart);
	} 
	
}  