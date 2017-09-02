package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 限量
 * <p/>作者：景阳
 * <p/>创建时间: 2017/9/2 8:49
 */
public class ItemLimitBean {

    @SerializedName("id")
    private long id;

    @SerializedName("sizeId")
    private long sizeId;

    @SerializedName("limit")
    private long limit;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSizeId() {
        return sizeId;
    }

    public void setSizeId(long sizeId) {
        this.sizeId = sizeId;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }
}
