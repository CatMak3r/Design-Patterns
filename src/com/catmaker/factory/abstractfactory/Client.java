package com.catmaker.factory.abstractfactory;

/**
 * Client
 *
 * @author chenhang
 * @date 2020/3/20 7:40
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("==============小米系列产品==============");
        // 小米工厂
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        PhoneProduct phoneProduct = xiaomiFactory.producePhone();
        phoneProduct.call();
        phoneProduct.sendMsg();

        RouterProduct routerProduct = xiaomiFactory.produceRouter();
        routerProduct.openWifi();
        routerProduct.closeWifi();

        System.out.println("==============华为系列产品==============");
        // 小米工厂
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        phoneProduct = huaweiFactory.producePhone();
        phoneProduct.call();
        phoneProduct.sendMsg();

        routerProduct = huaweiFactory.produceRouter();
        routerProduct.openWifi();
        routerProduct.closeWifi();
    }
}
