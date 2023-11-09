package com.java.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.java.entity.Product;
import com.java.entity.Sale;
import com.java.repository.ProductRepository;
import com.java.repository.SalesRepository;
import com.java.service.SalesService;

@Service
public class SalesServiceImpl implements SalesService
{
  private final SalesRepository salesRepository;
  private final ProductRepository productRepository;

  public SalesServiceImpl( SalesRepository salesRepository ,ProductRepository productRepository)
  {
      this.salesRepository = salesRepository;
      this.productRepository=productRepository;
  }
  
   @Override
   public Sale getSale( int id )
   {
     Optional<Sale> sale = salesRepository.findById( id );
     return sale.orElse( null );
   }

   @Override
   public List<Sale> getAllSales() {
       return salesRepository.findAll();
   }
   
   public List<Product> getProducts(int id){
	   return productRepository.findAll();
   }
   
   

   }