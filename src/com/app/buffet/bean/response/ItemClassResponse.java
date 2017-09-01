package com.app.buffet.bean.response;

import com.app.buffet.bean.data.BaseHttpData;
import com.app.buffet.bean.data.ItemClassBean;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 描述: 菜品小类表
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 9:27
 */
public class ItemClassResponse extends BaseHttpData {

    @SerializedName("itemClassList")
    private List<ItemClassBean> itemClassList;

    public List<ItemClassBean> getItemClassList() {
        return itemClassList;
    }

    public void setItemClassList(List<ItemClassBean> itemClassList) {
        this.itemClassList = itemClassList;
    }
}
