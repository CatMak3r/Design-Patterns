package com.catmaker.factory.abstractfactory;

/**
 * HuaweiPhone
 *
 * @author chenhang
 * @date 2020/3/20 7:32
 */
public class HuaweiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendMsg() {
        System.out.println("华为手机发短信");
    }
}
