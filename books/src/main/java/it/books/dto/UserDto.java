package it.books.dto;

import java.io.Serializable; 
import it.books.dao.entity.Cart;

public class UserDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private Cart cart;

	public UserDto() {
	}

	public UserDto(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
