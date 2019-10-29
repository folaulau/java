package com.lovemesomecoding.iinterface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		AdditionalCalculator add = (int num1, int num2) -> num1+num2;
		
		System.out.println(add.add(2, 4));
	}
}
