package it.books.dao.entity;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column (name = "usernameFK")
	private String usernameFK;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	private Set<Product> products;

	
	//usernamefk è la colonna che fa da fk sul db
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usernameFK", insertable = false, updatable = false)
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

}