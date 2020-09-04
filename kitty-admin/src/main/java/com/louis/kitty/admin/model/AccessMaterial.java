package com.louis.kitty.admin.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccessMaterial extends BaseModel{
    /**
     * 材料名称
     */
    private String name;
    /**
     * 磨具名称
     */
    private String mName;
    /**
     * 批号
     */
    private String batch;
    /**
     * 派工号
     */
    private String dispatch;
    /**
     * 材质
     */
    private String texture;
    /**
     * 材料来源
     */
    private String com;
    /**
     * 单位
     */
    private String company;
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
     * 前时间
     */
    private Date qianTime;
    /**
     * 后时间
     */
    private Date houTime;
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
     * 外协总费用
     */
    private Double sumPrice;
    /**
     * 状态（0-3）
     */
    private String type;
    /**
     * 备注（外协工艺）
     */
    private String remarks;
    /**
     * 尺寸
     */
    private String size;
    /**
     * 入库类型
     */
    private String intType;
    @Override
    public String toString() {
        return "AccessMaterial{" +
                "name='" + name + '\'' +
                ", mName='" + mName + '\'' +
                ", batch='" + batch + '\'' +
                ", dispatch='" + dispatch + '\'' +
                ", texture='" + texture + '\'' +
                ", com='" + com + '\'' +
                ", company='" + company + '\'' +
                ", intNumber=" + intNumber +
                ", intTime=" + intTime +
                ", number=" + number +
                ", trTime=" + trTime +
                ", qianTime=" + qianTime +
                ", houTime=" + houTime +
                ", waixie='" + waixie + '\'' +
                ", wxTime=" + wxTime +
                ", wxInt=" + wxInt +
                ", wxNumber=" + wxNumber +
                ", wxPrice=" + wxPrice +
                ", sumPrice=" + sumPrice +
                ", type='" + type + '\'' +
                ", remarks='" + remarks + '\'' +
                ", size='" + size + '\'' +
                ", intType='" + intType + '\'' +
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

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDispatch() {
        return dispatch;
    }

    public void setDispatch(String dispatch) {
        this.dispatch = dispatch;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getCom() { return com; }

    public void setCom(String com) { this.com = com; }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
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

    public String getIntType() { return intType; }

    public void setIntType(String intType) { this.intType = intType; }
}
