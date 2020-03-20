package com.catmaker.factory.abstractfactory;

/**
 * HuaweiRouter
 *
 * @author chenhang
 * @date 2020/3/20 7:34
 */
public class HuaweiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("启动华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开华为WiFi");
    }

    @Override
    public void closeWifi() {
        System.out.println("关闭华为WiFi");
    }
}
