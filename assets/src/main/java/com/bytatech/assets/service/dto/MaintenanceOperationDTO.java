package com.bytatech.assets.service.dto;

public class MaintenanceOperationDTO {

	 private int id;
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int serverId;
	    public int objectId;    

	    public String maintenanceplanUID;
	    public java.util.Date date;
	    public String operator; 
	    public String supplier; 
		public String result; 
	    public String comment; 
	    public java.util.Date nextDate;
	    
	    
	    public java.util.Date periodPerformedBegin;
	    public java.util.Date periodPerformedEnd;
}
