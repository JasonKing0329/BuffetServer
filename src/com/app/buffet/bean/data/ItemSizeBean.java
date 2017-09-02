package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 规格
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 9:33
 */
public class ItemSizeBean extends BaseHttpData {

    @SerializedName("id")
    private long id;

    @SerializedName("itemId")
    private long itemId;

    @SerializedName("name")
    private String name;

    /**
     * 是否默认规格 0否 1是
     */
    @SerializedName("isDefault")
    private int isDefault;

    @SerializedName("price")
    private double price;

    @SerializedName("sequence")
    private int sequence;

    @SerializedName("sellout")
    private int sellout;

    @SerializedName("limit")
    private double limit = -1;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getSellout() {
        return sellout;
    }

    public void setSellout(int sellout) {
        this.sellout = sellout;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
