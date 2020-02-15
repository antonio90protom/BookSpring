package it.books.service;
  
import java.util.List; 
import it.books.dto.UserDto;

public interface UserServiceInterface {
	
	public UserDto newUser(UserDto user); 
	
	public UserDto delete(String username);
	
	public List<UserDto> getUserByUsername(String username ); 
	
} 