package com.gk.shipt.ordersapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gk.shipt.ordersapi.entity.Customer;
import com.gk.shipt.ordersapi.entity.OrderLine;
import com.gk.shipt.ordersapi.entity.Orders;
import com.gk.shipt.ordersapi.entity.Product;
import com.gk.shipt.ordersapi.entity.ProductCategory;
import com.gk.shipt.ordersapi.model.PurchasedCategory;
import com.gk.shipt.ordersapi.service.OrdersApiService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping("orders")
@Api(tags = "orders")
public class OrdersApiController {
	
	@Autowired
	OrdersApiService service;
	
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Find All Orders", notes = "Returns a list of orders in the app")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	@ResponseBody
	public List<Orders> listAllOrders() {
		return service.getAllOrders();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/products")
	@ApiOperation(value = "Find All Products", notes = "Returns a list of products in the app")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	@ResponseBody
	public List<Product> listAllProducts() {
		return service.getAllProducts();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/customers")
	@ApiOperation(value = "Find All Customers", notes = "Returns a list of customers in the app")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	@ResponseBody
	public List<Customer> listAllCustomers() {
		return service.getAllCustomers();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/productCategories")
	@ApiOperation(value = "Find All Product Categories", notes = "Returns a list of product categories in the app")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	@ResponseBody
	public List<ProductCategory> listAllCategories() {
		return service.getAllProductCategories();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/orderLines")
	@ApiOperation(value = "Find All Order Lines", notes = "Returns a list of order lines in the app")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	@ResponseBody
	public List<OrderLine> listAllOrderLines() {
		return service.getAllOrderLines();
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/purchasedCategories")
	@ApiOperation(value = "Find All categories purchased count", notes = "Returns a list of categories purchased count in the app")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	@ResponseBody
	public List<PurchasedCategory> fetchPurchasedCategoriesReport(){
		return service.getCategoriesPurchasedReport();
	}

}
