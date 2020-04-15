package com.louis.kitty.admin.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccessStock extends BaseModel {
    /**
     * 名称
     */
    private String name;

    /**
     * 类型
     */
    private String type;
    /**
     * 细分
     */
    private String xiType;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 金额
     */
    private Double sumPrice;
    /**
     * 入库数量
     */
    private Long number;
    /**
     * 类型（出/入库）
     */
    private Long state;
    /**
     * 领用人
     */
    private String modeBy;
    /**
     * 领用方式
     */
    private String mode;
    /**
     * 出库时间
     */
    private Date outTime;
    /**
     * 入库时间
     */
    private Date intTime;
    /**
     * 前时间
     */
    private Date qianTime;
    /**
     * 后时间
     */
    private Date houTime;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 出库数量
     */
    private Long outNumber;

    @Override
    public String toString() {
        return "AccessStock{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", xiType='" + xiType + '\'' +
                ", price=" + price +
                ", sumPrice=" + sumPrice +
                ", number=" + number +
                ", state=" + state +
                ", modeBy='" + modeBy + '\'' +
                ", mode='" + mode + '\'' +
                ", outTime=" + outTime +
                ", intTime=" + intTime +
                ", qianTime=" + qianTime +
                ", houTime=" + houTime +
                ", remarks='" + remarks + '\'' +
                ", outNumber=" + outNumber +
                '}';
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getXiType() {
        return xiType;
    }

    public void setXiType(String xiType) {
        this.xiType = xiType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getModeBy() {
        return modeBy;
    }

    public void setModeBy(String modeBy) {
        this.modeBy = modeBy;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Date getIntTime() {
        return intTime;
    }

    public void setIntTime(Date intTime) {
        this.intTime = intTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(Long outNumber) {
        this.outNumber = outNumber;
    }
}
