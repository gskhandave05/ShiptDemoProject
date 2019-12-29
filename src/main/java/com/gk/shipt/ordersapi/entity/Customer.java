/**
 * 
 */
package com.gk.shipt.ordersapi.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author gauravkhandave
 *
 */

@Entity
@NamedQueries({
	@NamedQuery(name="Customer.findAll", query="SELECT u FROM Customer u"),
	//@NamedQuery(name="WeatherReport.findByCity", query="SELECT u FROM WeatherReport u where u.city=:pCity ORDER BY u.timestamp"),
})
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String email;
	private Long contactNumber;
	@ManyToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JsonIgnoreProperties("orders")
    @JoinTable(name="orders_customer",joinColumns=@JoinColumn(name="customer_id"),inverseJoinColumns = @JoinColumn(name = "orders_id") )
	private Set<Orders> orders;

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
	 * @return the name
	 */
	public String getName() {
		return firstName;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		firstName = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the contactNumber
	 */
	public Long getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber
	 *            the contactNumber to set
	 */
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

}
