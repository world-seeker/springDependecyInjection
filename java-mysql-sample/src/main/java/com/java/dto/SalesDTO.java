package com.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalesDTO {
	    private int id;
	    private String description;
	    private double total;
	    
	    @JsonProperty("product")
	    private ProductDTO product;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public ProductDTO getProduct() {
			return product;
		}

		public void setProduct(ProductDTO product) {
			this.product = product;
		}

	    // Getters and setters
	}
	
	


