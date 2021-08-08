package com.example.bookfromlistapp.model;

import com.google.gson.annotations.SerializedName;

public class Epub{

	@SerializedName("isAvailable")
	private boolean isAvailable;

	public void setIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}

	public boolean isIsAvailable(){
		return isAvailable;
	}
}