package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 套餐明细
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/23 14:27
 */
public class SetMealItem {

    @SerializedName("setmealItemId")
    private long setmealItemId;

    @SerializedName("setmealGroupId")
    private long setmealGroupId;

    @SerializedName("itemId")
    private long itemId;

    /**
     *  -1没有规格
     */
    @SerializedName("sizeId")
    private long sizeId;

    /**
     * 是否必选
     * 0否 1是
     */
    @SerializedName("required")
    private int required;

    @SerializedName("defaultQty")
    private double defaultQty;

    @SerializedName("addPrice")
    private double addPrice;

    /**
     * 是否按数量加价 0否 1是
     */
    @SerializedName("addPriceByQty")
    private int addPriceByQty;

    /**
     * 最大数量限定 0不限定
     */
    @SerializedName("maxLimitQty")
    private double maxLimitQty;

    @SerializedName("sequence")
    private int sequence;

    public long getSetmealItemId() {
        return setmealItemId;
    }

    public void setSetmealItemId(long setmealItemId) {
        this.setmealItemId = setmealItemId;
    }

    public long getSetmealGroupId() {
        return setmealGroupId;
    }

    public void setSetmealGroupId(long setmealGroupId) {
        this.setmealGroupId = setmealGroupId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getSizeId() {
        return sizeId;
    }

    public void setSizeId(long sizeId) {
        this.sizeId = sizeId;
    }

    public int getRequired() {
        return required;
    }

    public void setRequired(int required) {
        this.required = required;
    }

    public double getDefaultQty() {
        return defaultQty;
    }

    public void setDefaultQty(double defaultQty) {
        this.defaultQty = defaultQty;
    }

    public double getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(double addPrice) {
        this.addPrice = addPrice;
    }

    public int getAddPriceByQty() {
        return addPriceByQty;
    }

    public void setAddPriceByQty(int addPriceByQty) {
        this.addPriceByQty = addPriceByQty;
    }

    public double getMaxLimitQty() {
        return maxLimitQty;
    }

    public void setMaxLimitQty(double maxLimitQty) {
        this.maxLimitQty = maxLimitQty;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}