package it.books.controller.rest;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import it.books.dto.ProductDto;
import it.books.service.impl.ProductService;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/{idcartFK}")
	public ResponseEntity<List<ProductDto>> getProducts(@PathVariable("idcartFK") Integer idcartFK) {
		return new ResponseEntity<List<ProductDto>>(service.getProducts(idcartFK), HttpStatus.OK);
	}
	
	@PostMapping(value = "/insert")
	public ProductDto insertBook(@RequestBody ProductDto product) {
		return service.insert(product);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ProductDto delete(@PathVariable("id") Integer id) {
		return service.delete(id);
	}
	
	@DeleteMapping(value = "deleteAll/{idcartFK}")
	public void deleteAll(@PathVariable("idcartFK") Integer idcartFK) {
		 service.deleteAll(idcartFK);
	}
	
	@RequestMapping(value = "/sum/{idcartFK}") 
	public void Sum(@PathVariable("idcartFK") Integer idcartFK) {
		service.Sum(idcartFK);
}
	
	
	
	
	

}
