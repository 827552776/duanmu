package com.louis.kitty.admin.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Fare extends BaseModel{
    /**
     *  ID
     */
    private Long id;
    /**
     * 订单ID
     */
    private String fId;
    /**
     * 运费类型
     */
    private String fareType;
    /**
     * 材料名称
     */
    private String material;
    /**
     *  综合备注
     */
    private String remarks;
    /**
     * 运费产生过程
     */
    private String descri;
    /**
     * 拉货人/采购人
     */
    private String logis;

    @Override
    public Long getId() { return id; }

    @Override
    public void setId(Long id) { this.id = id; }

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

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDelvDate() {
        return delvDate;
    }

    public void setDelvDate(Date delvDate) {
        this.delvDate = delvDate;
    }

    private BigDecimal price;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date delvDate;

    public String getLogis() {
        return logis;
    }

    public void setLogis(String logis) {
        this.logis = logis;
    }
}
