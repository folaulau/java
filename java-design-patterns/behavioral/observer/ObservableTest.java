package observer;

import java.util.Date;

public class ObservableTest {
	public static void main(String[] args) {
		NewsLetter newsLetter = new NewsLetter("Columbus Wins", new Date());

		newsLetter.addObserver(new Subscriber("Folau"));
		newsLetter.addObserver(new Subscriber("Folaulau"));
		newsLetter.addObserver(new Subscriber("Kinga"));

		int count = newsLetter.countObservers();
		System.out.println("number of observers: " + count);
		newsLetter.deleteObserver(new Subscriber("Folaulau"));
		newsLetter.setNews("Another news");
		newsLetter.notifyObservers();
	}

}
