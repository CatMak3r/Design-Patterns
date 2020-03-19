package com.catmaker.factory.simple;

import com.catmaker.factory.pizza.CheesePizza;
import com.catmaker.factory.pizza.GreekPizza;
import com.catmaker.factory.pizza.PepperPizza;
import com.catmaker.factory.pizza.Pizza;

/**
 * SimpleFactory
 *
 * @author chenhang
 * @date 2020/3/19 22:35
 */
public class SimpleFactory {
    /**
     * 根据orderType返回对应的Pizza对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
