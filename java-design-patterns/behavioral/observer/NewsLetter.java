package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * First, if it has changed, it must call setChanged( ). 
 * Second, when it is ready to notify observers of this change, it must call notifyObservers( ).
 */
public class NewsLetter extends Observable{
	private String news;
	private Date time;
	private List<Subscriber> subscribers = new ArrayList<>();
	
	public NewsLetter() {
		this(null,null,null);
	}
	
	public NewsLetter(String news, Date time) {
		this(news,time,null);
	}

	public NewsLetter(String news, Date time, List<Subscriber> subscribers) {
		super();
		this.news = news;
		this.time = time;
		
		if(subscribers==null){
			this.subscribers = new ArrayList<>();
		}
	}

	@Override
	public synchronized boolean hasChanged() {
		System.out.println("has changed");
		return super.hasChanged();
	}
	
	@Override
	protected synchronized void clearChanged() {
		System.out.println("clear changed");
		super.clearChanged();
	}
	
	@Override
	public synchronized void addObserver(Observer observer) {
		Subscriber sub = (Subscriber)observer;
		System.out.println(sub.toString());
		this.subscribers.add(sub);
	}
	
	
	@Override
	protected synchronized void setChanged() {
		System.out.println("set changed");
		super.setChanged();
	}
	@Override
	public void notifyObservers() {
		for(Subscriber subscriber : this.subscribers){
			subscriber.update(this, subscriber.getName());
		}
	}

	@Override
	public synchronized int countObservers() {
		return this.subscribers.size();
	}
	
	@Override
	public synchronized void deleteObserver(Observer observer) {
		Iterator<Subscriber> it = this.subscribers.iterator();
		while(it.hasNext()){
			Subscriber current = it.next();
			if(current.equals((Subscriber)observer)){
				it.remove();
				break;
			}
		}
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public List<Subscriber> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}

	@Override
	public String toString() {
		return "NewsLetter [news=" + news + ", time=" + time + "]";
	}
	
}
