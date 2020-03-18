package com.catmaker.factory.pizza;

/**
 * PepperPizza
 *
 * @author chenhang
 * @date 2020/3/18 23:05
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备胡椒披萨的原材料");
    }
}
