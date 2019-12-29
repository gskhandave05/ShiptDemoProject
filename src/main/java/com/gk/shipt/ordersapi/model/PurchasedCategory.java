package com.gk.shipt.ordersapi.model;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

/***
 * 
 * @author gauravkhandave
 *
 */
@Embeddable
public class PurchasedCategory {

	private Long customerId;
	private String firstName;
	private Long categoryId;
	private String categoryName;
	private Double numberPurchased;

	/**
	 * @return the customerId
	 */
	public Long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the categoryId
	 */
	public Long getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId
	 *            the categoryId to set
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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
	 * @return the numberPurchased
	 */
	public Double getNumberPurchased() {
		return numberPurchased;
	}

	/**
	 * @param numberPurchased
	 *            the numberPurchased to set
	 */
	public void setNumberPurchased(Double numberPurchased) {
		this.numberPurchased = numberPurchased;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PurchasedCategory [customerId=" + customerId + ", firstName=" + firstName + ", categoryId=" + categoryId
				+ ", categoryName=" + categoryName + ", numberPurchased=" + numberPurchased + "]";
	}

}
