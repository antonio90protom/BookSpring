package it.books.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends AbstractEntity {
  
	private static final long serialVersionUID = 1380987461009450438L;

	@Column(name = "idcartFK", nullable = false)
	private Integer idcartFK;

	@Column(name = "idbookFK", nullable = false)
	private Integer idbookFK;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idcartFK", insertable = false, updatable = false)
	private Cart cart;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idbookFK", insertable = false, updatable = false)
	private Book book;

	public Integer getIdcartFK() {
		return idcartFK;
	}

	public void setIdcartFK(Integer idcartFK) {
		this.idcartFK = idcartFK;
	}

	public Integer getIdbookFK() {
		return idbookFK;
	}

	public void setIdbookFK(Integer idbookFK) {
		this.idbookFK = idbookFK;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
