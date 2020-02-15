package it.books.service;

import java.util.List; 
import it.books.dto.ProductDto;

public interface ProductServiceInterface {
	
	public ProductDto insert(ProductDto product);

	public ProductDto delete(Integer id);

	public List<ProductDto> getProducts(Integer idcartFK);

	public void deleteAll(Integer idcartFK);

	public void Sum(Integer idcartFK);
	
}
