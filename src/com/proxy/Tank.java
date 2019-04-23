package com.proxy;

public class Tank implements Moveable,Shootable {
	@Override
	public void move() {
		System.out.println("moving");
	}

	@Override
	public void shoot(int i) {
		// TODO Auto-generated method stub
		System.out.println("shooting");
		
	}
	
	
}
