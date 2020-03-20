package com.catmaker.factory.simple;

import com.catmaker.factory.car.Car;
import com.catmaker.factory.car.Tesla;
import com.catmaker.factory.car.WuLing;

/**
 * CarFactory
 * 简单工厂模式（静态工厂模式）
 * 弊端：在扩展的时候，就必须修改代码
 *
 * @author chenhang
 * @date 2020/3/20 6:56
 */
public class CarFactory {
    public static Car getCar(String car) {
        if (car.equals("五菱")) {
            return new WuLing();
        } else if (car.equals("特斯拉")) {
            return new Tesla();
        } else {
            return null;
        }
    }
}
