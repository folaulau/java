package com.lovemesomecoding.iinterface;

public interface Vehicle {
	
	public boolean turnOn();
	// default method
    default void defaultMethod() {
       System.out.println("Doing Vehicle default things...");
    }
    
    
    static double getApproximateDistance(double milePerGallon, double gallons) {
        return milePerGallon*gallons;
    }
}
