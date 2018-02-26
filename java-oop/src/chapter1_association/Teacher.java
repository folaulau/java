package chapter1_association;

import java.util.List;

public class Teacher {
	private String name;
	private String code;
	private List<Student> students;

	public Teacher(final String name, final String code, final List<Student> students) {
		super();
		this.name = name;
		this.code = code;
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + this.name + ", code=" + this.code + ", students=" + this.students + "]";
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(final String code) {
		this.code = code;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(final List<Student> students) {
		this.students = students;
	}

}
