package com.command;

public class TurnOnLightCommand implements Command {
	Light light;
	
	public TurnOnLightCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOn();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.turnOff();
		
	}

}
