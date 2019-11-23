package com.louis.kitty.admin.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDispa extends BaseModel {
    private String dispatchNo;
    private String dispaNo;
    private String category;
    private String supplier;
    private String contractNo;
    private Date dispaMakeTime;
    private String useUnit;
    private String  productNo;
    private String markNo;
    private String flag;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getDispatchNo() {
        return dispatchNo;
    }

    public void setDispatchNo(String dispatchNo) {
        this.dispatchNo = dispatchNo;
    }

    public String getDispaNo() {
        return dispaNo;
    }

    public void setDispaNo(String dispaNo) {
        this.dispaNo = dispaNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Date getDispaMakeTime() {
        return dispaMakeTime;
    }

    public void setDispaMakeTime(Date dispaMakeTime) {
        this.dispaMakeTime = dispaMakeTime;
    }

    public String getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(String useUnit) {
        this.useUnit = useUnit;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getMarkNo() {
        return markNo;
    }

    public void setMarkNo(String markNo) {
        this.markNo = markNo;
    }

    public String getFrockNo() {
        return frockNo;
    }

    public void setFrockNo(String frockNo) {
        this.frockNo = frockNo;
    }

    public String getFrockNm() {
        return frockNm;
    }

    public void setFrockNm(String frockNm) {
        this.frockNm = frockNm;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getDispaQuantity() {
        return dispaQuantity;
    }

    public void setDispaQuantity(String dispaQuantity) {
        this.dispaQuantity = dispaQuantity;
    }

    public String getDispaContent() {
        return dispaContent;
    }

    public void setDispaContent(String dispaContent) {
        this.dispaContent = dispaContent;
    }

    public String getDispaBasis() {
        return dispaBasis;
    }

    public void setDispaBasis(String dispaBasis) {
        this.dispaBasis = dispaBasis;
    }

    public Date getDelvDate() {
        return delvDate;
    }

    public void setDelvDate(Date delvDate) {
        this.delvDate = delvDate;
    }

    public String getTechCon() {
        return techCon;
    }

    public void setTechCon(String techCon) {
        this.techCon = techCon;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMouldQuota() {
        return mouldQuota;
    }

    public void setMouldQuota(BigDecimal mouldQuota) {
        this.mouldQuota = mouldQuota;
    }

    public String getCompleteQuan() {
        return completeQuan;
    }

    public void setCompleteQuan(String completeQuan) {
        this.completeQuan = completeQuan;
    }

    public String getDispaRemarks() {
        return dispaRemarks;
    }

    public void setDispaRemarks(String dispaRemarks) {
        this.dispaRemarks = dispaRemarks;
    }

    private String frockNo;
    private String frockNm;
    private String units;
    private String dispaQuantity;
    private String dispaContent;
    private String dispaBasis;
    private Date delvDate;
    private String techCon;
    private String quality;
    private BigDecimal price;
    private BigDecimal  mouldQuota;
    private String completeQuan;
    private String dispaRemarks;
}
