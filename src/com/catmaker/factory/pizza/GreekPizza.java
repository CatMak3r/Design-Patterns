package com.catmaker.factory.pizza;

/**
 * GreekPizza
 *
 * @author chenhang
 * @date 2020/3/18 22:54
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
