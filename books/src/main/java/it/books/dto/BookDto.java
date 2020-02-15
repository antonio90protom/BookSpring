package it.books.dto;

import java.io.Serializable;
import java.util.Set;
import it.books.dao.entity.Product;

public class BookDto implements Serializable {

	private static final long serialVersionUID = 2941576444951099049L;

	private Integer id;
	private String titolo;
	private String autore;
	private String isbn;
	private String img;
	private double prezzo;
	private String trama;
	private Set<Product> products;

	public BookDto() {
	}

	public BookDto(Integer id, String titolo, String autore, String isbn, String img, double prezzo, String trama) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.isbn = isbn;
		this.img = img;
		this.prezzo = prezzo;
		this.trama = trama;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getTrama() {
		return trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
