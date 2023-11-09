package com.java.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java.dto.ProductDTO;
import com.java.dto.SalesDTO;
import com.java.entity.Sale;
import com.java.service.SalesService;

@CrossOrigin( "*" )
@RestController
public class SalesController
{
    
private final SalesService salesService;

public SalesController( @Autowired SalesService salesService )
{
    this.salesService = salesService;
}

@GetMapping("/sales/{id}")
public ResponseEntity<SalesDTO> getSale(@PathVariable int id) {
    Sale sale = salesService.getSale(id);
    if (sale != null) {
        SalesDTO saleDTO = convertToSaleDTO(sale);
        return ResponseEntity.ok(saleDTO);
    } else {
        return ResponseEntity.notFound().build();
    }
}

@GetMapping("/sales")
public List<SalesDTO> getAllSales() {
    List<Sale> sales = salesService.getAllSales();
    List<SalesDTO> saleDTOs = new ArrayList<>();

    for (Sale sale : sales) {
        saleDTOs.add(convertToSaleDTO(sale));
    }

    return saleDTOs;
}


private SalesDTO convertToSaleDTO(Sale sale) {
    SalesDTO saleDTO = new SalesDTO();
    saleDTO.setId(sale.getId());
    saleDTO.setDescription(sale.getDescription());
    saleDTO.setTotal(sale.getTotal());

    ProductDTO productDTO = new ProductDTO();
    productDTO.setId(sale.getProduct().getId());
    productDTO.setName(sale.getProduct().getName());
    productDTO.setDescription(sale.getProduct().getDescription());
    productDTO.setPrice(sale.getProduct().getPrice());

    saleDTO.setProduct(productDTO);

    return saleDTO;
}


}
