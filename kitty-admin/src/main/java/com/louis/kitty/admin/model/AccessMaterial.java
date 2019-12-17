package com.louis.kitty.admin.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccessMaterial extends BaseModel{
    /**
     * 材料名称
     */
    private String name;
    /**
     * 入库数量
     */
    private Long intNumber;
    /**
     * 入库时间
     */
    private Date intTime;
    /**
     * 模具用出库数量
     */
    private Long number;
    /**
     * 模具用出库时间
     */
    private Date trTime;
    /**
     * 外协厂家名称
     */
    private String waixie;
    /**
     * 外协出库时间
     */
    private Date wxTime;
    /**
     * 外协入库时间
     */
    private Date wxInt;
    /**
     * 外协数量
     */
    private Long wxNumber;
    /**
     * 外协价格
     */
    private BigDecimal wxPrice;
    /**
     * 状态（0-3）
     */
    private String type;
    /**
     * 备注（外协工艺）
     */
    private String remarks;

    @Override
    public String toString() {
        return "AccessMaterial{" +
                "name='" + name + '\'' +
                ", intNumber=" + intNumber +
                ", intTime=" + intTime +
                ", number=" + number +
                ", trTime=" + trTime +
                ", waixie='" + waixie + '\'' +
                ", wxTime=" + wxTime +
                ", wxInt=" + wxInt +
                ", wxNumber=" + wxNumber +
                ", wxPrice=" + wxPrice +
                ", type='" + type + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIntNumber() {
        return intNumber;
    }

    public void setIntNumber(Long intNumber) {
        this.intNumber = intNumber;
    }

    public Date getIntTime() {
        return intTime;
    }

    public void setIntTime(Date intTime) {
        this.intTime = intTime;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Date getTrTime() {
        return trTime;
    }

    public void setTrTime(Date trTime) {
        this.trTime = trTime;
    }

    public String getWaixie() {
        return waixie;
    }

    public void setWaixie(String waixie) {
        this.waixie = waixie;
    }

    public Date getWxTime() {
        return wxTime;
    }

    public void setWxTime(Date wxTime) {
        this.wxTime = wxTime;
    }

    public Date getWxInt() {
        return wxInt;
    }

    public void setWxInt(Date wxInt) {
        this.wxInt = wxInt;
    }

    public Long getWxNumber() {
        return wxNumber;
    }

    public void setWxNumber(Long wxNumber) {
        this.wxNumber = wxNumber;
    }

    public BigDecimal getWxPrice() {
        return wxPrice;
    }

    public void setWxPrice(BigDecimal wxPrice) {
        this.wxPrice = wxPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
