package com.catmaker.factory.simple;

import com.catmaker.factory.simple.OrderPizza;

/**
 * PizzaStore
 * 披萨店。相当于一个客户端，发出订购
 *
 * @author chenhang
 * @date 2020/3/18 23:00
 */
public class PizzaStore {
    public static void main(String[] args) {
        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
