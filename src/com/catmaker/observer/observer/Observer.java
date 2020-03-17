package com.catmaker.observer.observer;

/**
 * Observer
 * 观察者接口，由观察者来实现
 *
 * @author chenhang
 * @date 2020/3/17 21:04
 */
public interface Observer {
    /**
     * update
     * @param temperature
     * @param pressure
     * @param humidity
     */
    void update(float temperature, float pressure, float humidity);
}
