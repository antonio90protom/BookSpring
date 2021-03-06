package it.book.dao;

import java.util.List; 
import it.books.dto.ProductDto;

public interface ProductRepository {

	public ProductDto insert(ProductDto product);

	public ProductDto delete(Integer id);

	public List<ProductDto> getProducts(Integer idcartFK);

	public void deleteAll(Integer idcartFK);

	public void Sum(Integer idcartFK);

}