package com.command;

public class TurnOnStereoCommand implements Command {
	Stereo stereo;
	public TurnOnStereoCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.turnOn();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.turnOff();

	}

}
