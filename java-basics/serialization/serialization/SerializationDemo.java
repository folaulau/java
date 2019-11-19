package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "serialized_user.ser";

		User serializedUser = serialize(path);

		System.out.println("serializedUser=" + serializedUser.toString());

		User deserializedUser = deserialize(path);
		
		System.out.println("deserializedUser=" + deserializedUser.toString());

	}

	private static User serialize(String path) throws IOException {

		FileOutputStream fileStream = new FileOutputStream(path);

		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);

		User user = new User();
		user.setAge(21);
		user.setName("Laulau");
		user.setEmail("folaukaveinga@gmail.com");
		user.setHeight(6.3);
		
		// this will not be serialized because HumanBeing is not Serializable.
		user.setSerialCode("test-serial-code");
		
		Address address = new Address();
		address.setCity("EL Segundo");
		address.setState("CA");
		
		user.setAddress(address);

		objectStream.writeObject(user);

		objectStream.close();
		fileStream.close();

		return user;
	}

	private static User deserialize(String path) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(path);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		User user = (User) objectInputStream.readObject();

		objectInputStream.close();
		fileInputStream.close();

		return user;
	}

}
