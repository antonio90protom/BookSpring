package it.books.dao.entity;

import java.util.Set; 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "titolo", nullable = false)
	private String titolo;

	@Column(name = "autore", nullable = false)
	private String autore;

	@Column(name = "isbn", nullable = false)
	private String isbn;

	@Lob
	@Column(name = "img", nullable = true)
	private String img;

	@Column(name = "prezzo", nullable = false)
	private double prezzo;

	@Column(name = "trama", nullable = true)
	private String trama;

	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private Set<Product> products;

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