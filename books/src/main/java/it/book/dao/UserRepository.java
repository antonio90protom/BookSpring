package it.book.dao;

import java.util.List;

import it.books.dto.UserDto;

public interface UserRepository {
	 
public UserDto newUser(UserDto user); 
	
	public UserDto delete(String username);
	
	public List<UserDto> getUserByUsername(String username);


}
