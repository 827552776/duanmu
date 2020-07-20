package com.louis.kitty.admin.model;

import java.math.BigInteger;
import java.util.Date;

public class WaiXie extends BaseModel{
    /**
     * 模具名称
     */
    private String mould;
    /**
     * 业务
     */
    private String work;
    /**
     * 数量
     */
    private BigInteger number;
    /**
     * 单位
     */
    private String company;
    /**
     * 价格
     */
    private Double price;
    /**
     * 开始时间
     */
    private Date startDate;
    /**
     * 结束时间
     */
    private Date endDate;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 外协单位
     */
    private String name;
    /**
     * 前时间
     */
    private Date qianTime;
    /**
     * 后时间
     */
    private Date houTime;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getMould() {
        return mould;
    }

    public void setMould(String mould) {
        this.mould = mould;
    }

    public BigInteger getNumber() {
        return number;
    }

    public void setNumber(BigInteger number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
