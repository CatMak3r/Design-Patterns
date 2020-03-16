package com.catmaker.decorator;

/**
 * 咖啡类
 * @author chenhang
 */
public class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrice();
    }
}
