package com.example.demoJpa.dto;

import javax.persistence.Column;
//In this case, ProductDTO is same as ENtity
public class ProductDTO {

	private Integer prodId;
	private String prodName;
	private Double price;
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
