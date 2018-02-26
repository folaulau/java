package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class DbConnectionEnumTest {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, ClassNotFoundException, IOException {
		DbConnectionEnumTest singletonTest = new DbConnectionEnumTest();
		//singletonTest.testEnum();
		//singletonTest.testEnumWithMultiThreadEnv();
		singletonTest.testEnumWithSerialization();
	}

	public void testEnum() {
		DbConnectionEnum dbConnection = DbConnectionEnum.INSTANCE.getInstance();
		dbConnection.setDbName("AAA");
		dbConnection.connect();
		DbConnectionEnum dbConnection1 = DbConnectionEnum.INSTANCE.getInstance();
		dbConnection1.setDbName("BBB");
		dbConnection1.connect();
		DbConnectionEnum dbConnection2 = DbConnectionEnum.INSTANCE.getInstance();
		dbConnection2.setDbName("CCC");
		dbConnection2.connect();
		
		
	}

	public void testEnumWithMultiThreadEnv() throws InterruptedException {
		Thread threadA = new Thread(){
			@Override
			public void run() {
				DbConnectionEnum dbConnection = DbConnectionEnum.INSTANCE.getInstance();
				dbConnection.setDbName("AAA");
				dbConnection.connect();
			}
		};
		threadA.start();
		
		Thread threadB = new Thread(){
			@Override
			public void run() {
				DbConnectionEnum dbConnection = DbConnectionEnum.INSTANCE.getInstance();
				dbConnection.setDbName("BBB");
				dbConnection.connect();
			}
		};
		threadB.start();
		
		Thread threadC = new Thread(){
			@Override
			public void run() {
				DbConnectionEnum dbConnection = DbConnectionEnum.INSTANCE.getInstance();
				dbConnection.setDbName("CCC");
				dbConnection.connect();
			}
		};
		threadC.start();
		
		Thread threadD = new Thread(){
			@Override
			public void run() {
				DbConnectionEnum dbConnection = DbConnectionEnum.INSTANCE.getInstance();
				dbConnection.setDbName("DDD");
				dbConnection.connect();
			}
		};
		threadD.start();
		
		Thread.sleep(1000);
	}

	public void testEnumWithSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
		DbConnectionEnum dbConnectionA = DbConnectionEnum.INSTANCE.getInstance();
		dbConnectionA.setDbName("AAA");
		dbConnectionA.connect();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("db_connection_enum.ser"));
        out.writeObject(dbConnectionA);
        out.close();
        
        ObjectInput in = new ObjectInputStream(new FileInputStream("db_connection_enum.ser"));
        DbConnectionEnum dbConnectionB = (DbConnectionEnum) in.readObject();
        in.close();
        
        System.out.println("dbConnectionA hashCode = "+dbConnectionA.hashCode());
        System.out.println(dbConnectionA.toString());
        System.out.println("dbConnectionB hashCode = "+dbConnectionB.hashCode());
        System.out.println(dbConnectionB.toString());
	}

}
