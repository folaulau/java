package externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serialization.Address;

/*
   What is Externalization in Java?
   
   In serialization, the Java Virtual Machine is totally responsible for the process of 
   writing and reading objects. This is useful in most cases, as the programmers do not 
   have to care about the underlying details of the serialization process. However, the 
   default serialization does not protect sensitive information such as passwords and 
   credentials, or what if the programmers want to secure some information during the 
   serialization process?
   
   Thus externalization comes to give the programmers full control in reading and writing objects during serialization.
 */
public class ExternalizeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "externalized_member.ser";

		Member externalizedMember = serialize(path);

		System.out.println("externalizedMember=" + externalizedMember.toString());

		Member dexternalizedMember = deserialize(path);

		System.out.println("dexternalizedMember=" + dexternalizedMember.toString());
	}

	private static Member serialize(String path) throws IOException {

		FileOutputStream fileStream = new FileOutputStream(path);

		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);

		Member member = new Member();
		member.setAge(21);
		member.setName("Laulau");
		member.setEmail("folaukaveinga@gmail.com");
		member.setHeight(6.3);
		
		Address address = new Address();
		address.setCity("EL Segundo");
		address.setState("CA");
		
		member.setAddress(address);

		System.out.println(member.toString());

		objectStream.writeObject(member);

		objectStream.close();
		fileStream.close();

		return member;

	}

	private static Member deserialize(String path) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(path);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		Member member = (Member) objectInputStream.readObject();

		objectInputStream.close();
		fileInputStream.close();

		return member;
	}
}
