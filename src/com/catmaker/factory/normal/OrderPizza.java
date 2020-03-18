package com.catmaker.factory.normal;

import com.catmaker.factory.pizza.CheesePizza;
import com.catmaker.factory.pizza.GreekPizza;
import com.catmaker.factory.pizza.PepperPizza;
import com.catmaker.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * OrderPizza
 *
 * @author chenhang
 * @date 2020/3/18 21:39
 */
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        // 订购披萨的类型
        String orderType;
        do {
            orderType = getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else if ("pepper".equals(orderType)) {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            } else {
                break;
            }

            // 输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input the type of pizza");
            String type = str.readLine();
            return type;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
