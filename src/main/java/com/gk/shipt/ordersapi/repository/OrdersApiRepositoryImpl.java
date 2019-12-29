package com.gk.shipt.ordersapi.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.gk.shipt.ordersapi.entity.Customer;
import com.gk.shipt.ordersapi.entity.OrderLine;
import com.gk.shipt.ordersapi.entity.Orders;
import com.gk.shipt.ordersapi.entity.Product;
import com.gk.shipt.ordersapi.entity.ProductCategory;
import com.gk.shipt.ordersapi.model.ProductsSaleReport;
import com.gk.shipt.ordersapi.model.PurchasedCategory;
import com.gk.shipt.ordersapi.model.SalesOrder;

@Repository
public class OrdersApiRepositoryImpl implements OrdersApiRepository{

	@PersistenceContext
	EntityManager em;

	@Value("20")
	private int batchSize;

	@Override
	public List<Orders> findAllOrders() {
		TypedQuery<Orders> query = em.createNamedQuery("Orders.findAll", Orders.class);
		return query.getResultList();
	}

	@Override
	public Orders findOrder(Long id) {
		return em.find(Orders.class, id);
	}

	@Override
	public List<Customer> findAllCustomers() {
		TypedQuery<Customer> query = em.createNamedQuery("Customer.findAll", Customer.class);
		return query.getResultList();
	}

	@Override
	public Customer findCustomer(Long id) {
		return em.find(Customer.class, id);
	}

	@Override
	public List<Product> findAllProducts() {
		TypedQuery<Product> query = em.createNamedQuery("Product.findAll", Product.class);
		return query.getResultList();
	}

	@Override
	public Product findProduct(Long id) {
		return em.find(Product.class, id);

	}

	@Override
	public List<OrderLine> findAllOrderLines() {
		TypedQuery<OrderLine> query = em.createNamedQuery("OrderLine.findAll", OrderLine.class);
		return query.getResultList();
	}

	@Override
	public OrderLine findOrderLine(Long id) {
		return em.find(OrderLine.class, id);

	}

	@Override
	public List<ProductCategory> findAllCategories() {
		TypedQuery<ProductCategory> query = em.createNamedQuery("ProductCategory.findAll", ProductCategory.class);
		return query.getResultList();
	}

	@Override
	public ProductCategory findProductCategory(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalesOrder> findByCustomer(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchasedCategory> findPurchasedCategory() {
		Query query = em.createNativeQuery("select c.id as customer_id,c.first_name as customer_first_name,pc.id as category_id,pc.category_name,sum(ol.qty_ordered) as numbers_purchased from orders o,orders_customer oc,customer c, orders_order_line ool, order_line ol, product p, product_category_product pcp, product_category pc where o.id = oc.orders_id and c.id = oc.customer_id and o.id = ool.orders_id and ol.id = ool.order_line_id and p.id = ol.product_id and pcp.product_id = p.id and pc.id = pcp.product_category_id group by c.id,pc.id");
		@SuppressWarnings("unchecked")
		List<Object[]> results = query.getResultList();
		List<PurchasedCategory> reports = new ArrayList<>();
		for (Object[] result : results) {
			PurchasedCategory report = new PurchasedCategory();
			report.setCustomerId(Long.valueOf(result[0].toString()));
			report.setFirstName(result[1].toString());
			report.setCategoryId(Long.valueOf(result[2].toString()));
			report.setCategoryName(result[3].toString());
			report.setNumberPurchased(Double.valueOf(result[4].toString()));
			reports.add(report);
		}
		return reports;
	}

	@Override
	public List<ProductsSaleReport> findProductsSaleReport(Date fromDate, Date toDate, String groupBy) {
		return null;
	}
	
	

}
