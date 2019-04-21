package com.singletonPattern;

public class SingletonIdler {
	private static SingletonIdler instance;  
    private SingletonIdler (){}  
  
    public synchronized  static SingletonIdler getInstance() {  
	    if (instance == null) {  
	        instance = new SingletonIdler();  
	    }  
	    return instance;  
    }  
}
