package com.catmaker.factory.simple;

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
    /**
     * 定义一个简单工厂对象
     */
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    /**
     * 构造器
     * @param simpleFactory
     */
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        // 用户输入的
        String orderType = "";

        // 设置简单工厂对象
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            // 输出pizza信息
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
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
