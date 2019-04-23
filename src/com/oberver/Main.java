package com.oberver;

public class Main {
	public static void main(String[] args) {
		 WeatherDataSt station =new WeatherDataSt();
		 CurrentConditions cc=new CurrentConditions();
		 ForcastConditions fc= new ForcastConditions();
		 station.addObserver(cc);
		 station.addObserver(fc);
		 
		 station.setData(new WeatherData(12,13,14));
		 station.dataChange();
		 System.out.println();
		 station.setData(new WeatherData(100,200,300));
		 station.dataChange();
		 System.out.println();
		 station.deleteObserver(cc);
		 station.setData(new WeatherData(100,200,300));
		 station.dataChange();
	}
}
