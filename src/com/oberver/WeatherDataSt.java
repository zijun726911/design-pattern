package com.oberver;

import java.util.Observable;

public class WeatherDataSt extends Observable{
	
	WeatherData data;
	
	public WeatherData getData() {
		return data;
	}


	public void setData(WeatherData data) {
		this.data = data;
	}


	public WeatherDataSt() {
		super();
		
	}

	
	public void dataChange() {
		this.setChanged();
//		this.notifyObservers(data);
		this.notifyObservers();
	}
	
	
	
	
}

class WeatherData{
	float humidity;
	float temperature;
	float pressure;
	public WeatherData(float humidity, float temperature, float pressure) {
		super();
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
	}
	
	
}
