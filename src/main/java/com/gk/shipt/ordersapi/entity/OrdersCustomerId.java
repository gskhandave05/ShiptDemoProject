package com.gk.shipt.ordersapi.entity;

import java.io.Serializable;

public class OrdersCustomerId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long ordersId;
	private Long customerId;
	
	public OrdersCustomerId(){}
	
	public OrdersCustomerId(Long ordersId,Long customerId){
		this.ordersId = ordersId;
		this.customerId = customerId;
	}
	
}
