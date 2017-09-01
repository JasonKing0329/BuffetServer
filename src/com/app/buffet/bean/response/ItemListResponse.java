package com.app.buffet.bean.response;

import com.app.buffet.bean.data.BaseHttpData;
import com.app.buffet.bean.data.ItemBean;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 描述: 菜品表
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 9:27
 */
public class ItemListResponse extends BaseHttpData {

    @SerializedName("itemList")
    private List<ItemBean> itemList;

    public List<ItemBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemBean> itemList) {
        this.itemList = itemList;
    }

}
