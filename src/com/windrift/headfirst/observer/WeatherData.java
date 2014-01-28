package com.windrift.headfirst.observer;

import java.util.Observable;

public class WeatherData extends Observable{
	Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData () {
		
	}

	public void measurementsChanged() {
		this.setChanged();
		notifyObservers();
	}
	
	public void setMeasurements (float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		DisplayElement displayElement = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(1.1f, 1.1f, 1.1f);
		weatherData.setMeasurements(2.1f, 2.1f, 2.1f);
		weatherData.setMeasurements(3.1f, 3.1f, 3.1f);
		weatherData.setMeasurements(4.1f, 4.1f, 4.1f);
		
	}
	
}
