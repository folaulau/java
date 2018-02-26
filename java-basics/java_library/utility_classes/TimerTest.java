package utility_classes;

import java.util.Timer;

import org.junit.Test;

public class TimerTest {

	@Test
	public void testTimerTask() {
		Timer timer = new Timer();
		timer.schedule(new CustomTimerTask(), 1000);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException, msg: "+e.getLocalizedMessage());
		}
		
		System.out.println("Done!");
	}
	
	@Test
	public void testTimerTaskSchedule() {
		Timer timer = new Timer();
		timer.schedule(new CustomTimerTask(), 0, 100);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException, msg: "+e.getLocalizedMessage());
		}
		
		System.out.println("Done!");
	}
	
	@Test
	public void testTimerTaskFixrate() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new CustomTimerTask(), 1000, 100);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException, msg: "+e.getLocalizedMessage());
		}
		
		System.out.println("Done!");
	}

}
