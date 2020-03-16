package com.catmaker.decorator;

/**
 * Milk
 *
 * @author chenhang
 * @date 2020/3/16 19:57
 */
public class Milk extends Decorator {
    /**
     * 构造器将装饰者与被装饰者组合在一起
     *
     * @param obj
     */
    public Milk(Drink obj) {
        super(obj);
        setDescription("牛奶");
        setPrice(2.0f);
    }
}
