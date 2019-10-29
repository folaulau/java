package com.lovemesomecoding.iinterface;

public interface Screen {

	public boolean turnOn();
	public boolean turnOff();
	
	// default method
    default void defaultMethod() {
       System.out.println("Doing Screen default things...");
    }
}
