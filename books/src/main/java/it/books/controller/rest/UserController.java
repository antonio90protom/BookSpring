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
import it.books.dto.UserDto;
import it.books.service.impl.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/new")
	public UserDto newUser(@RequestBody UserDto user) {
		return userService.newUser(user);
	}

	@GetMapping(value = "/profilo/{username}")
	public ResponseEntity<List<UserDto>> getUserByUsername(@PathVariable("username") String username) {
		return new ResponseEntity<List<UserDto>>(userService.getUserByUsername(username), HttpStatus.OK); 
	}

	@DeleteMapping(value = "/delete/{username}")
	public UserDto deleteUser(@PathVariable("username") String username) {
		return userService.delete(username);
	}
}