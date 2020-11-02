package com.louis.kitty.admin.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 材料加外协运费实体类
 */
public class YunFei extends  BaseModel {
    /**
     * ID
     */
    private Long id;
    /**
     * 订单ID
     */
    private String fId;
    /**
     * 时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date aTime;
    /**
     * 运货路径
     */
    private String descri;
    /**
     * 模具
     */
    private String mould;
    /**
     * 数量
     */
    private Integer number;
    /**
     * 价格
     */
    private Double price;
    /**
     * 运货人
     */
    private String logis;
    /**
     * 材料
     */
    private String material;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 前时间
     */
    private Date qianTime;
    /**
     * 后时间
     */
    private Date houTime;

    @Override
    public Long getId() {return id; }

    @Override
    public void setId(Long id) { this.id = id; }

    public String getfId() { return fId; }

    public void setfId(String fId) { this.fId = fId; }

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

    public Date getaTime() {
        return aTime;
    }

    public void setaTime(Date aTime) {
        this.aTime = aTime;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getMould() {
        return mould;
    }

    public void setMould(String mould) {
        this.mould = mould;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLogis() {
        return logis;
    }

    public void setLogis(String logis) {
        this.logis = logis;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
