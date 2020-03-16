package com.catmaker.decorator;

/**
 * 饮料类，所有类的超类
 * @author chenhang
 */
public abstract class Drink {
    /**
     * 描述
     */
    public String description;

    private float price = 0.0f;

    /**
     * 计算费用的方法，由子类实现
     * @return
     */
    public abstract float cost();

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
}
