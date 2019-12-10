package com.louis.kitty.admin.model;

import java.math.BigDecimal;
import java.util.Date;

public class Fare extends BaseModel{
    private Integer fId;

    private String fareType;

    private String descri;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
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

    private Date delvDate;
}
