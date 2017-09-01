package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 菜品类别
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/23 14:25
 */
public class ItemClassBean extends BaseHttpData {

    @SerializedName("id")
    private long id;

    @SerializedName("sequence")
    private long sequence;

    @SerializedName("name")
    private String name;

    @SerializedName("imgurl")
    private String imgurl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
