package com.softuni.webstore.service;

import java.math.BigDecimal;
import java.util.List;

import com.softuni.webstore.entity.Order;
import com.softuni.webstore.entity.OrderDetails;

public interface OrderService {
	public boolean addOrder(Order order);
	public boolean editOrder(Order order);
	public Order getOrderById(long id);
	public Order generateRefundOrder(Order originalOrder);
	public List<OrderDetails> generateRefundOrderDetails(Order originalOrder, Order refundOrder);
	public BigDecimal calculateTotalPrice(Order order);
	public int calculateTotalQuantity(Order order);
	public List<Order> searchOrderByCriteria(String criteria, String value);
	public List<String> validateOrder(Order order);
	public List<Order> getOrders();
}
