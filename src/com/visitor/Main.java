package com.visitor;

public class Main {
	public static void main(String[] args) {
			//ʵ������Լ���¶��visitor, visitor����
	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	   }
}
