package com.catmaker.decorator;

/**
 * CoffeeBar
 *
 * @author chenhang
 * @date 2020/3/16 19:59
 */
public class CoffeeBar {

    public static void main(String[] args) {
        // 装饰者模式下的订单：两份巧克力 + 一份牛奶的 LongBlack
        //1. 点一份 LongBlack
        Drink order = new LongBlack();
        System.out.println("描述：" + order.getDescription());
        System.out.println("费用：" + order.cost());

        //2. order加入一份牛奶
        order = new Milk(order);
        System.out.println("描述：" + order.getDescription());
        System.out.println("费用：" + order.cost());

        //3. order加入一份巧克力
        order = new Chocolate(order);
        System.out.println("描述：" + order.getDescription());
        System.out.println("费用：" + order.cost());

        //4. order再加入一份巧克力
        order = new Chocolate(order);
        System.out.println("描述：" + order.getDescription());
        System.out.println("费用：" + order.cost());

        System.out.println("---------------------------------------");
        Drink order2 = new DeCaf();
        System.out.println("描述：" + order2.getDescription());
        System.out.println("费用：" + order2.cost());

        //无因咖啡加入3杯牛奶2杯豆浆3份巧克力
        for (int i = 0; i < 3; i ++) {
            order2 = new Milk(order2);
        }
        for (int i = 0; i < 2; i ++) {
            order2 = new Soy(order2);
        }
        for (int i = 0; i < 3; i ++) {
            order2 = new Chocolate(order2);
        }
        System.out.println("描述：" + order2.getDescription());
        System.out.println("费用：" + order2.cost());
    }
}
