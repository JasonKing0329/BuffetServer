package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 做法
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 9:36
 */
public class MethodBean extends BaseHttpData {

    @SerializedName("id")
    private long id;

    @SerializedName("itemId")
    private long itemId;

    @SerializedName("name")
    private String name;

    @SerializedName("makeFee")
    private double makeFee;

    /**
     * 制作费收费方式
     * 0不按数量收费
     * 1按数量收费
     */
    @SerializedName("feeType")
    private int feeType;

    @SerializedName("sequence")
    private int sequence;

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

    public double getMakeFee() {
        return makeFee;
    }

    public void setMakeFee(double makeFee) {
        this.makeFee = makeFee;
    }

    public int getFeeType() {
        return feeType;
    }

    public void setFeeType(int feeType) {
        this.feeType = feeType;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
