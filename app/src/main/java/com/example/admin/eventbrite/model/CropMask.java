package com.example.admin.eventbrite.model;

import com.google.gson.annotations.SerializedName;

public class CropMask{

	@SerializedName("width")
	private int width;

	@SerializedName("top_left")
	private TopLeft topLeft;

	@SerializedName("height")
	private int height;

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setTopLeft(TopLeft topLeft){
		this.topLeft = topLeft;
	}

	public TopLeft getTopLeft(){
		return topLeft;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"CropMask{" + 
			"width = '" + width + '\'' + 
			",top_left = '" + topLeft + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}