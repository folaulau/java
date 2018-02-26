package synchronization;

import org.junit.Test;

public class SynchronizationTest {

	@Test
	public void test(){
		EvenNumberHolder evenNumberHolder = new EvenNumberHolder();
		EvenTask task = new EvenTask(evenNumberHolder);
		
		for (int i = 0; i < 15 ; i++) {
			new Thread(task).start();
		}
	}
	
	@Test
	public void testCollection(){
		CustomerManager cm = new CustomerManager();
		GenerateCustomerTask task = new GenerateCustomerTask(cm);
		for (int user = 0; user < 10; user++) {
			Thread t = new Thread(task);
			t.start();
		}
		
		//main thread is now acting as the monitoring thread
		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cm.howManyCustomers();
			cm.displayCustomers();
		}
	}

}
