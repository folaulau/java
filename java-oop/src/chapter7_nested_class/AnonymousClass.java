package chapter7_nested_class;

public class AnonymousClass {
	String name = "OuterClass";
	
	interface Hello{
		void sayHello();
	}
	public static void main(final String[] args) {
		
		AnonymousClass main = new AnonymousClass();
		main.sayHi();
	}
	
	private void sayHi(){
		Hello hello = new Hello() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello from "+name);
				
			}
		};
		hello.sayHello();
	}
}
