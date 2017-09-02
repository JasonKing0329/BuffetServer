package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: id bean
 * <p/>作者：景阳
 * <p/>创建时间: 2017/9/2 8:49
 */
public class IdBean {

    @SerializedName("id")
    private long id;

    public IdBean() {
    }

    public IdBean(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
