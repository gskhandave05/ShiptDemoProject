package com.gk.shipt.ordersapi.repository;

import java.util.Date;
import java.util.List;

import com.gk.shipt.ordersapi.entity.Customer;
import com.gk.shipt.ordersapi.entity.OrderLine;
import com.gk.shipt.ordersapi.entity.Orders;
import com.gk.shipt.ordersapi.entity.Product;
import com.gk.shipt.ordersapi.entity.ProductCategory;
import com.gk.shipt.ordersapi.model.ProductsSaleReport;
import com.gk.shipt.ordersapi.model.PurchasedCategory;
import com.gk.shipt.ordersapi.model.SalesOrder;

public interface OrdersApiRepository {
	
	public List<Orders> findAllOrders();

	public Orders findOrder(Long id);

	public List<Customer> findAllCustomers();
	
	public Customer findCustomer(Long id);
	
	public List<Product> findAllProducts();
	
	public Product findProduct(Long id);
	
	public List<OrderLine> findAllOrderLines();
	
	public OrderLine findOrderLine(Long id);
	
	public List<ProductCategory> findAllCategories();
	
	public ProductCategory findProductCategory(Long id);
	
	public List<SalesOrder> findByCustomer(String city);
	
	public List<PurchasedCategory> findPurchasedCategory();
	
	public List<ProductsSaleReport> findProductsSaleReport(Date fromDate, Date toDate, String groupBy);

}
