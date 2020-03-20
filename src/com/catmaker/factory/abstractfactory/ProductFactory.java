package com.catmaker.factory.abstractfactory;

/**
 * ProductFactory
 * 抽象产品工厂
 *
 * @author chenhang
 * @date 2020/3/20 7:36
 */
public interface ProductFactory {
    /**
     * 生产手机
     * @return
     */
    PhoneProduct producePhone();

    /**
     * 生产路由器
     * @return
     */
    RouterProduct produceRouter();
}
