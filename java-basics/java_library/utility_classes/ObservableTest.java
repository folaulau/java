package utility_classes;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class ObservableTest {

	@Test
	public void testObservable() {
		NewsLetter newsLetter = new NewsLetter("Columbus Wins", new Date());
		
		newsLetter.addObserver(new Subscriber("Folau"));
		newsLetter.addObserver(new Subscriber("Folaulau"));
		newsLetter.addObserver(new Subscriber("Kinga"));
		
		int count = newsLetter.countObservers();
		System.out.println("number of observers: "+count);
		newsLetter.deleteObserver(new Subscriber("Folaulau"));
		newsLetter.setNews("Another news");
		newsLetter.notifyObservers();
	}

}
