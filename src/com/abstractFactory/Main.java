package com.abstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PcFactory dellFactory=new DellFactory();
		PcFactory hpFactory=new HpFactory();
		
		dellFactory.createKeybo();
		Mouse dellMouse=dellFactory.createMouse();
		dellMouse.sayHi();
		
		
		hpFactory.createKeybo();
		Mouse hpMouse=hpFactory.createMouse();
		hpMouse.sayHi();
	}

}
