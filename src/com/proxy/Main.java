package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		Tank tank=new Tank();
		InvocationHandler timeHandler = new TimeHandler(tank);
		
		Object t= Proxy.newProxyInstance(timeHandler.getClass().getClassLoader(),
				tank.getClass().getInterfaces(), timeHandler);
		
//		Shootable t=(Shootable) (Moveable) Proxy.newProxyInstance(timeHandler.getClass().getClassLoader(),
//				tank.getClass().getInterfaces(), timeHandler);
//		Tank tank2=(Tank)t;
		((Moveable)t).move();
		System.out.println("");
		((Shootable)t).shoot(5);
		System.out.println("");
		for(Class interface0: t.getClass().getInterfaces()) {
			System.out.println(interface0.getName());
		}
		
		
		
	}
}
