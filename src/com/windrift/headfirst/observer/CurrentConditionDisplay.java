package com.windrift.headfirst.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	public CurrentConditionDisplay (Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current condition: " + temperature + " degrees and " + humidity + "% humidity");

	}



	@Override
	public void update(Observable o, Object arg) {
		WeatherData data = (WeatherData) o;
		this.temperature = data.getTemperature();
		this.humidity = data.getHumidity();	
		display();
	}

}
