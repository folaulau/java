package com.lovemesomecoding.iinterface;

public class DefaultStaticMethodDemo implements Screen, Vehicle{

	public static void main(String[] args) {
		DefaultStaticMethodDemo demo = new DefaultStaticMethodDemo();
		
		demo.defaultMethod();
	}

	@Override
	public boolean turnOn() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean turnOff() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		Vehicle.super.defaultMethod();
	}

}
