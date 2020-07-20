package com.louis.kitty.admin.model;

public class ShenHe extends BaseModel{
    /**
     * 配件名称
     */
    private String name;
    /**
     * 类型
     */
    private String type;
    /**
     * 细分
     */
    private String xiType;
    /**
     * 数量
     */
    private Long number;
    /**
     * 状态
     */
    private int mn;
    /**
     * 价格
     */
    private Double price;
    /**
     * 备注
     */
    private String remarks;

    public int getMn() {
        return mn;
    }

    public void setMn(int mn) {
        this.mn = mn;
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

    public String getXiType() {
        return xiType;
    }

    public void setXiType(String xi_type) {
        this.xiType = xi_type;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
