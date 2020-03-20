package com.catmaker.factory.method;

import com.catmaker.factory.car.Car;
import com.catmaker.factory.car.WuLing;

/**
 * WuLingFactory
 *
 * @author chenhang
 * @date 2020/3/20 7:11
 */
public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
