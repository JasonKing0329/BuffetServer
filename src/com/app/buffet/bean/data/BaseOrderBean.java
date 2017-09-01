package com.app.buffet.bean.data;

/**
 * 描述: order表的数据实体
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 15:56
 */
public class BaseOrderBean {

    private long id;
    private long itemId;
    private long sizeId;
    private double number;
    private double totalPrice;
    private double addPrice;
    private int setMealFlg;

    /**
     * 所属套餐的订单id
     */
    private long parentId;

    private String methods;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getSizeId() {
        return sizeId;
    }

    public void setSizeId(long sizeId) {
        this.sizeId = sizeId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(double addPrice) {
        this.addPrice = addPrice;
    }

    public int getSetMealFlg() {
        return setMealFlg;
    }

    public void setSetMealFlg(int setMealFlg) {
        this.setMealFlg = setMealFlg;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }
}
