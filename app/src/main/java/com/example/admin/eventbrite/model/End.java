package com.example.admin.eventbrite.model;

import com.google.gson.annotations.SerializedName;

public class End{

	@SerializedName("utc")
	private String utc;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("local")
	private String local;

	public void setUtc(String utc){
		this.utc = utc;
	}

	public String getUtc(){
		return utc;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setLocal(String local){
		this.local = local;
	}

	public String getLocal(){
		return local;
	}

	@Override
 	public String toString(){
		return 
			"End{" + 
			"utc = '" + utc + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",local = '" + local + '\'' + 
			"}";
		}
}