package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class DbConnectionEagerTest {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, ClassNotFoundException, IOException {
		DbConnectionEagerTest singletonTest = new DbConnectionEagerTest();
		//singletonTest.testEager();
		//singletonTest.testEagerWithMultiThreadEnv();
		singletonTest.testEagerWithSerialization();
	}

	public void testEager() {
		DbConnectionEager dbConnection = DbConnectionEager.getInstance();
		dbConnection.connect();
		DbConnectionEager dbConnection1 = DbConnectionEager.getInstance();
		dbConnection1.connect();
		DbConnectionEager dbConnection2 = DbConnectionEager.getInstance();
		dbConnection2.connect();
		
		
	}

	public void testEagerWithMultiThreadEnv() throws InterruptedException {
		Thread threadA = new Thread(){
			@Override
			public void run() {
				DbConnectionEager dbConnection = DbConnectionEager.getInstance();
				dbConnection.setDbName("AAA");
				dbConnection.connect();
			}
		};
		threadA.start();
		
		Thread threadB = new Thread(){
			@Override
			public void run() {
				DbConnectionEager dbConnection = DbConnectionEager.getInstance();
				dbConnection.setDbName("BBB");
				dbConnection.connect();
			}
		};
		threadB.start();
		
		Thread threadC = new Thread(){
			@Override
			public void run() {
				DbConnectionEager dbConnection = DbConnectionEager.getInstance();
				dbConnection.setDbName("CCC");
				dbConnection.connect();
			}
		};
		threadC.start();
		
		Thread threadD = new Thread(){
			@Override
			public void run() {
				DbConnectionEager dbConnection = DbConnectionEager.getInstance();
				dbConnection.setDbName("DDD");
				dbConnection.connect();
			}
		};
		threadD.start();
		
		Thread.sleep(1000);
	}

	public void testEagerWithSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
		DbConnectionEager dbConnectionA = DbConnectionEager.getInstance();
		dbConnectionA.setDbName("AAA");
		dbConnectionA.connect();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("db_connection_eager.ser"));
        out.writeObject(dbConnectionA);
        out.close();
        
        ObjectInput in = new ObjectInputStream(new FileInputStream("db_connection_eager.ser"));
        DbConnectionEager dbConnectionB = (DbConnectionEager) in.readObject();
        in.close();
        
        System.out.println("dbConnectionA hashCode = "+dbConnectionA.hashCode());
        System.out.println(dbConnectionA.toString());
        System.out.println("dbConnectionB hashCode = "+dbConnectionB.hashCode());
        System.out.println(dbConnectionB.toString());
	}

}
