package it.books.dao.impl;
 
import java.util.List; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root; 
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.book.dao.UserRepository;
import it.books.dao.entity.User; 
import it.books.dto.UserDto;

@Repository 
public class UsersDaoImpl implements UserRepository{

	@PersistenceContext
	EntityManager em;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	@Transactional
	public UserDto newUser(UserDto user) {
		em.persist(modelMapper.map(user, User.class));
		return user; 
	}

	@Override
	@Transactional
	public UserDto delete(String username) {
		User user = em.find(User.class, username);
		em.remove(user);
		return modelMapper.map(user, UserDto.class);
	}

	@Override
	public List<UserDto> getUserByUsername(String username) { 
		CriteriaBuilder criteria = em.getCriteriaBuilder();
		CriteriaQuery<UserDto> query = criteria.createQuery(UserDto.class);
		Root<User> root = query.from(User.class);
		query.where(criteria.equal(root.get("username"), username));
		query.select(criteria.construct(UserDto.class, root.get("username"), root.get("password") ));
		TypedQuery<UserDto> result = em.createQuery(query);
		return result.getResultList();
	}
}