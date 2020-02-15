package it.books.dto;

import java.io.Serializable;
import it.books.dao.entity.Book;
import it.books.dao.entity.Cart;

public class ProductDto implements Serializable {
  
	private static final long serialVersionUID = -7042425030659743893L;
	
	private Integer id;
	private Integer idcartFK;
	private Integer idbookFK;
	private String titolo;
	private double prezzo;
	private Cart cart;
	private Book book;

	public ProductDto() {
	}

	public ProductDto(Integer id, Integer idcartFK, Integer idbookFK) {
		this.id = id;
		this.idcartFK = idcartFK;
		this.idbookFK = idbookFK;
	} 
	
	public ProductDto(Integer id, String titolo, double prezzo) { 
		this.id = id;
		this.titolo = titolo;
		this.prezzo = prezzo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
