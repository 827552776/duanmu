package com.louis.kitty.admin.model;

import java.util.Date;

public class AccessStock extends BaseModel {
    /**
     * 名称
     */
    private String name;

    /**
     * 类型
     */
    private String type;

    /**
     * 入库数量
     */
    private Long number;
    /**
     * 类型（出/入库）
     */
    private Long state;
    /**
     * 领用人
     */
    private String modeBy;
    /**
     * 领用方式
     */
    private String mode;
    /**
     * 出库时间
     */
    private Date outTime;
    /**
     * 入库时间
     */
    private Date intTime;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 出库数量
     */
    private Long outNumber;

    @Override
    public String toString() {
        return "AccessStock{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", number='" + number + '\'' +
                ", state='" + state + '\'' +
                ", modeBy='" + modeBy + '\'' +
                ", mode='" + mode + '\'' +
                ", outTime=" + outTime +
                ", intTime=" + intTime +
                ", remarks='" + remarks + '\'' +
                ", outNumber='" + outNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getModeBy() {
        return modeBy;
    }

    public void setModeBy(String modeBy) {
        this.modeBy = modeBy;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Date getIntTime() {
        return intTime;
    }

    public void setIntTime(Date intTime) {
        this.intTime = intTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(Long outNumber) {
        this.outNumber = outNumber;
    }
}
