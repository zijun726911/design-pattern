package com.oberver;

import java.util.Observable;
import java.util.Observer;

public class ForcastConditions implements Observer{

	@Override
	public void update(Observable weatherDataSt, Object data) {
		// TODO Auto-generated method stub
		WeatherData weatherData=((WeatherDataSt)weatherDataSt).getData();
		System.out.println("ForcastConditions:");
		System.out.println((weatherData.humidity+1));
		System.out.println((weatherData.pressure+1));
		System.out.println((weatherData.temperature+1));
		
	}
	
}
