package com.catmaker.factory.abstractfactory;

/**
 * HuaweiFactory
 *
 * @author chenhang
 * @date 2020/3/20 7:39
 */
public class HuaweiFactory implements ProductFactory {
    @Override
    public PhoneProduct producePhone() {
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct produceRouter() {
        return new HuaweiRouter();
    }
}
