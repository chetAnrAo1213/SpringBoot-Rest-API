package com.boot.paginationwithsorting;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaginationModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	private String productName;
	private String productId;
	private String productCost;
	private String productDiscount;

	@CreatedBy
	private String createdBy;
	@CreatedDate
	private String createdDate;
	@LastModifiedDate
	private String modifiedDate;
	@LastModifiedBy
	private String lastModifiedBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductCost() {
		return productCost;
	}
	public void setProductCost(String productCost) {
		this.productCost = productCost;
	}
	public String getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(String productDiscount) {
		this.productDiscount = productDiscount;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public PaginationModel( String productName, String productId, String productCost, String productDiscount,
			String createdBy, String createdDate, String modifiedDate, String lastModifiedBy) {
		super();
	
		this.productName = productName;
		this.productId = productId;
		this.productCost = productCost;
		this.productDiscount = productDiscount;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.lastModifiedBy = lastModifiedBy;
	}
	public PaginationModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PaginationModel [id=" + id + ", productName=" + productName + ", productId=" + productId
				+ ", productCost=" + productCost + ", productDiscount=" + productDiscount + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", lastModifiedBy="
				+ lastModifiedBy + "]";
	}
	
	
	
	

}
