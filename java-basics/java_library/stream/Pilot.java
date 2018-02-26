package stream;

public class Pilot {
	String plane;
	int age;
	String name;
	
	public Pilot(String plane, int age, String name) {
		super();
		this.plane = plane;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pilot [plane=" + plane + ", age=" + age + ", name=" + name + "]";
	}
	
	
}
