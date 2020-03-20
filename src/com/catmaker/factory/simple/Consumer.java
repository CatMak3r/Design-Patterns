package com.catmaker.factory.simple;

import com.catmaker.factory.car.Car;

/**
 * Consumer
 *
 * @author chenhang
 * @date 2020/3/20 6:55
 */
public class Consumer {
    public static void main(String[] args) {
        //1. 普通方式购买汽车
//        Car car = new WuLing();
//        Car car2 = new Tesla();

        // 如果车的创建过程很复杂，要设置很多参数，就应该使用工厂模式
        // 不用关心创建车的过程需要多少细节，需要什么细节
        //2. 使用工厂创建
        Car car = CarFactory.getCar("五菱");
        Car car2 = CarFactory.getCar("特斯拉");
        car.name();
        car2.name();
    }
}
