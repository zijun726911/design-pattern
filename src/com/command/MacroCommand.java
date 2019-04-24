package com.command;

public class MacroCommand implements Command {
	//组合命令，实现两个命令
	Command[] commands;
	public MacroCommand(Command[] commands) {
		super();
		this.commands=commands;
	}

	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(int i=0;i<commands.length;i++) {
			commands[i].execute();
		}
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for(int i=0;i<commands.length;i++) {
			commands[i].undo();
		}
		
	}

}
