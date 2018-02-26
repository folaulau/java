package chapter7_nested_class;

public class LocalClass {
	String name = "OuterClass";
	
	public static void main(final String[] args) {
		
		LocalClass main = new LocalClass();
		main.sayHello();
	}
	
	private void sayHello(){
		
		// This is a local class
		final class User{
			
			// shadowing.
			String name = "LocalClass";
			
			public void sayHello(){
				System.out.println("Hi from User - "+name);
			}
		}
		User user = new User();
		user.sayHello();
	}
}
