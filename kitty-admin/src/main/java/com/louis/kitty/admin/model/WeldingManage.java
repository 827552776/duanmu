package com.louis.kitty.admin.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 焊材库
 */
public class WeldingManage extends BaseModel {
    /**
     * 焊材名称
     */
    private String name;
    /**
     * 来源
     */
    private String source;
    /**
     * 型号
     */
    private String model;
    /**
     * 数量
     */
    private double number;
    /**
     * 单位
     */
    private String company;
    /**
     * 入库数量
     */
    private double intNumber;
    /**
     * 出库数量
     */
    private double outNumber;
    /**
     * 预警
     */
    private Long type;
    /**
     * 预警数量
     */
    private double typeNumber;
    /**
     * 实盘数
     */
    private double sureNumber;
    /**
     * 前时间
     */
    private Date qianTime;
    /**
     * 后时间
     */
    private Date houTime;
    /**
     * 差额
     */
    private double difference;
    /**
     * 备注
     */
    private String remarks;

    /**
     * 价格
     * @return
     */
    private BigDecimal price;

    @Override
    public String toString() {
        return "WeldingManage{" +
                "name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", model='" + model + '\'' +
                ", number=" + number +
                ", company='" + company + '\'' +
                ", intNumber=" + intNumber +
                ", outNumber=" + outNumber +
                ", type=" + type +
                ", typeNumber=" + typeNumber +
                ", sureNumber=" + sureNumber +
                ", qianTime=" + qianTime +
                ", houTime=" + houTime +
                ", difference=" + difference +
                ", remarks='" + remarks + '\'' +
                ", price=" + price +
                '}';
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getIntNumber() {
        return intNumber;
    }

    public void setIntNumber(double intNumber) {
        this.intNumber = intNumber;
    }

    public double getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(double outNumber) {
        this.outNumber = outNumber;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public double getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(double typeNumber) {
        this.typeNumber = typeNumber;
    }

    public double getSureNumber() {
        return sureNumber;
    }

    public void setSureNumber(double sureNumber) {
        this.sureNumber = sureNumber;
    }

    public double getDifference() {
        return difference;
    }

    public void setDifference(double difference) {
        this.difference = difference;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
