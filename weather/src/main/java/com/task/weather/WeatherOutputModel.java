package com.task.weather;
public class WeatherOutputModel {
    private String condition;
    private double temperature;
    private double wind_speed;

    public WeatherOutputModel(String condition, double temperature, double wind_speed) {
        this.condition = condition;
        this.temperature = temperature;
        this.wind_speed = wind_speed;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }
}
