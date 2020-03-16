package com.catmaker.observer.normal;

/**
 * Client
 *
 * @author chenhang
 * @date 2020/3/17 0:10
 */
public class Client {
    public static void main(String[] args) {
        // 创建接入方 currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        // 创建WeatherData并将接入方currentConditions传递到WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);

        // 更新天气情况
        weatherData.setData(30, 150, 40);
        // 天气情况变化
        System.out.println("============天气情况变化============");
        weatherData.setData(40,  160, 20);
    }
}
