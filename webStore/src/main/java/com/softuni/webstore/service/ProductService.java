package com.softuni.webstore.service;

import java.util.List;

import com.softuni.webstore.entity.Product;

public interface ProductService {
	public boolean addProduct(Product product);
	public boolean editProduct(Product product);
	public boolean deleteProduct(long id);
	public List<Product> searchByCriteria(String criteria, String value);
}
