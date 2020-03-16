package com.catmaker.observer.normal;

/**
 * WeatherData,是核心
 * 1. 包含最新的天气信息
 * 2. 含有CurrentConditions对象
 * 3. 当数据更新时，就主动调用CurrentConditions对象的update方法（含display）。
 *      这样接入方就可以看到最新的信息了
 *
 * @author chenhang
 * @date 2020/3/17 0:01
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    /**
     * 当数据更新时，就调用setData
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 调用dataChange，将最新的信息推送给接入方currentConditions
        dataChange();
    }

    public void dataChange() {
        // 调用接入方的update
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
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
