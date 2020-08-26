package com.example.demoJpa.dto;

import javax.persistence.Column;
/*Data transfer Object(DTO) helps to tansfer data between
 * service and DAO(Data Access Object)
 */
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
