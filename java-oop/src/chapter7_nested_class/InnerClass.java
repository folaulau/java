package chapter7_nested_class;

public class InnerClass {
	String name = "OuterClass";
	private class User{
		
		// shadowing.
		String name = "InnerClass";
		
		public void sayHello(){
			System.out.println("Hi from User - "+name);
			// access attributes and methods of outer.
			System.out.println("Hi from Outer - "+InnerClass.this.name);
			InnerClass.this.sayHello();
		}
	}
	public static void main(final String[] args) {
		
		InnerClass main = new InnerClass();
		User user = main.new User();
		user.sayHello();
		
	}
	
	private void sayHello(){
		System.out.println("Hi from Outer - "+name);
	}
}
