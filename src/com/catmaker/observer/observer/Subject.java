package com.catmaker.observer.observer;

/**
 * 让WeatherData来实现
 *
 * @author chenhang
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void nofityObserver();
}
