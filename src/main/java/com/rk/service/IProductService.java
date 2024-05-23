package com.rk.service;

import java.util.List;

import com.rk.model.Product;

public interface IProductService {
      Integer saveProduct(Product p);
      List<Product> getAllProducts();
}
