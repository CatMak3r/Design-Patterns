package com.catmaker.factory.pizza;

/**
 * CheesePizza
 *
 * @author chenhang
 * @date 2020/3/18 22:53
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨的原材料");
    }
}
