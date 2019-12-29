package com.louis.kitty.admin.model;

import java.math.BigDecimal;

public class Unqu extends BaseModel {
    private Integer fId;

    private String craft;

    private String liable;

    public String getCraft() {
        return craft;
    }

    public void setCraft(String craft) {
        this.craft = craft;
    }

    public String getLiable() {
        return liable;
    }

    public void setLiable(String liable) {
        this.liable = liable;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private BigDecimal price;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getUnquCause() {
        return unquCause;
    }

    public void setUnquCause(String unquCause) {
        this.unquCause = unquCause;
    }

    private String unquCause;
}
