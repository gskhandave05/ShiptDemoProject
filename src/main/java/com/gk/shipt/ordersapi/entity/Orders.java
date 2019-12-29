/**
 * 
 */
package com.gk.shipt.ordersapi.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author gauravkhandave
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Orders.findAll", query="SELECT u FROM Orders u ORDER BY u.orderedDate desc"),
	//@NamedQuery(name="WeatherReport.findByCity", query="SELECT u FROM WeatherReport u where u.city=:pCity ORDER BY u.timestamp"),
})
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Timestamp orderedDate;
	private Double orderTotal;
	private Integer numOfLines;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnoreProperties("customers")
	@JoinTable(name = "orders_customer", joinColumns = @JoinColumn(name = "orders_Id"), inverseJoinColumns = @JoinColumn(name = "customer_Id"))
	private Set<Customer> customers;
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JsonIgnore
	private Set<OrderLine> orderLine;
	private String deliveryInstructions;
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;

	/**
	 * @return the orderId
	 */
	public Long getOrderId() {
		return id;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(Long orderId) {
		this.id = orderId;
	}

	/**
	 * @return the orderedDate
	 */
	public Timestamp getOrderedDate() {
		return orderedDate;
	}

	/**
	 * @param orderedDate
	 *            the orderedDate to set
	 */
	public void setOrderedDate(Timestamp orderedDate) {
		this.orderedDate = orderedDate;
	}

	/**
	 * @return the orderTotal
	 */
	public Double getOrderTotal() {
		return orderTotal;
	}

	/**
	 * @param orderTotal
	 *            the orderTotal to set
	 */
	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	/**
	 * @return the numOfLines
	 */
	public Integer getNumOfLines() {
		return numOfLines;
	}

	/**
	 * @param numOfLines
	 *            the numOfLines to set
	 */
	public void setNumOfLines(Integer numOfLines) {
		this.numOfLines = numOfLines;
	}

	/**
	 * @return the customer
	 */
	public Set<Customer> getCustomer() {
		return customers;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Set<Customer> customer) {
		this.customers = customer;
	}

	/**
	 * @return the orderLine
	 */
	public Set<OrderLine> getOrderLine() {
		return orderLine;
	}

	/**
	 * @param orderLine
	 *            the orderLine to set
	 */
	public void setOrderLine(Set<OrderLine> orderLine) {
		this.orderLine = orderLine;
	}

	/**
	 * @return the deliveryInstructions
	 */
	public String getDeliveryInstructions() {
		return deliveryInstructions;
	}

	/**
	 * @param deliveryInstructions
	 *            the deliveryInstructions to set
	 */
	public void setDeliveryInstructions(String deliveryInstructions) {
		this.deliveryInstructions = deliveryInstructions;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderedDate=" + orderedDate + ", orderTotal=" + orderTotal + ", numOfLines="
				+ numOfLines + ", customers=" + customers + ", orderLine=" + orderLine + ", deliveryInstructions="
				+ deliveryInstructions + ", orderStatus=" + orderStatus + "]";
	}
	
	
}
