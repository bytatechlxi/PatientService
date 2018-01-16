package com.bytatech.assets.service.dto;

public class MaintenancePlanDTO {

private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int serverId;
    public int objectId;    

    public String name; // 255
    public String assetUID; // 50
    public java.util.Date startDate;
    public java.util.Date endDate;
    public String frequency;
    public String operator; // 255
    public String planManager; // 255
    public String instructions; // text
    public String type;
    public String comment1;
    public String comment2;
    public String comment3;
    public String comment4;
    public String comment5;
    public String comment6;
    public String comment7;
    public String comment8;
    public String comment9;
    public String comment10;
}
