package com.catmaker.factory.abstractfactory;

/**
 * RouterProduct
 * 路由器产品接口
 *
 * @author chenhang
 * @date 2020/3/20 7:30
 */
public interface RouterProduct {
    void start();
    void shutdown();
    void openWifi();
    void closeWifi();
}
