package com.catmaker.decorator;

/**
 * Soy
 *
 * @author chenhang
 * @date 2020/3/16 19:58
 */
public class Soy extends Decorator {
    /**
     * 构造器将装饰者与被装饰者组合在一起
     *
     * @param obj
     */
    public Soy(Drink obj) {
        super(obj);
        setDescription("豆浆");
        setPrice(1.5f);
    }
}
