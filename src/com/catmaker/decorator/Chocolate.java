package com.catmaker.decorator;

/**
 * Chocolate
 * 具体的Decorator，在这里就是调味品
 *
 * @author chenhang
 * @date 2020/3/16 19:54
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDescription("巧克力");
        // 调味品的价格
        setPrice(3.0f);
    }
}
