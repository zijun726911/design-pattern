package com.command;

public class Light {
	String loc;
	
	public Light(String loc) {
		super();
		this.loc = loc;
	}

	void turnOn() {
		System.out.println("turn on light at "+loc);
	}
	
	
	void turnOff() {
		System.out.println("turn off light at "+loc);
	}
}
