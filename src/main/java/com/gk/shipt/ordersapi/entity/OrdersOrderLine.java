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
public class OrdersOrderLine {

	@Column(name="orders_id")
	private Long ordersId;
	@Column(name = "order_line_id")
	private Long orderLineId;
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
	 * @return the orderLineId
	 */
	public Long getOrderLineId() {
		return orderLineId;
	}
	/**
	 * @param orderLineId the orderLineId to set
	 */
	public void setOrderLineId(Long orderLineId) {
		this.orderLineId = orderLineId;
	}
	
	
}
