package com.louis.kitty.admin.model;

public class Unqu extends BaseModel {
    private Integer fId;

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
