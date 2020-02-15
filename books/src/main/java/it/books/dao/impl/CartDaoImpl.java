package it.books.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import it.book.dao.CartRepository;
import it.books.dao.entity.Cart;
import it.books.dto.CartDto;

@Repository
public class CartDaoImpl implements CartRepository {

	@PersistenceContext
	EntityManager em;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	@Transactional
	public CartDto save(CartDto cart) {
		em.persist(modelMapper.map(cart, Cart.class));
		return cart;

	}

}