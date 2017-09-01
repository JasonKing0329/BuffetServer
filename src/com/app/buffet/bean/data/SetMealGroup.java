package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 套餐组
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/23 14:27
 */
public class SetMealGroup extends BaseHttpData {

    @SerializedName("setmealItemId")
    private long setmealItemId;

    @SerializedName("setmealGroupId")
    private long setmealGroupId;

    @SerializedName("name")
    private String name;

    @SerializedName("maxQty")
    private int maxQty;

    @SerializedName("minQty")
    private int minQty;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(int maxQty) {
        this.maxQty = maxQty;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
