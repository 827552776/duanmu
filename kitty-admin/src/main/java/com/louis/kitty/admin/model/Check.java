package com.louis.kitty.admin.model;

import java.math.BigDecimal;
import java.util.Date;

public class Check extends BaseModel{

    private String fId;

    private BigDecimal hanCai;

    private BigDecimal cai;

    private BigDecimal reCh;

    private BigDecimal waiWei;

    private BigDecimal waiGou;

    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    private String createBy;

    private Date lastUpdateTime;

    private String lastUpdateBy;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public BigDecimal getHanCai() {
        return hanCai;
    }

    public void setHanCai(BigDecimal hanCai) {
        this.hanCai = hanCai;
    }

    public BigDecimal getCai() {
        return cai;
    }

    public void setCai(BigDecimal caiLiao) {
        this.cai = caiLiao;
    }

    public BigDecimal getReCh() {
        return reCh;
    }

    public void setReCh(BigDecimal reCh) {
        this.reCh = reCh;
    }

    public BigDecimal getWaiWei() {
        return waiWei;
    }

    public void setWaiWei(BigDecimal waiWei) {
        this.waiWei = waiWei;
    }

    public BigDecimal getWaiGou() {
        return waiGou;
    }

    public void setWaiGou(BigDecimal waiGou) {
        this.waiGou = waiGou;
    }

    public BigDecimal getYunFei() {
        return yunFei;
    }

    public void setYunFei(BigDecimal yunFei) {
        this.yunFei = yunFei;
    }

    public BigDecimal getGongShi() {
        return gongShi;
    }

    public void setGongShi(BigDecimal gongShi) {
        this.gongShi = gongShi;
    }

    public BigDecimal getOthers() {
        return others;
    }

    public void setOthers(BigDecimal others) {
        this.others = others;
    }

    private BigDecimal yunFei;

    private BigDecimal gongShi;

    private BigDecimal others;
}
