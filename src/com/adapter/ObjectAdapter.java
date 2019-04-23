package com.adapter;

public class ObjectAdapter implements Duck {
	Chicken c;
	public ObjectAdapter(Chicken c) {
		// TODO Auto-generated constructor stub
		this.c=c;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		c.crow();
	}
}
