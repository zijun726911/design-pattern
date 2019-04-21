package com.abstractFactory;

public class DellFactory implements PcFactory {

	@Override
	public Mouse createMouse() {
		// TODO Auto-generated method stub
		return new DellMouse();
	}

	@Override
	public Keybo createKeybo() {
		// TODO Auto-generated method stub
		return new DellKeybo();
	}

}
