package com.oberver;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer{

	@Override
	public void update(Observable weatherDataSt, Object data) {
		// TODO Auto-generated method stub
		WeatherData weatherData=((WeatherDataSt) weatherDataSt).getData();
		System.out.println("CurrentConditions:");
		System.out.println(weatherData.humidity);
		System.out.println(weatherData.pressure);
		System.out.println(weatherData.temperature);
		
	}
	
}
