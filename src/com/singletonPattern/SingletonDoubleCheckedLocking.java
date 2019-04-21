package com.singletonPattern;

public class SingletonDoubleCheckedLocking {
	private volatile static SingletonDoubleCheckedLocking singleton;  
    private SingletonDoubleCheckedLocking (){}  
    public static SingletonDoubleCheckedLocking getSingleton() {  
	    if (singleton == null) {  
	        synchronized (SingletonDoubleCheckedLocking.class) {  
		        if (singleton == null) {  
		            singleton = new SingletonDoubleCheckedLocking();  
		        }  
	        }  
	    }  
	    return singleton;  
    }  
}
