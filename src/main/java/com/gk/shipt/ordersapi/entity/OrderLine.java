/**
 * 
 */
package com.gk.shipt.ordersapi.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author gauravkhandave
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name="OrderLine.findAll", query="SELECT u FROM OrderLine u"),
	//@NamedQuery(name="WeatherReport.findByCity", query="SELECT u FROM WeatherReport u where u.city=:pCity ORDER BY u.timestamp"),
})
public class OrderLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnoreProperties("product")
	private Product product;
	private BigDecimal qtyOrdered;
	private BigDecimal amount;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the order
	 */
	/*
	 * public Order getOrder() { return order; }
	 */
	/**
	 * @param order
	 *            the order to set
	 */

	/*
	 * public void setOrder(Order order) { this.order = order; }
	 */
	/**
	 * @return the products
	 */
	public Product getProducts() {
		return product;
	}

	/**
	 * @param products
	 *            the products to set
	 */
	public void setProducts(Product product) {
		this.product = product;
	}

	/**
	 * @return the qtyOrdered
	 */
	public BigDecimal getQtyOrdered() {
		return qtyOrdered;
	}

	/**
	 * @param qtyOrdered
	 *            the qtyOrdered to set
	 */
	public void setQtyOrdered(BigDecimal qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
