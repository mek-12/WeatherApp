package com.example.weatherapp.Model;

public class Main {
    private double temp;
    private double pressure;
    private int humidity;
    private double temo_min;
    private double temp_max;

    public Main(double temp, double pressure, int humidity, double temo_min, double temp_max) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.temo_min = temo_min;
        this.temp_max = temp_max;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemo_min() {
        return temo_min;
    }

    public void setTemo_min(double temo_min) {
        this.temo_min = temo_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }
}
