package chapter7_nested_class;

public class StaticNestedClass {
	String county;
	static String address;
	
	public StaticNestedClass() {
		System.out.println("Main constructor");
	}
	
	static class Person{
		
		static String name;
		int age;
		StaticNestedClass outer = new StaticNestedClass();
		
		public Person() {
			System.out.println("Static constructor");
		}
		// non static block
		{
			System.out.println("Non-static block");
			age = 5;
		}
		// static block
		static{
			System.out.println("Static block");
			name = "Laulau";
			address = "CA";
		}
		
		public static String getAdd(){
			return address;
		}
		
		public void sayHi(){
			//this is an error because static nested class cannot access non-static
			//properties or methods of outer class.
			//sayHello(); 
			
			// this works
			outer.sayHello();
		}
		
	}
	
	public static void main(final String[] args) {
		StaticNestedClass.Person nested = new StaticNestedClass.Person();
		nested.sayHi();
		
	}
	
	private void sayHello(){
		System.out.println("Hi from Main");
	}
}
