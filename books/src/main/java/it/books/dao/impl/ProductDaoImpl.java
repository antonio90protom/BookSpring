package it.books.dao.impl;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional; 
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import it.book.dao.ProductRepository;
import it.books.dao.entity.Book;
import it.books.dao.entity.Product; 
import it.books.dto.ProductDto;

@Repository
public class ProductDaoImpl implements ProductRepository {

	@PersistenceContext
	EntityManager em;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	@Transactional
	public ProductDto insert(ProductDto product) {
		em.persist(modelMapper.map(product, Product.class));
		return product;
	}

	@Override
	@Transactional
	public ProductDto delete(Integer id) {
		Product product = em.find(Product.class, id);
		em.remove(product);
		return modelMapper.map(product, ProductDto.class);

	}

	@Override
	public List<ProductDto> getProducts(Integer idcartFK) {
		CriteriaBuilder criteria = em.getCriteriaBuilder();
		CriteriaQuery<ProductDto> query = criteria.createQuery(ProductDto.class);
		Root<Product> root = query.from(Product.class);
		Join<Product, Book> pb = root.join("book");
		query.where(criteria.equal(root.get("idcartFK"), idcartFK));
		query.select(criteria.construct(ProductDto.class, root.get("id"), pb.get("titolo"), pb.get("prezzo")));
		TypedQuery<ProductDto> result = em.createQuery(query);
		return result.getResultList();

	}

	@Override
	@Transactional
	public void deleteAll(Integer idcartFK) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaDelete<Product> query = criteriaBuilder.createCriteriaDelete(Product.class);
		Root<Product> root = query.from(Product.class);
		query.where(criteriaBuilder.equal(root.get("idcartFK"), idcartFK));
		int result = em.createQuery(query).executeUpdate();
		 
	}

	@Override
	public void Sum(Integer idcartFK) {
		CriteriaBuilder criteria = em.getCriteriaBuilder();
		CriteriaQuery<BigDecimal> query = criteria.createQuery(BigDecimal.class);
		Root<Product> root = query.from(Product.class);
		Join<Product, Book> cb = root.join("book");
		query.where(criteria.equal(root.get("idcartFK"), idcartFK));
		query.select(criteria.sum(cb.get("prezzo").as(BigDecimal.class)));
		TypedQuery<BigDecimal> typedQuery = em.createQuery(query);
		BigDecimal sum = typedQuery.getSingleResult();
		System.out.println(sum);
	}

}
