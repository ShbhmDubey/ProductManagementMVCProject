package com.rk.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rk.model.Product;
import com.rk.service.IProductService;
@Controller
@RequestMapping("/product")
public class ProductController {
@Autowired
	private IProductService service;
@GetMapping("/register")
 public String showRegister() {
	 return "ProductRegister";
 }
@PostMapping("/save")
public String storeProduct(@ModelAttribute Product prd,Model model) {
	Integer id=service.saveProduct(prd);
	String str="Product is save inside database with id ---->"+id;
	model.addAttribute("data", str);
	return "ProductRegister";
}
@GetMapping("/all")
public String getAllProduct(Model model) {
	
	List<Product>list=service.getAllProducts();
	model.addAttribute("list", list);
	return "ProductData";
}
}
