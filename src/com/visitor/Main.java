package com.visitor;

public class Main {
	public static void main(String[] args) {
			//实体类把自己暴露给visitor, visitor处理
	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	   }
}
