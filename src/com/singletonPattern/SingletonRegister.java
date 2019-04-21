package com.singletonPattern;

public class SingletonRegister {
	private static class SingletonHolder {  
	    	private static final SingletonRegister INSTANCE = new SingletonRegister();  
	    }  
	    private SingletonRegister (){}  
	    public static final SingletonRegister getInstance() {  
	    	return SingletonHolder.INSTANCE;  
	    }  
}
