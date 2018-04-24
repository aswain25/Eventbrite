package com.example.admin.eventbrite.model;

import com.google.gson.annotations.SerializedName;

public class Logo{

	@SerializedName("aspect_ratio")
	private String aspectRatio;

	@SerializedName("original")
	private Original original;

	@SerializedName("crop_mask")
	private CropMask cropMask;

	@SerializedName("edge_color")
	private String edgeColor;

	@SerializedName("id")
	private String id;

	@SerializedName("url")
	private String url;

	@SerializedName("edge_color_set")
	private boolean edgeColorSet;

	public void setAspectRatio(String aspectRatio){
		this.aspectRatio = aspectRatio;
	}

	public String getAspectRatio(){
		return aspectRatio;
	}

	public void setOriginal(Original original){
		this.original = original;
	}

	public Original getOriginal(){
		return original;
	}

	public void setCropMask(CropMask cropMask){
		this.cropMask = cropMask;
	}

	public CropMask getCropMask(){
		return cropMask;
	}

	public void setEdgeColor(String edgeColor){
		this.edgeColor = edgeColor;
	}

	public String getEdgeColor(){
		return edgeColor;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setEdgeColorSet(boolean edgeColorSet){
		this.edgeColorSet = edgeColorSet;
	}

	public boolean isEdgeColorSet(){
		return edgeColorSet;
	}

	@Override
 	public String toString(){
		return 
			"Logo{" + 
			"aspect_ratio = '" + aspectRatio + '\'' + 
			",original = '" + original + '\'' + 
			",crop_mask = '" + cropMask + '\'' + 
			",edge_color = '" + edgeColor + '\'' + 
			",id = '" + id + '\'' + 
			",url = '" + url + '\'' + 
			",edge_color_set = '" + edgeColorSet + '\'' + 
			"}";
		}
}