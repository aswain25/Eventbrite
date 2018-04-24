package com.example.admin.eventbrite.model;

import com.google.gson.annotations.SerializedName;

public class Name{

	@SerializedName("html")
	private String html;

	@SerializedName("text")
	private String text;

	public void setHtml(String html){
		this.html = html;
	}

	public String getHtml(){
		return html;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
 	public String toString(){
		return 
			"Name{" + 
			"html = '" + html + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}