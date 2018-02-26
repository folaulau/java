package stream;

public class FlightAttendant {
	int age;
	String name;
	
	public FlightAttendant(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "FlightAttendant [age=" + age + ", name=" + name + "]";
	}
	
	
}
