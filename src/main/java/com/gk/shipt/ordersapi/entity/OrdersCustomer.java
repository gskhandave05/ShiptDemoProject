/**
 * 
 */
package com.gk.shipt.ordersapi.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author gauravkhandave
 *
 */
@Embeddable
public class OrdersCustomer {

	@Column(name="orders_id")
	private Long ordersId;
	@Column(name="customer_id")
	private Long customerId;
	/**
	 * @return the ordersId
	 */
	public Long getOrdersId() {
		return ordersId;
	}
	/**
	 * @param ordersId the ordersId to set
	 */
	public void setOrdersId(Long ordersId) {
		this.ordersId = ordersId;
	}
	/**
	 * @return the customerId
	 */
	public Long getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	
}
