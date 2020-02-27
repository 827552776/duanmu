package com.louis.kitty.admin.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Help extends BaseModel{
    private String fId;

    private String work;

    public String getHelpQuan() {
        return helpQuan;
    }

    public void setHelpQuan(String helpQuan) {
        this.helpQuan = helpQuan;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    private String helpNm;

    private String helpQuan;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date payDate;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getHelpNm() {
        return helpNm;
    }

    public void setHelpNm(String helpNm) {
        this.helpNm = helpNm;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHelpRemarks() {
        return helpRemarks;
    }

    public void setHelpRemarks(String helpRemarks) {
        this.helpRemarks = helpRemarks;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startDate;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endDate;

    private String price;

    private String helpRemarks;
}
