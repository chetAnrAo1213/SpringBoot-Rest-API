package com.boot.queryhints;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="QueryHints")
public class QueryHintsModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	private String city;
	private String country;
	private String countryCode;
	private String continent;
	
	@CreatedBy
	private String createdBy;
	@LastModifiedBy
	private String modifiedBy;
	@CreatedDate
	private String createDate;
	@LastModifiedDate
	private String lastModifiedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	@Override
	public String toString() {
		return "QueryHintsModel [id=" + id + ", city=" + city + ", country=" + country + ", countryCode=" + countryCode
				+ ", continent=" + continent + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy
				+ ", createDate=" + createDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	

}
