package com.example.admin.eventbrite.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class EventCollection{

	@SerializedName("pagination")
	private Pagination pagination;

	@SerializedName("location")
	private Location location;

	@SerializedName("events")
	private List<EventsItem> events;

	public void setPagination(Pagination pagination){
		this.pagination = pagination;
	}

	public Pagination getPagination(){
		return pagination;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	public void setEvents(List<EventsItem> events){
		this.events = events;
	}

	public List<EventsItem> getEvents(){
		return events;
	}

	@Override
 	public String toString(){
		return 
			"EventCollection{" + 
			"pagination = '" + pagination + '\'' + 
			",location = '" + location + '\'' + 
			",events = '" + events + '\'' + 
			"}";
		}
}