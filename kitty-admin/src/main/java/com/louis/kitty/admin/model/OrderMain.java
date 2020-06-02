package com.louis.kitty.admin.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class OrderMain {

    private String id;

    private String shuxing;

    private String createBy;

    private Date qianTime;

    private Date houTime;

    public Date getQianTime() {
        return qianTime;
    }

    public void setQianTime(Date qianTime) {
        this.qianTime = qianTime;
    }

    public Date getHouTime() {
        return houTime;
    }

    public void setHouTime(Date houTime) {
        this.houTime = houTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;

    private String lotNo;

    private String cust;

    private String mouldNm;

    private String quantity;

    private  String wareNo;

    public String getWareNo() {
        return wareNo;
    }

    public void setWareNo(String wareNo) {
        this.wareNo = wareNo;
    }

    public String getOutNo() {
        return outNo;
    }

    public void setOutNo(String outNo) {
        this.outNo = outNo;
    }

    private String outNo;

    public BigDecimal getGongshi() {
        return gongshi;
    }

    public void setGongshi(BigDecimal gongshi) {
        this.gongshi = gongshi;
    }

    private BigDecimal gongshi;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Date getKaipiaoTime() {
        return kaipiaoTime;
    }

    public void setKaipiaoTime(Date kaipiaoTime) {
        this.kaipiaoTime = kaipiaoTime;
    }

    private Date kaipiaoTime;

    private String billNo;

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

    private String sts;

    public Date getWareDate() {
        return wareDate;
    }

    public void setWareDate(Date wareDate) {
        this.wareDate = wareDate;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public Integer getWareNum() {
        return wareNum;
    }

    public void setWareNum(Integer wareNum) {
        this.wareNum = wareNum;
    }

    public Integer getOutNum() {
        return outNum;
    }

    public void setOutNum(Integer outNum) {
        this.outNum = outNum;
    }
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date wareDate;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date outDate;

    private Integer wareNum;

    private Integer outNum;

    private Integer isWare;

    public Integer getIsOut() {
        return isOut;
    }

    public void setIsOut(Integer isOut) {
        this.isOut = isOut;
    }

    private Integer isOut;

    public Integer getIsWare() {
        return isWare;
    }

    public void setIsWare(Integer isWare) {
        this.isWare = isWare;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShuxing() {
        return shuxing;
    }

    public void setShuxing(String shuxing) {
        this.shuxing = shuxing;
    }
}
