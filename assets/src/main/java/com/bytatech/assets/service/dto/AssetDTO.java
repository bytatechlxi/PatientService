package com.bytatech.assets.service.dto;

public class AssetDTO {

	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int serverId;
    public int objectId;    

    public String code;
    public String gmdncode;
    public String parentUid;
    public String description; 
    public String serialnumber;
    public double quantity;
    public String assetType;
    public String supplierUid;
    public java.util.Date purchaseDate;
    public double purchasePrice;
    public String receiptBy;
    public String purchaseDocuments;
    public String writeOffMethod;
    public int writeOffPeriod; 
    public String annuity;
    public String serviceuid;
    public String characteristics;
    public String accountingCode;
    public String gains; 
    public String losses; 
    public String residualValueHistory; 
    
    public java.util.Date loanDate;
    public double loanAmount;
    public String loanInterestRate;
    public String loanReimbursementPlan;
    public double loanReimbursementAmount; 
    public String loanComment;
    public String loanDocuments;
    public String nomenclature;
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
    public String comment11;
    public String comment12;
    public String comment13;
    public String comment14;
    public String comment15;
    public String comment16;
    public String comment17;
    public String comment18;
    public String comment19;
    public String comment20;
    
    public java.util.Date saleDate;
    public double saleValue;
    public String saleClient;
    
    public java.util.Date purchasePeriodBegin, purchasePeriodEnd;

    public AssetDTO(){
        serverId = -1;
        objectId = -1;

        code = "";
        gmdncode ="";
        parentUid = "";
        description = "";
        serialnumber = "";
        quantity = 1; // default
        assetType = "";
        supplierUid = "";
        purchaseDate = null;
        purchasePrice = 0;
        receiptBy = "";
        purchaseDocuments = "";
        writeOffMethod = "";
        writeOffPeriod = 0;
        annuity = "";
        characteristics = "";
        accountingCode = "";
        gains = "";
        losses = "";
        serviceuid="";
        residualValueHistory = "";
        
        loanDate = null;
        loanAmount = 0;
        loanInterestRate = ""; 
        loanReimbursementPlan = "";
        loanReimbursementAmount = 0;
        loanComment = "";
        loanDocuments = "";
        
        saleDate = null;
        saleValue = 0;
        saleClient = "";       
        nomenclature ="";
        comment1="";
        comment2="";
        comment3="";
        comment4="";
        comment5="";
        comment6="";
        comment7="";
        comment8="";
        comment9="";
        comment10="";
        comment11="";
        comment12="";
        comment13="";
        comment14="";
        comment15="";
        comment16="";
        comment17="";
        comment18="";
        comment19="";
        comment20="";
    }
}
