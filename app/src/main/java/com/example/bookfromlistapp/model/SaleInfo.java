package com.example.bookfromlistapp.model;

import com.google.gson.annotations.SerializedName;

public class SaleInfo{

	@SerializedName("country")
	private String country;

	@SerializedName("isEbook")
	private boolean isEbook;

	@SerializedName("saleability")
	private String saleability;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setIsEbook(boolean isEbook){
		this.isEbook = isEbook;
	}

	public boolean isIsEbook(){
		return isEbook;
	}

	public void setSaleability(String saleability){
		this.saleability = saleability;
	}

	public String getSaleability(){
		return saleability;
	}
}