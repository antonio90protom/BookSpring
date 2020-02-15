package it.books.service.impl;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 
import it.book.dao.UserRepository;
import it.books.dto.UserDto;
import it.books.service.UserServiceInterface;

@Service 
public class UserService implements UserServiceInterface {

	@Autowired
	UserRepository dao;

	@Override
	@Transactional
	public UserDto newUser(UserDto user) {
		return dao.newUser(user);
	}

	@Override
	@Transactional
	public UserDto delete(String username) {
		return dao.delete(username); 
	}

	@Override
	public List<UserDto> getUserByUsername(String username) { 
		return dao.getUserByUsername(username);
	}
}