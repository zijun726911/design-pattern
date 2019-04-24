package com.visitor;

public interface ComputerPart {
	 
	public void accept(ComputerPartVisitor computerPartVisitor);
	 
	}