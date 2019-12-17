package com.louis.kitty.admin.model;

import java.math.BigDecimal;

/**
 * 材料库存
 */
public class MaterialManage extends BaseModel{
    /**
     * 材料名称
     */
    private String name;
    /**
     * 模具名称
     */
    private String mName;
    /**
     * 库存数量
     */
    private Long number;
    /**
     * 尺寸
     */
    private String size;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 对账状态
     */
    private String state;
    /**
     * 出库数量
     */
    private Long outNumber;
    /**
     * 入库数量
     */
    private Long intNumber;
    /**
     * 预警状态
     */
    private int type;
    /**
     * 预警数量
     */
    private int typeNumber;
    /**
     * 发票号
     */
    private String invoice;
    /**
     * 备注信息
     */
    private String remarks;

    @Override
    public String toString() {
        return "MaterialManage{" +
                "name='" + name + '\'' +
                ", mName='" + mName + '\'' +
                ", number=" + number +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", state='" + state + '\'' +
                ", outNumber=" + outNumber +
                ", intNumber=" + intNumber +
                ", type=" + type +
                ", typeNumber=" + typeNumber +
                ", invoice='" + invoice + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(Long outNumber) {
        this.outNumber = outNumber;
    }

    public Long getIntNumber() {
        return intNumber;
    }

    public void setIntNumber(Long intNumber) {
        this.intNumber = intNumber;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(int typeNumber) {
        this.typeNumber = typeNumber;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
