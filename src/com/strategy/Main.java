package com.strategy;

public class Main {
	public static void main(String[] args) {
		//�㷨ģ����㷨ʵ�ַֿ�
	      Context context = new Context(new OperationAdd());    
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
	 
	      context = new Context(new OperationSubstract());      
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
	 
	      context = new Context(new OperationMultiply());    
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	   }
}
