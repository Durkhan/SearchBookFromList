package com.example.bookfromlistapp.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class VolumeInfo{

	@SerializedName("industryIdentifiers")
	private List<IndustryIdentifiersItem> industryIdentifiers;

	@SerializedName("pageCount")
	private int pageCount;

	@SerializedName("printType")
	private String printType;

	@SerializedName("readingModes")
	private ReadingModes readingModes;

	@SerializedName("previewLink")
	private String previewLink;

	@SerializedName("canonicalVolumeLink")
	private String canonicalVolumeLink;

	@SerializedName("language")
	private String language;

	@SerializedName("title")
	private String title;

	@SerializedName("imageLinks")
	private ImageLinks imageLinks;

	@SerializedName("subtitle")
	private String subtitle;

	@SerializedName("panelizationSummary")
	private PanelizationSummary panelizationSummary;

	@SerializedName("publishedDate")
	private String publishedDate;

	@SerializedName("categories")
	private List<String> categories;

	@SerializedName("maturityRating")
	private String maturityRating;

	@SerializedName("allowAnonLogging")
	private boolean allowAnonLogging;

	@SerializedName("contentVersion")
	private String contentVersion;

	@SerializedName("authors")
	private List<String> authors;

	@SerializedName("infoLink")
	private String infoLink;

	@SerializedName("publisher")
	private String publisher;

	@SerializedName("description")
	private String description;

	public void setIndustryIdentifiers(List<IndustryIdentifiersItem> industryIdentifiers){
		this.industryIdentifiers = industryIdentifiers;
	}

	public List<IndustryIdentifiersItem> getIndustryIdentifiers(){
		return industryIdentifiers;
	}

	public void setPageCount(int pageCount){
		this.pageCount = pageCount;
	}

	public int getPageCount(){
		return pageCount;
	}

	public void setPrintType(String printType){
		this.printType = printType;
	}

	public String getPrintType(){
		return printType;
	}

	public void setReadingModes(ReadingModes readingModes){
		this.readingModes = readingModes;
	}

	public ReadingModes getReadingModes(){
		return readingModes;
	}

	public void setPreviewLink(String previewLink){
		this.previewLink = previewLink;
	}

	public String getPreviewLink(){
		return previewLink;
	}

	public void setCanonicalVolumeLink(String canonicalVolumeLink){
		this.canonicalVolumeLink = canonicalVolumeLink;
	}

	public String getCanonicalVolumeLink(){
		return canonicalVolumeLink;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setImageLinks(ImageLinks imageLinks){
		this.imageLinks = imageLinks;
	}

	public ImageLinks getImageLinks(){
		return imageLinks;
	}

	public void setSubtitle(String subtitle){
		this.subtitle = subtitle;
	}

	public String getSubtitle(){
		return subtitle;
	}

	public void setPanelizationSummary(PanelizationSummary panelizationSummary){
		this.panelizationSummary = panelizationSummary;
	}

	public PanelizationSummary getPanelizationSummary(){
		return panelizationSummary;
	}

	public void setPublishedDate(String publishedDate){
		this.publishedDate = publishedDate;
	}

	public String getPublishedDate(){
		return publishedDate;
	}

	public void setCategories(List<String> categories){
		this.categories = categories;
	}

	public List<String> getCategories(){
		return categories;
	}

	public void setMaturityRating(String maturityRating){
		this.maturityRating = maturityRating;
	}

	public String getMaturityRating(){
		return maturityRating;
	}

	public void setAllowAnonLogging(boolean allowAnonLogging){
		this.allowAnonLogging = allowAnonLogging;
	}

	public boolean isAllowAnonLogging(){
		return allowAnonLogging;
	}

	public void setContentVersion(String contentVersion){
		this.contentVersion = contentVersion;
	}

	public String getContentVersion(){
		return contentVersion;
	}

	public void setAuthors(List<String> authors){
		this.authors = authors;
	}

	public List<String> getAuthors(){
		return authors;
	}

	public void setInfoLink(String infoLink){
		this.infoLink = infoLink;
	}

	public String getInfoLink(){
		return infoLink;
	}

	public void setPublisher(String publisher){
		this.publisher = publisher;
	}

	public String getPublisher(){
		return publisher;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}
}