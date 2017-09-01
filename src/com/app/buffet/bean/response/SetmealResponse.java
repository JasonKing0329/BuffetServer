package com.app.buffet.bean.response;

import com.app.buffet.bean.data.BaseHttpData;
import com.app.buffet.bean.data.SetMealGroup;
import com.app.buffet.bean.data.SetMealItem;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 描述: 套餐表
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 9:27
 */
public class SetmealResponse extends BaseHttpData {

    @SerializedName("setmealGroup")
    private List<SetMealGroup> setmealGroup;

    @SerializedName("setmealItem")
    private List<SetMealItem> setmealItem;

    public List<SetMealGroup> getSetmealGroup() {
        return setmealGroup;
    }

    public void setSetmealGroup(List<SetMealGroup> setmealGroup) {
        this.setmealGroup = setmealGroup;
    }

    public List<SetMealItem> getSetmealItem() {
        return setmealItem;
    }

    public void setSetmealItem(List<SetMealItem> setmealItem) {
        this.setmealItem = setmealItem;
    }
}
