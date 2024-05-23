package com.rk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.model.Product;
import com.rk.repo.ProductRepository;
import com.rk.service.IProductService;
@Service
public class ProductServiceImpl  implements IProductService{
     @Autowired
	private ProductRepository repo;

	@Override
	public Integer saveProduct(Product p) {
	   p.setPrdDis(p.getPrdCost()*0.8);
	   p.setPrdGst(p.getPrdCost()*0.18);
	   repo.save(p);
		return p.getPrdId();
	}

	@Override
	public List<Product> getAllProducts() {
	List<Product> list=repo.findAll();
		return list;
	}
	  
	
}
