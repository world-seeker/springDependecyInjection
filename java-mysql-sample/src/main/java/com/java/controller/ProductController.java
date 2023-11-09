package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java.entity.Product;
import com.java.service.SalesService;


@RestController
public class ProductController {
	
	private final SalesService salesService;

	public ProductController( @Autowired SalesService salesService )
	{
	    this.salesService = salesService;
	}
	
	@GetMapping("/product/{id}")
	public List<Product> getProducts(@PathVariable int id){
		return salesService.getProducts(id);
	}
	

}
