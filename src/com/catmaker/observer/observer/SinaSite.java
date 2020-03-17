package com.catmaker.observer.observer;

/**
 * SinaSite
 *
 * @author chenhang
 * @date 2020/3/17 21:26
 */
public class SinaSite implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    /**
     * 更新天气情况，是由WeatherData调用
     * @param temperature
     * @param pressure
     * @param humidity
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("======新浪网站======");
        System.out.println("Sina site's temperature is now " + temperature);
        System.out.println("Sina site's pressure is now " + pressure);
        System.out.println("Sina site's humidity is now " + humidity);
    }
}
