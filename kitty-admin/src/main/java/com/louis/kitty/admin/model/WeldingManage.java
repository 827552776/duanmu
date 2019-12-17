package com.louis.kitty.admin.model;

import java.math.BigDecimal;

/**
 * 焊材库
 */
public class WeldingManage extends BaseModel {
    /**
     * 焊材名称
     */
    private String name;
    /**
     * 数量
     */
    private Long number;
    /**
     * 单位
     */
    private String company;
    /**
     * 入库数量
     */
    private Long intNumber;
    /**
     * 出库数量
     */
    private Long outNumber;
    /**
     * 预警
     */
    private Long type;
    /**
     * 预警数量
     */
    private Long typeNumber;
    /**
     * 实盘数
     */
    private Long sureNumber;
    /**
     * 差额
     */
    private Long difference;
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
                ", number=" + number +
                ", company='" + company + '\'' +
                ", intNumber=" + intNumber +
                ", outNumber=" + outNumber +
                ", type=" + type +
                ", typeNumber=" + typeNumber +
                ", sureNumber=" + sureNumber +
                ", difference=" + difference +
                ", remarks='" + remarks + '\'' +
                ", price=" + price +
                '}';
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Long getIntNumber() {
        return intNumber;
    }

    public void setIntNumber(Long intNumber) {
        this.intNumber = intNumber;
    }

    public Long getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(Long outNumber) {
        this.outNumber = outNumber;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(Long typeNumber) {
        this.typeNumber = typeNumber;
    }

    public Long getSureNumber() {
        return sureNumber;
    }

    public void setSureNumber(Long sureNumber) {
        this.sureNumber = sureNumber;
    }

    public Long getDifference() {
        return difference;
    }

    public void setDifference(Long difference) {
        this.difference = difference;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
