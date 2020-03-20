package com.catmaker.factory.car;

import com.catmaker.factory.car.Car;

/**
 * MoBai
 *
 * @author chenhang
 * @date 2020/3/20 7:13
 */
public class MoBai implements Car {
    @Override
    public void name() {
        System.out.println("摩拜单车");
    }
}
