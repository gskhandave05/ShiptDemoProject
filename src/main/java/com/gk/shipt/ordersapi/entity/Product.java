/**
 * 
 */
package com.gk.shipt.ordersapi.entity;

import java.math.BigDecimal;
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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author gauravkhandave
 *
 */

@Entity
@NamedQueries({
	@NamedQuery(name="Product.findAll", query="SELECT u FROM Product u"),
	//@NamedQuery(name="WeatherReport.findByCity", query="SELECT u FROM WeatherReport u where u.city=:pCity ORDER BY u.timestamp"),
})
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String productName;
	@ManyToMany(cascade=CascadeType.ALL)
	@JsonIgnoreProperties("category")
    @JoinTable(name="product_category_product",joinColumns=@JoinColumn(name="product_id"),inverseJoinColumns=@JoinColumn(name="product_category_id"))
	private Set<ProductCategory> category;
	// OnHand Qty is actual qty present in warehouse. This is subtracted when shipment is made
	private BigDecimal onHandQty;
	// This is when product is added to cart
	private BigDecimal reservedQty;
	// This is (onHand - reserved)
	private BigDecimal availableQty;
	// This is when order is complete and shipped
	private BigDecimal soldQuantity;
	private Double unitPrice;
	

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
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the category
	 */
	public Set<ProductCategory> getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(Set<ProductCategory> category) {
		this.category = category;
	}

	/**
	 * @return the unitPrice
	 */
	public Double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice
	 *            the unitPrice to set
	 */
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the onHandQty
	 */
	public BigDecimal getOnHandQty() {
		return onHandQty;
	}

	/**
	 * @param onHandQty the onHandQty to set
	 */
	public void setOnHandQty(BigDecimal onHandQty) {
		this.onHandQty = onHandQty;
	}

	/**
	 * @return the reservedQty
	 */
	public BigDecimal getReservedQty() {
		return reservedQty;
	}

	/**
	 * @param reservedQty the reservedQty to set
	 */
	public void setReservedQty(BigDecimal reservedQty) {
		this.reservedQty = reservedQty;
	}

	/**
	 * @return the availableQty
	 */
	public BigDecimal getAvailableQty() {
		return availableQty;
	}

	/**
	 * @param availableQty the availableQty to set
	 */
	public void setAvailableQty(BigDecimal availableQty) {
		this.availableQty = availableQty;
	}

	/**
	 * @return the soldQuantity
	 */
	public BigDecimal getSoldQuantity() {
		return soldQuantity;
	}

	/**
	 * @param soldQuantity the soldQuantity to set
	 */
	public void setSoldQuantity(BigDecimal soldQuantity) {
		this.soldQuantity = soldQuantity;
	}

}
