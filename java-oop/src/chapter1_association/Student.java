package chapter1_association;

public class Student {
	private String name;
	private String yr;
	private String id;

	@Override
	public String toString() {
		return "Student [name=" + this.name + ", yr=" + this.yr + ", id=" + this.id + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(final String name, final String yr, final String id) {
		super();
		this.name = name;
		this.yr = yr;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getYr() {
		return this.yr;
	}

	public void setYr(final String yr) {
		this.yr = yr;
	}

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

}
