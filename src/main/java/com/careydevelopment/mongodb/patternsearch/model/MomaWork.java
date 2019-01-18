package com.careydevelopment.mongodb.patternsearch.model;

import java.util.List;

public class MomaWork {

	private boolean isHighlight;
	private boolean isPublicDomain;
	private String primaryImage;
	private List<String> additionalImages;
	private String artist;
	private String title;
	private String culture;
	private String period;
	private String dynasty;
	private String reign;
	private String date;
	private String id;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isHighlight() {
		return isHighlight;
	}
	public void setHighlight(boolean isHighlight) {
		this.isHighlight = isHighlight;
	}
	public boolean isPublicDomain() {
		return isPublicDomain;
	}
	public void setPublicDomain(boolean isPublicDomain) {
		this.isPublicDomain = isPublicDomain;
	}
	public String getPrimaryImage() {
		return primaryImage;
	}
	public void setPrimaryImage(String primaryImage) {
		this.primaryImage = primaryImage;
	}
	public List<String> getAdditionalImages() {
		return additionalImages;
	}
	public void setAdditionalImages(List<String> additionalImages) {
		this.additionalImages = additionalImages;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCulture() {
		return culture;
	}
	public void setCulture(String culture) {
		this.culture = culture;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getDynasty() {
		return dynasty;
	}
	public void setDynasty(String dynasty) {
		this.dynasty = dynasty;
	}
	public String getReign() {
		return reign;
	}
	public void setReign(String reign) {
		this.reign = reign;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
