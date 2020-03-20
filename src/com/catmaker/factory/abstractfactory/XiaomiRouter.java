package com.catmaker.factory.abstractfactory;

/**
 * XiaomiRouter
 *
 * @author chenhang
 * @date 2020/3/20 7:33
 */
public class XiaomiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开小米WiFi");
    }

    @Override
    public void closeWifi() {
        System.out.println("关闭小米WiFi");
    }
}
