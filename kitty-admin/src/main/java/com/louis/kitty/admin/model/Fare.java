package com.louis.kitty.admin.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Fare extends BaseModel{
    private String fId;

    private String fareType;

    private String descri;

    private String logis;

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
