package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class DbConnectionThreadSafeTest {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, ClassNotFoundException, IOException {
		DbConnectionThreadSafeTest singletonTest = new DbConnectionThreadSafeTest();
		//singletonTest.testThreadSafe();
		//singletonTest.testThreadSafeWithMultiThreadEnv();
		singletonTest.testThreadSafeWithSerialization();
	}

	public void testThreadSafe() {
		DbConnectionThreadSafe dbConnection = DbConnectionThreadSafe.getInstanceWithBlockSynchronized();
		dbConnection.setDbName("AAA");
		dbConnection.connect();
		DbConnectionThreadSafe dbConnection1 = DbConnectionThreadSafe.getInstanceWithBlockSynchronized();
		dbConnection1.setDbName("BBB");
		dbConnection1.connect();
		DbConnectionThreadSafe dbConnection2 = DbConnectionThreadSafe.getInstanceWithBlockSynchronized();
		dbConnection2.setDbName("CCC");
		dbConnection2.connect();
		
		
	}

	// This create a new connection for every thread.
	public void testThreadSafeWithMultiThreadEnv() throws InterruptedException {
		Thread threadA = new Thread(){
			@Override
			public void run() {
				DbConnectionThreadSafe dbConnection = DbConnectionThreadSafe.getInstanceWithBlockSynchronized();
				dbConnection.setDbName("AAA");
				dbConnection.connect();
			}
		};
		threadA.start();
		
		Thread threadB = new Thread(){
			@Override
			public void run() {
				DbConnectionThreadSafe dbConnection = DbConnectionThreadSafe.getInstanceWithBlockSynchronized();
				dbConnection.setDbName("BBB");
				dbConnection.connect();
			}
		};
		threadB.start();
		
		Thread threadC = new Thread(){
			@Override
			public void run() {
				DbConnectionThreadSafe dbConnection = DbConnectionThreadSafe.getInstanceWithBlockSynchronized();
				dbConnection.setDbName("CCC");
				dbConnection.connect();
			}
		};
		threadC.start();
		
		Thread threadD = new Thread(){
			@Override
			public void run() {
				DbConnectionThreadSafe dbConnection = DbConnectionThreadSafe.getInstanceWithBlockSynchronized();
				dbConnection.setDbName("DDD");
				dbConnection.connect();
			}
		};
		threadD.start();
		
		Thread.sleep(1000);
	}

	public void testThreadSafeWithSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
		DbConnectionThreadSafe dbConnectionA = DbConnectionThreadSafe.getInstanceWithBlockSynchronized();
		dbConnectionA.setDbName("AAA");
		dbConnectionA.connect();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("db_connection_thread_safe.ser"));
        out.writeObject(dbConnectionA);
        out.close();
        
        ObjectInput in = new ObjectInputStream(new FileInputStream("db_connection_thread_safe.ser"));
        DbConnectionThreadSafe dbConnectionB = (DbConnectionThreadSafe) in.readObject();
        in.close();
        
        System.out.println("dbConnectionA hashCode = "+dbConnectionA.hashCode());
        System.out.println(dbConnectionA.toString());
        System.out.println("dbConnectionB hashCode = "+dbConnectionB.hashCode());
        System.out.println(dbConnectionB.toString());
	}

}
