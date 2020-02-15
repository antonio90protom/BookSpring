package it.books.service.impl;

import java.util.List; 
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.book.dao.ProductRepository;
import it.books.dto.ProductDto;
import it.books.service.ProductServiceInterface;

@Service
public class ProductService implements ProductServiceInterface{

	@Autowired
	private ProductRepository dao;
	
	@Override
	@Transactional
	public ProductDto insert(ProductDto product) { 
		return dao.insert(product);
	}

	@Override
	@Transactional
	public ProductDto delete(Integer id) { 
		return dao.delete(id);
	}

	@Override
	public List<ProductDto> getProducts(Integer idcartFK) { 
		return dao.getProducts(idcartFK);
	}

	@Override
	@Transactional
	public void deleteAll(Integer idcartFK){
		 dao.deleteAll(idcartFK);
	}

	@Override
	public void Sum(Integer idcartFK) { 
		dao.Sum(idcartFK);
	}

}
