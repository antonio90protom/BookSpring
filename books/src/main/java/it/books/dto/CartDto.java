package it.books.dto;

import java.io.Serializable;
import java.util.Set;
import it.books.dao.entity.Product;
import it.books.dao.entity.User;

public class CartDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String usernameFK;
	private Set<Product> products;
	private User user;

	public CartDto() {
	}

	public CartDto(Integer id, String usernameFK) {
		this.id = id;
		this.usernameFK = usernameFK;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsernameFK() {
		return usernameFK;
	}

	public void setUsernameFK(String usernameFK) {
		this.usernameFK = usernameFK;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}