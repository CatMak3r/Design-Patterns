package com.catmaker.factory.abstractfactory;

/**
 * XiaomiPhone
 *
 * @author chenhang
 * @date 2020/3/20 7:31
 */
public class XiaomiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendMsg() {
        System.out.println("小米手机发短信");
    }
}
