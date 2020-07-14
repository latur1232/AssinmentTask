package com.as.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product_tab")
public class Product {

	@Id
	@Column(name = "product_id")
	@GeneratedValue(generator = "product")
	@GenericGenerator(name = "product", strategy = "increment")
	private Integer productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_Detail")
	private String productDetail;
	@Column(name = "product_ldate")
	private String productLounchdate;
	@Column(name = "product_enddate")
	private String producEnddate;

	public Product() {
		super();
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	public String getProductLounchdate() {
		return productLounchdate;
	}

	public void setProductLounchdate(String productLounchdate) {
		this.productLounchdate = productLounchdate;
	}

	public String getProducEnddate() {
		return producEnddate;
	}

	public void setProducEnddate(String producEnddate) {
		this.producEnddate = producEnddate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDetail=" + productDetail
				+ ", productLounchdate=" + productLounchdate + ", producEnddate=" + producEnddate + "]";
	}

}
