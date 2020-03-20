package com.catmaker.factory.abstractfactory;

/**
 * PhoneProduct
 * 手机产品接口
 *
 * @author chenhang
 * @date 2020/3/20 7:29
 */
public interface PhoneProduct {
    void start();
    void shutdown();
    void call();
    void sendMsg();
}
