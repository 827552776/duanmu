package com.louis.kitty.admin.model;

import java.util.Date;

public class Ware {
    private String id;

    private Date wareDate;

    public String getWareNo() {
        return wareNo;
    }

    public void setWareNo(String wareNo) {
        this.wareNo = wareNo;
    }

    private String wareNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getWareDate() {
        return wareDate;
    }

    public void setWareDate(Date wareDate) {
        this.wareDate = wareDate;
    }

    public Integer getWareNum() {
        return wareNum;
    }

    public void setWareNum(Integer wareNum) {
        this.wareNum = wareNum;
    }

    private Integer wareNum;
}
