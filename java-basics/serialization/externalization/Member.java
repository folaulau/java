package externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import serialization.Address;

public class Member implements Externalizable {

	public static final long serialVersionUID = 2L;

	private String name;

	private int age;

	private String email;

	transient private double height;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	/*
	 * For primitive types, use the writeXXX() methods of the DataOutput interface,
	 * like writeBoolean(), writeByte(), writeInt(), writeLong(), etc.
	 * 
	 * For object types like Strings, arrays, your custom classes, you can use the
	 * writeObject() method.
	 */
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("writing object state...");
		// TODO Auto-generated method stub
		out.writeObject(name);
		out.writeObject(email);
		out.writeInt(age);
		out.writeDouble(height);
		//out.writeObject(address);
	}

	/*
	 * The order in which attributes are written must be matched when they are read.
	 * 
	 * For primitive types, you can use the readXXX() methods of the DataInput interface. 
	 * They are namely, readBoolean(), readByte(), readInt(), readLong(). 
	 * 
     * If you have object types like Strings, arrays, any of your custom classes, you use the readObject() method.
	 */
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("reading object state...");
		this.name = (String) in.readObject();
		this.email = (String) in.readObject();
		this.age = in.readInt();
		this.height = in.readDouble();
		//this.address = (Address)in.readObject();
	}
}
