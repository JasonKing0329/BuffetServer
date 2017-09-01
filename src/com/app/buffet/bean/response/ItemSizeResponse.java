package com.app.buffet.bean.response;

import com.app.buffet.bean.data.BaseHttpData;
import com.app.buffet.bean.data.ItemSizeBean;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 描述: 规格表
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 9:27
 */
public class ItemSizeResponse extends BaseHttpData {

    @SerializedName("itemSizeList")
    private List<ItemSizeBean> itemSizeList;

    public List<ItemSizeBean> getItemSizeList() {
        return itemSizeList;
    }

    public void setItemSizeList(List<ItemSizeBean> itemSizeList) {
        this.itemSizeList = itemSizeList;
    }
}
