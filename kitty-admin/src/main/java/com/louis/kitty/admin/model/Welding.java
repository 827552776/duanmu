package com.louis.kitty.admin.model;

import java.math.BigDecimal;
import java.util.Date;

public class Welding  extends BaseModel{
    /**
     * 焊材名称
     */
    private String name;
    /**
     * 来源
     */
    private String source;
    /**
     * 发货出库时间
     */
    private Date deTime;
    /**
     * 发货地址
     */
    private String deCompany;
    /**
     * 发货数量
     */
    private int deNumber;
    /**
     * 单位
     */
    private String company;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 入库时间
     */
    private Date intTime;
    /**
     * 自用出库数量
     */
    private Date outTime;
    /**
     *型号
     */
    private  String model;
    /**
     * 自用出库
     */
    private int reNumber;
    /**
     * 退回数
     */
    private int number;
    /**
     * 入库数量
     */
    private int sNumber;
    /**
     * 模具名称
     */
    private String mouldName;
    /**
     * 状态
     */
    private int type;
    /**
     * 分组名称
     */
    private String zu;
    /**
     * 备注信息
     */
    private String remarks;


    @Override
    public String toString() {
        return "Welding{" +
                "name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", deTime=" + deTime +
                ", deCompany='" + deCompany + '\'' +
                ", deNumber=" + deNumber +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", intTime=" + intTime +
                ", outTime=" + outTime +
                ", model='" + model + '\'' +
                ", reNumber=" + reNumber +
                ", number=" + number +
                ", sNumber=" + sNumber +
                ", mouldName='" + mouldName + '\'' +
                ", type=" + type +
                ", zu='" + zu + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeTime() {
        return deTime;
    }

    public void setDeTime(Date deTime) {
        this.deTime = deTime;
    }

    public String getDeCompany() {
        return deCompany;
    }

    public void setDeCompany(String deCompany) {
        this.deCompany = deCompany;
    }

    public int getDeNumber() {
        return deNumber;
    }

    public void setDeNumber(int deNumber) {
        this.deNumber = deNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getIntTime() {
        return intTime;
    }

    public void setIntTime(Date intTime) {
        this.intTime = intTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public int getReNumber() {
        return reNumber;
    }

    public void setReNumber(int reNumber) {
        this.reNumber = reNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    public String getMouldName() {
        return mouldName;
    }

    public void setMouldName(String mouldName) {
        this.mouldName = mouldName;
    }

    public String getZu() {
        return zu;
    }

    public void setZu(String zu) {
        this.zu = zu;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
