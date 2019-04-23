package com.adapter;

public class Main {
	public static void main(String[] args) {
		Chicken c=new RedHeadChicken();
		Duck d1=new ObjectAdapter(c);
		Duck d2=new ClassAdapter();
		d1.quack();
		d2.quack();
	}
}
