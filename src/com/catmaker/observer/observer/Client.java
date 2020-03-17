package com.catmaker.observer.observer;

/**
 * Client
 *
 * @author chenhang
 * @date 2020/3/17 21:27
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        BaiduSite baiduSite = new BaiduSite();
        SinaSite sinaSite = new SinaSite();

        // 注册到weatherData
        weatherData.registerObserver(baiduSite);
        weatherData.registerObserver(sinaSite);

        // 测试
        System.out.println("通知各个注册的观察者去看看信息");
        weatherData.setData(10f, 100f, 30.3f);

        weatherData.removeObserver(baiduSite);

        // 测试
        System.out.println();
        System.out.println("通知各个注册的观察者去看看信息");
        weatherData.setData(13f, 90f, 40.3f);
    }
}
