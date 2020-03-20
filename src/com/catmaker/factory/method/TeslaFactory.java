package com.catmaker.factory.method;

import com.catmaker.factory.car.Car;
import com.catmaker.factory.car.Tesla;

/**
 * TeslaFactory
 *
 * @author chenhang
 * @date 2020/3/20 7:11
 */
public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
