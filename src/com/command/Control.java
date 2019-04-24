package com.command;

import java.util.ArrayList;
import java.util.Stack;

public class Control {
	ArrayList<Command> commands=new ArrayList<Command>();
	Stack<Command> stack=new Stack<Command>();
	
	void setCommand(int index,Command command) {
		commands.add(index, command);
	}
	
	void executeCommand(int index) {
		Command c=commands.get(index);
		c.execute();
		stack.push(c);
		
	}
	
	
	void undoCommand() {
		Command c=stack.pop();
		c.undo();
	}
}
