package com.catmaker.factory.method;

import com.catmaker.factory.car.Car;
import com.catmaker.factory.car.MoBai;

/**
 * MoBaiFactory
 *
 * @author chenhang
 * @date 2020/3/20 7:14
 */
public class MoBaiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
