package com.example.admin.eventbrite.model;

import com.google.gson.annotations.SerializedName;

public class Pagination{

	@SerializedName("page_number")
	private int pageNumber;

	@SerializedName("object_count")
	private int objectCount;

	@SerializedName("has_more_items")
	private boolean hasMoreItems;

	@SerializedName("page_count")
	private int pageCount;

	@SerializedName("page_size")
	private int pageSize;

	public void setPageNumber(int pageNumber){
		this.pageNumber = pageNumber;
	}

	public int getPageNumber(){
		return pageNumber;
	}

	public void setObjectCount(int objectCount){
		this.objectCount = objectCount;
	}

	public int getObjectCount(){
		return objectCount;
	}

	public void setHasMoreItems(boolean hasMoreItems){
		this.hasMoreItems = hasMoreItems;
	}

	public boolean isHasMoreItems(){
		return hasMoreItems;
	}

	public void setPageCount(int pageCount){
		this.pageCount = pageCount;
	}

	public int getPageCount(){
		return pageCount;
	}

	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}

	public int getPageSize(){
		return pageSize;
	}

	@Override
 	public String toString(){
		return 
			"Pagination{" + 
			"page_number = '" + pageNumber + '\'' + 
			",object_count = '" + objectCount + '\'' + 
			",has_more_items = '" + hasMoreItems + '\'' + 
			",page_count = '" + pageCount + '\'' + 
			",page_size = '" + pageSize + '\'' + 
			"}";
		}
}