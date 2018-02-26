package utility_classes;

import java.util.TimerTask;

public class CustomTimerTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("Run errands for custom timer task...");
	}

}
