package com.command;

public class Main {
	public static void main(String[] args) {
		Light l1=new Light("bedroom");
		Light l2=new Light("kitchen");
		Stereo s=new Stereo();
		
		Command cl1=new TurnOnLightCommand(l1);
		Command cl2=new TurnOnLightCommand(l2);
		Command cs=new TurnOnStereoCommand(s);
		Command macroCommand= new MacroCommand(new Command[]{cl1,cl2}); 
		
		Control control=new Control();
		control.setCommand(0, cl1);
		control.setCommand(1, cl2);
		control.setCommand(2, cs);
		control.setCommand(3, macroCommand);
		
		
		control.executeCommand(1);
		control.executeCommand(0);
		control.executeCommand(2);
	
		System.out.println("undo:");
		control.undoCommand();
		control.undoCommand();
		
		
		System.out.println("macro:");
		control.executeCommand(3);
		control.undoCommand();
		
		
	}
}
