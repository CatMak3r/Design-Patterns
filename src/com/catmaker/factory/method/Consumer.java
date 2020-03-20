package com.catmaker.factory.method;

import com.catmaker.factory.car.Car;
import com.catmaker.factory.car.MoBai;
import com.catmaker.factory.simple.CarFactory;

/**
 * Consumer
 *
 * @author chenhang
 * @date 2020/3/20 6:55
 */
public class Consumer {
    public static void main(String[] args) {
        Car car = new WuLingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
        Car car3 = new MoBai();
        car.name();
        car2.name();
        car3.name();
    }
}
