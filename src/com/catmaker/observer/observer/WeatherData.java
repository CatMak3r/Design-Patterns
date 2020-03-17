package com.catmaker.observer.observer;

import java.util.ArrayList;

/**
 * WeatherData
 * 核心类
 * 1. 包含最新的天气情况信息
 * 2. 含有观察者集合，使用ArrayList管理
 * 3. 当数据有更新时，就主动调用ArrayList，通知所有的（接入方）就看到最新的信息
 *
 * @author chenhang
 * @date 2020/3/17 21:11
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    /**
     * 观察者集合
     */
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void dataChange() {
        // 调用接入方的update
        nofityObserver();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 调用dataChange，将最新的信息推送给接入方currentConditions
        dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    /**
     * 遍历所有的观察者，并通知
     */
    @Override
    public void nofityObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(temperature, pressure, humidity);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
