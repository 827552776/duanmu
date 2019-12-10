package com.louis.kitty.admin.model;

import java.util.Date;

public class OrderMain extends BaseModel{


    private String lotNo;

    private String cust;

    private String mouldNm;

    private String quantity;



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

    public String getMouldNm() {
        return mouldNm;
    }

    public void setMouldNm(String mouldNm) {
        this.mouldNm = mouldNm;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(String ordNo) {
        this.ordNo = ordNo;
    }

    public String getOrdSts() {
        return ordSts;
    }

    public void setOrdSts(String ordSts) {
        this.ordSts = ordSts;
    }

    private String company;

    private String dispatchNo;

    private String buyMaterial;

    private String remarks;

    private String flag;

    private String ordNo;

    private String ordSts;

}
