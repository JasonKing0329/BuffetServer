package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 宣传图
 * <p/>作者：景阳
 * <p/>创建时间: 2017/9/1 8:51
 */
public class PromoteImageBean {

    @SerializedName("seq")
    private int seq;

    @SerializedName("url")
    private String url;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
