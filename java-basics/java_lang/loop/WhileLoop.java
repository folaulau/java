package loop;

public class WhileLoop {

	public static void main(String[] args) {
		WhileLoop whileLoop = new WhileLoop();
		whileLoop.testWhileLoop();
	}
	
	public void testWhileLoop() {
		int count = 5;
		
		while(count>0){
			System.out.println("count: "+count);
			count--;
		}
	}

}
