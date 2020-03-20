package com.catmaker.factory.abstractfactory;

/**
 * XiaomiFactory
 *
 * @author chenhang
 * @date 2020/3/20 7:38
 */
public class XiaomiFactory implements ProductFactory {
    @Override
    public PhoneProduct producePhone() {
        return new XiaomiPhone();
    }

    @Override
    public RouterProduct produceRouter() {
        return new XiaomiRouter();
    }
}
