package com.louis.kitty.admin.model;

import java.math.BigDecimal;
import java.util.List;

public class Parts extends BaseModel{


    private String fId;

    private String name;

    private String attribute;

    private Integer quantity;

    private String specs;

    private String modle;

    private String ask;

    private String inputValue;

    private String sts;

    private String st;

    private String isBuy;

    private String supplier;

    private String mouldNm;

    private String flow;

    private String applicant;

    private String dept;

    private String temPurch;

    private BigDecimal partPrice;

    private String buhege;

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    public String getCust() {
        return cust;
    }

    public void setCust(String cust) {
        this.cust = cust;
    }

    private String lotNo;

    private String cust;

    public String getIsPick() {
        return isPick;
    }

    public void setIsPick(String isPick) {
        this.isPick = isPick;
    }

    private String isPick;

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTemPurch() {
        return temPurch;
    }

    public void setTemPurch(String temPurch) {
        this.temPurch = temPurch;
    }

    private String budget;

    private String remarks;



    public String getMouldNm() {
        return mouldNm;
    }

    public void setMouldNm(String mouldNm) {
        this.mouldNm = mouldNm;
    }

    public String getDispatchNo() {
        return dispatchNo;
    }

    public void setDispatchNo(String dispatchNo) {
        this.dispatchNo = dispatchNo;
    }

    public String getBuyMaterial() {
        return buyMaterial;
    }

    public void setBuyMaterial(String buyMaterial) {
        this.buyMaterial = buyMaterial;
    }

    private String dispatchNo;

    private String buyMaterial;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(String isBuy) {
        this.isBuy = isBuy;
    }


    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public BigDecimal getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(BigDecimal partPrice) {
        this.partPrice = partPrice;
    }

    public String getBuhege() {
        return buhege;
    }

    public void setBuhege(String buhege) {
        this.buhege = buhege;
    }
}
