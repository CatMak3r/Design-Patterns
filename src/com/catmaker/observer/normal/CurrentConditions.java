package com.catmaker.observer.normal;

/**
 * CurrentConditions
 * 显示当前天气，可以理解成是气象站自己的网站
 * @author chenhang
 * @date 2020/3/16 23:54
 */
public class CurrentConditions {
    /**
     * 温度
     */
    private float temperature;

    /**
     * 气压
     */
    private float pressure;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 更新天气情况，是由 WeatherData 来调用。这里使用推送模式
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Today's temperature is " + temperature);
        System.out.println("Today's pressure is " + pressure);
        System.out.println("Today's humidity is " + humidity);
    }

}
