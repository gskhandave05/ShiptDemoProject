package com.gk.shipt.ordersapi.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIgnore;

/***
 * 
 * @author gauravkhandave
 *
 *         Version : 1.0.0
 * 
 *         This is ProductCategory Entity for ORM mapping.
 */

@Entity
@NamedQueries({
	@NamedQuery(name="ProductCategory.findAll", query="SELECT u FROM ProductCategory u"),
	//@NamedQuery(name="WeatherReport.findByCity", query="SELECT u FROM WeatherReport u where u.city=:pCity ORDER BY u.timestamp"),
})
public class ProductCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String categoryName;
	@ManyToMany(cascade=CascadeType.ALL)
	@JsonIgnore
    @JoinTable(name="product_category_product",joinColumns=@JoinColumn(name="product_category_id"),inverseJoinColumns=@JoinColumn(name="product_id"))
	private Set<Product> product;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName
	 *            the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the product
	 */
	public Set<Product> getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Set<Product> product) {
		this.product = product;
	}

}
