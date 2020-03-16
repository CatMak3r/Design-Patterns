package com.catmaker.decorator;

/**
 * Decorator, 装饰者
 *
 * @author chenhang
 * @date 2020/3/16 19:45
 */
public class Decorator extends Drink {
    private Drink obj;

    /**
     * 构造器将装饰者与被装饰者组合在一起
     * @param obj
     */
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice()是获得自己的价格，obj.cost()是获得被装饰者的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDescription() {
        return description + "（" + getPrice() + "）&& " + obj.getDescription();
    }
}
