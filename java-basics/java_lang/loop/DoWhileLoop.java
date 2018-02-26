package loop;


public class DoWhileLoop {

	public static void main(String[] args) {
		DoWhileLoop doWhileLoop = new DoWhileLoop();
		doWhileLoop.testDoWhileLoop();
	}
	
	public void testDoWhileLoop() {
		int count = 5;
		
		do {
			System.out.println("count: "+count);
			
			count--;
		} while (count > 0);
	}

}
