package observer;


import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer{
	private String name;
	
	public Subscriber() {
		this(null);
	}
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subscriber [name=" + name + "]";
	}


	@Override
	public void update(Observable observable, Object n) {
		String name = n.toString();
		System.out.println("update subscriber "+observable.toString()+", name: "+name);
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subscriber other = (Subscriber) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
