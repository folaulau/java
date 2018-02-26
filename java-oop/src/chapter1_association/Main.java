package chapter1_association;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(final String[] args) {
		System.out.println("http://beginnersbook.com/2013/05/association/");
		final List<Student> students = new ArrayList<Student>();
		students.add(new Student("Laulau", "Senior", "1234"));
		students.add(new Student("Kinga", "Softmore", "1235"));
		students.add(new Student("Fusi", "Freshman", "1236"));
		final Teacher folau = new Teacher("Folau", "CIS 310", students);

		System.out.println("Students in " + folau.getCode() + " taught by " + folau.getName());
		for (final Student student : folau.getStudents()) {
			System.out.println(student.toString());
		}
	}

}
