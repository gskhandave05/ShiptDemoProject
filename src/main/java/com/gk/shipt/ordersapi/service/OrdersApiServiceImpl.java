package com.gk.shipt.ordersapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.shipt.ordersapi.entity.Customer;
import com.gk.shipt.ordersapi.entity.OrderLine;
import com.gk.shipt.ordersapi.entity.Orders;
import com.gk.shipt.ordersapi.entity.Product;
import com.gk.shipt.ordersapi.entity.ProductCategory;
import com.gk.shipt.ordersapi.model.PurchasedCategory;
import com.gk.shipt.ordersapi.repository.OrdersApiRepository;

@Service
public class OrdersApiServiceImpl implements OrdersApiService{

	@Autowired
	OrdersApiRepository repository;

	
	@Override
	public List<Orders> getAllOrders() {
		return repository.findAllOrders();
	}

	@Override
	public List<Product> getAllProducts() {
		return repository.findAllProducts();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repository.findAllCustomers();
	}

	@Override
	public List<OrderLine> getAllOrderLines() {
		return repository.findAllOrderLines();
	}

	@Override
	public List<ProductCategory> getAllProductCategories() {
		return repository.findAllCategories();
	}

	@Override
	public List<PurchasedCategory> getCategoriesPurchasedReport() {
		return repository.findPurchasedCategory();
	}

}
