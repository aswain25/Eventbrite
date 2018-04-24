package com.example.admin.eventbrite.model;

import com.google.gson.annotations.SerializedName;

public class EventsItem{

	@SerializedName("shareable")
	private boolean shareable;

	@SerializedName("is_series_parent")
	private boolean isSeriesParent;

	@SerializedName("is_locked")
	private boolean isLocked;

	@SerializedName("logo_id")
	private String logoId;

	@SerializedName("is_series")
	private boolean isSeries;

	@SerializedName("description")
	private Description description;

	@SerializedName("source")
	private String source;

	@SerializedName("locale")
	private String locale;

	@SerializedName("capacity")
	private int capacity;

	@SerializedName("subcategory_id")
	private Object subcategoryId;

	@SerializedName("category_id")
	private Object categoryId;

	@SerializedName("organizer_id")
	private String organizerId;

	@SerializedName("format_id")
	private Object formatId;

	@SerializedName("logo")
	private Logo logo;

	@SerializedName("end")
	private End end;

	@SerializedName("currency")
	private String currency;

	@SerializedName("id")
	private String id;

	@SerializedName("venue_id")
	private String venueId;

	@SerializedName("created")
	private String created;

	@SerializedName("resource_uri")
	private String resourceUri;

	@SerializedName("start")
	private Start start;

	@SerializedName("version")
	private String version;

	@SerializedName("url")
	private String url;

	@SerializedName("privacy_setting")
	private String privacySetting;

	@SerializedName("hide_end_date")
	private boolean hideEndDate;

	@SerializedName("is_reserved_seating")
	private boolean isReservedSeating;

	@SerializedName("listed")
	private boolean listed;

	@SerializedName("tx_time_limit")
	private int txTimeLimit;

	@SerializedName("organization_id")
	private String organizationId;

	@SerializedName("capacity_is_custom")
	private boolean capacityIsCustom;

	@SerializedName("is_free")
	private boolean isFree;

	@SerializedName("name")
	private Name name;

	@SerializedName("hide_start_date")
	private boolean hideStartDate;

	@SerializedName("online_event")
	private boolean onlineEvent;

	@SerializedName("changed")
	private String changed;

	@SerializedName("status")
	private String status;

	public void setShareable(boolean shareable){
		this.shareable = shareable;
	}

	public boolean isShareable(){
		return shareable;
	}

	public void setIsSeriesParent(boolean isSeriesParent){
		this.isSeriesParent = isSeriesParent;
	}

	public boolean isIsSeriesParent(){
		return isSeriesParent;
	}

	public void setIsLocked(boolean isLocked){
		this.isLocked = isLocked;
	}

	public boolean isIsLocked(){
		return isLocked;
	}

	public void setLogoId(String logoId){
		this.logoId = logoId;
	}

	public String getLogoId(){
		return logoId;
	}

	public void setIsSeries(boolean isSeries){
		this.isSeries = isSeries;
	}

	public boolean isIsSeries(){
		return isSeries;
	}

	public void setDescription(Description description){
		this.description = description;
	}

	public Description getDescription(){
		return description;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setLocale(String locale){
		this.locale = locale;
	}

	public String getLocale(){
		return locale;
	}

	public void setCapacity(int capacity){
		this.capacity = capacity;
	}

	public int getCapacity(){
		return capacity;
	}

	public void setSubcategoryId(Object subcategoryId){
		this.subcategoryId = subcategoryId;
	}

	public Object getSubcategoryId(){
		return subcategoryId;
	}

	public void setCategoryId(Object categoryId){
		this.categoryId = categoryId;
	}

	public Object getCategoryId(){
		return categoryId;
	}

	public void setOrganizerId(String organizerId){
		this.organizerId = organizerId;
	}

	public String getOrganizerId(){
		return organizerId;
	}

	public void setFormatId(Object formatId){
		this.formatId = formatId;
	}

	public Object getFormatId(){
		return formatId;
	}

	public void setLogo(Logo logo){
		this.logo = logo;
	}

	public Logo getLogo(){
		return logo;
	}

	public void setEnd(End end){
		this.end = end;
	}

	public End getEnd(){
		return end;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setVenueId(String venueId){
		this.venueId = venueId;
	}

	public String getVenueId(){
		return venueId;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setResourceUri(String resourceUri){
		this.resourceUri = resourceUri;
	}

	public String getResourceUri(){
		return resourceUri;
	}

	public void setStart(Start start){
		this.start = start;
	}

	public Start getStart(){
		return start;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setPrivacySetting(String privacySetting){
		this.privacySetting = privacySetting;
	}

	public String getPrivacySetting(){
		return privacySetting;
	}

	public void setHideEndDate(boolean hideEndDate){
		this.hideEndDate = hideEndDate;
	}

	public boolean isHideEndDate(){
		return hideEndDate;
	}

	public void setIsReservedSeating(boolean isReservedSeating){
		this.isReservedSeating = isReservedSeating;
	}

	public boolean isIsReservedSeating(){
		return isReservedSeating;
	}

	public void setListed(boolean listed){
		this.listed = listed;
	}

	public boolean isListed(){
		return listed;
	}

	public void setTxTimeLimit(int txTimeLimit){
		this.txTimeLimit = txTimeLimit;
	}

	public int getTxTimeLimit(){
		return txTimeLimit;
	}

	public void setOrganizationId(String organizationId){
		this.organizationId = organizationId;
	}

	public String getOrganizationId(){
		return organizationId;
	}

	public void setCapacityIsCustom(boolean capacityIsCustom){
		this.capacityIsCustom = capacityIsCustom;
	}

	public boolean isCapacityIsCustom(){
		return capacityIsCustom;
	}

	public void setIsFree(boolean isFree){
		this.isFree = isFree;
	}

	public boolean isIsFree(){
		return isFree;
	}

	public void setName(Name name){
		this.name = name;
	}

	public Name getName(){
		return name;
	}

	public void setHideStartDate(boolean hideStartDate){
		this.hideStartDate = hideStartDate;
	}

	public boolean isHideStartDate(){
		return hideStartDate;
	}

	public void setOnlineEvent(boolean onlineEvent){
		this.onlineEvent = onlineEvent;
	}

	public boolean isOnlineEvent(){
		return onlineEvent;
	}

	public void setChanged(String changed){
		this.changed = changed;
	}

	public String getChanged(){
		return changed;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"EventsItem{" + 
			"shareable = '" + shareable + '\'' + 
			",is_series_parent = '" + isSeriesParent + '\'' + 
			",is_locked = '" + isLocked + '\'' + 
			",logo_id = '" + logoId + '\'' + 
			",is_series = '" + isSeries + '\'' + 
			",description = '" + description + '\'' + 
			",source = '" + source + '\'' + 
			",locale = '" + locale + '\'' + 
			",capacity = '" + capacity + '\'' + 
			",subcategory_id = '" + subcategoryId + '\'' + 
			",category_id = '" + categoryId + '\'' + 
			",organizer_id = '" + organizerId + '\'' + 
			",format_id = '" + formatId + '\'' + 
			",logo = '" + logo + '\'' + 
			",end = '" + end + '\'' + 
			",currency = '" + currency + '\'' + 
			",id = '" + id + '\'' + 
			",venue_id = '" + venueId + '\'' + 
			",created = '" + created + '\'' + 
			",resource_uri = '" + resourceUri + '\'' + 
			",start = '" + start + '\'' + 
			",version = '" + version + '\'' + 
			",url = '" + url + '\'' + 
			",privacy_setting = '" + privacySetting + '\'' + 
			",hide_end_date = '" + hideEndDate + '\'' + 
			",is_reserved_seating = '" + isReservedSeating + '\'' + 
			",listed = '" + listed + '\'' + 
			",tx_time_limit = '" + txTimeLimit + '\'' + 
			",organization_id = '" + organizationId + '\'' + 
			",capacity_is_custom = '" + capacityIsCustom + '\'' + 
			",is_free = '" + isFree + '\'' + 
			",name = '" + name + '\'' + 
			",hide_start_date = '" + hideStartDate + '\'' + 
			",online_event = '" + onlineEvent + '\'' + 
			",changed = '" + changed + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}