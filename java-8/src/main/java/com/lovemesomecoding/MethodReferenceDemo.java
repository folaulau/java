package com.lovemesomecoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		MethodReferenceDemo demo = new MethodReferenceDemo();
		demo.methodReferenceWithStaticMethod();
	}
	
	public void methodReferenceWithStaticMethod() {
		List<String> names = Arrays.asList("Laulau","Kinga","Fusi");
		
		names.forEach(MethodReferenceDemo::printMe);
		
		
		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		
		numbers = numbers.stream()
		  .sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		
		numbers = numbers.stream().sorted(Integer::compareTo).collect(Collectors.toList());
		
		System.out.println(numbers);
		
		List<User> users = names.stream().map(User::new).collect(Collectors.toList());
	
		System.out.println(users);
	}
	
	public static void printMe(String str) {
		System.out.println("print "+str);
	}
	
	
	class User{
		private String name;
		
		public User(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name;
		}
		
	}

}
