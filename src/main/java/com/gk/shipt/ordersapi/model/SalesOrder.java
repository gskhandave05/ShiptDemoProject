package com.gk.shipt.ordersapi.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.gk.shipt.ordersapi.entity.Product;

public class SalesOrder {
	
	private Long orderId;
	private Date orderedDate;
	private List<Product> products;
	private String customerName;
	private BigDecimal qtyOrdered;
	private BigDecimal lineAmount;
	private String orderStatus;
	private BigDecimal orderTotal;
	
}
