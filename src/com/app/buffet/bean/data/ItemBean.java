package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 菜品品项
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/23 14:25
 */
public class ItemBean extends BaseHttpData {

    @SerializedName("id")
    private long id;

    @SerializedName("name")
    private String name;

    @SerializedName("itemClassId")
    private long itemClassId;

    @SerializedName("unitName")
    private String unitName;

    @SerializedName("imgurl")
    private String imgurl;

    @SerializedName("price")
    private double price;

    @SerializedName("priceVip")
    private double priceVip;

    /**
     * 限售数量
     * 不限售-1
     */
    @SerializedName("sellLimit")
    private double sellLimit = -1;

    /**
     * 沽清 0否 1是
     */
    @SerializedName("sellOut")
    private int sellOut;

    @SerializedName("sequence")
    private int sequence;

    /**
     * 0普通品项 1主套餐 2套餐明细
     */
    @SerializedName("setMealFlg")
    private int setMealFlg;

    /**
     * 做法单选多选
     * 0单选 1多选
     */
    @SerializedName("isMultiSelect")
    private int isMultiSelect;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getItemClassId() {
        return itemClassId;
    }

    public void setItemClassId(long itemClassId) {
        this.itemClassId = itemClassId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceVip() {
        return priceVip;
    }

    public void setPriceVip(double priceVip) {
        this.priceVip = priceVip;
    }

    public double getSellLimit() {
        return sellLimit;
    }

    public void setSellLimit(double sellLimit) {
        this.sellLimit = sellLimit;
    }

    public int getSellOut() {
        return sellOut;
    }

    public void setSellOut(int sellOut) {
        this.sellOut = sellOut;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getSetMealFlg() {
        return setMealFlg;
    }

    public void setSetMealFlg(int setMealFlg) {
        this.setMealFlg = setMealFlg;
    }

    public int getIsMultiSelect() {
        return isMultiSelect;
    }

    public void setIsMultiSelect(int isMultiSelect) {
        this.isMultiSelect = isMultiSelect;
    }
}
