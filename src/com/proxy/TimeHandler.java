package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{
	
	Object o;
	public TimeHandler(Object o) {
		// TODO Auto-generated constructor stub
		this.o=o;
	}
	
	
	@Override
	public Object invoke(Object arg0, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("start timing");
		
		method.invoke(o, args);
		System.out.println("end timing");
		return null;
	}

}
