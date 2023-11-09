package com.java.service;

import java.util.List;

import com.java.entity.Product;
import com.java.entity.Sale;

public interface SalesService
{
    Sale getSale( int id );
    List<Sale> getAllSales();
    List<Product> getProducts(int id);
}