package com.chainOfResponsibility;

public class Main {
	
	/*
	 * 
	 * 把多个可指派目标穿成链，可以是环，可以是树，只把任务指派给链头
	 * 
	 * */
	
	
	private static AbstractLogger getChainOfLoggers(){
		 
	      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
	      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
	      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
	 
	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);
	 
	      return errorLogger;  
	   }
	 
	   public static void main(String[] args) {
	      AbstractLogger loggerChain = getChainOfLoggers();
	 
	      loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
	 
	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is a debug level information.");
	 
	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error information.");
	   }

}
