package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class DbConnectionLazyTest {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, ClassNotFoundException, IOException {
		DbConnectionLazyTest singletonTest = new DbConnectionLazyTest();
		//singletonTest.testLazy();
		singletonTest.testLazyWithMultiThreadEnv();
		//singletonTest.testLazyWithSerialization();
	}

	public void testLazy() {
		DbConnectionLazy dbConnection = DbConnectionLazy.getInstance();
		dbConnection.setDbName("AAA");
		dbConnection.connect();
		DbConnectionLazy dbConnection1 = DbConnectionLazy.getInstance();
		dbConnection1.setDbName("BBB");
		dbConnection1.connect();
		DbConnectionLazy dbConnection2 = DbConnectionLazy.getInstance();
		dbConnection2.setDbName("CCC");
		dbConnection2.connect();
		
		
	}

	// This create a new connection for every thread.
	public void testLazyWithMultiThreadEnv() throws InterruptedException {
		Thread threadA = new Thread(){
			@Override
			public void run() {
				DbConnectionLazy dbConnection = DbConnectionLazy.getInstance();
				dbConnection.setDbName("AAA");
				dbConnection.connect();
			}
		};
		threadA.start();
		
		Thread threadB = new Thread(){
			@Override
			public void run() {
				DbConnectionLazy dbConnection = DbConnectionLazy.getInstance();
				dbConnection.setDbName("BBB");
				dbConnection.connect();
			}
		};
		threadB.start();
		
		Thread threadC = new Thread(){
			@Override
			public void run() {
				DbConnectionLazy dbConnection = DbConnectionLazy.getInstance();
				dbConnection.setDbName("CCC");
				dbConnection.connect();
			}
		};
		threadC.start();
		
		Thread threadD = new Thread(){
			@Override
			public void run() {
				DbConnectionLazy dbConnection = DbConnectionLazy.getInstance();
				dbConnection.setDbName("DDD");
				dbConnection.connect();
			}
		};
		threadD.start();
		
		Thread.sleep(1000);
	}

	public void testLazyWithSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
		DbConnectionLazy dbConnectionA = DbConnectionLazy.getInstance();
		dbConnectionA.setDbName("AAA");
		dbConnectionA.connect();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("db_connection_lazy.ser"));
        out.writeObject(dbConnectionA);
        out.close();
        
        ObjectInput in = new ObjectInputStream(new FileInputStream("db_connection_lazy.ser"));
        DbConnectionLazy dbConnectionB = (DbConnectionLazy) in.readObject();
        in.close();
        
        System.out.println("dbConnectionA hashCode = "+dbConnectionA.hashCode());
        System.out.println(dbConnectionA.toString());
        System.out.println("dbConnectionB hashCode = "+dbConnectionB.hashCode());
        System.out.println(dbConnectionB.toString());
	}

}
