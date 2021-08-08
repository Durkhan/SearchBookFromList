package com.example.bookfromlistapp.model;

import com.google.gson.annotations.SerializedName;

public class Pdf{

	@SerializedName("isAvailable")
	private boolean isAvailable;

	public void setIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}

	public boolean isIsAvailable(){
		return isAvailable;
	}
}