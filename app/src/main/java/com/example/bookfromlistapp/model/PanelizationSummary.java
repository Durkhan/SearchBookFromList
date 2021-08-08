package com.example.bookfromlistapp.model;

import com.google.gson.annotations.SerializedName;

public class PanelizationSummary{

	@SerializedName("containsImageBubbles")
	private boolean containsImageBubbles;

	@SerializedName("containsEpubBubbles")
	private boolean containsEpubBubbles;

	public void setContainsImageBubbles(boolean containsImageBubbles){
		this.containsImageBubbles = containsImageBubbles;
	}

	public boolean isContainsImageBubbles(){
		return containsImageBubbles;
	}

	public void setContainsEpubBubbles(boolean containsEpubBubbles){
		this.containsEpubBubbles = containsEpubBubbles;
	}

	public boolean isContainsEpubBubbles(){
		return containsEpubBubbles;
	}
}