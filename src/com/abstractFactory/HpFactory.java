package com.abstractFactory;

public class HpFactory implements PcFactory{

	@Override
	public Mouse createMouse() {
		// TODO Auto-generated method stub
		return new HpMouse();
	}

	@Override
	public Keybo createKeybo() {
		// TODO Auto-generated method stub
		return new HpKeybo();
	}

}
