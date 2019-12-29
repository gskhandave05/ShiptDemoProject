package com.gk.shipt.ordersapi.service;

import java.util.List;

import com.gk.shipt.ordersapi.entity.Customer;
import com.gk.shipt.ordersapi.entity.OrderLine;
import com.gk.shipt.ordersapi.entity.Orders;
import com.gk.shipt.ordersapi.entity.Product;
import com.gk.shipt.ordersapi.entity.ProductCategory;
import com.gk.shipt.ordersapi.model.PurchasedCategory;

public interface OrdersApiService {

	public List<Orders> getAllOrders();

	public List<Product> getAllProducts();

	public List<Customer> getAllCustomers();
	
	public List<OrderLine> getAllOrderLines();
	
	public List<ProductCategory> getAllProductCategories();
	
	public List<PurchasedCategory> getCategoriesPurchasedReport();

}
