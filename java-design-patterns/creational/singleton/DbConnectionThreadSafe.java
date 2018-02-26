package singleton;

import java.io.Serializable;

/**
 * Create instance when getInstance is called.
 * @author fkaveinga
 * Thread safe - Use volatile on the instance and synchronize the block instead of method.
 */
public class DbConnectionThreadSafe implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static volatile  DbConnectionThreadSafe instance = null;
	
	private String dbName;
	
	private DbConnectionThreadSafe() {}
	
	// Slow performance because of locking overhead.
	// Unnecessary synchronization that is not required once the instance variable is initialized.
	public static synchronized DbConnectionThreadSafe getInstanceWithMethodSynchronized(){
		if(instance==null){
			System.out.println("create new DbConnectionThreadSafe!");
			instance = new DbConnectionThreadSafe();
		}else{
			System.out.println("use existing DbConnectionThreadSafe!");
		}
		return instance;
	}
	
	//The synchronized block will be executed only when the instance is null and 
	// prevent unnecessary synchronization once the instance variable is initialized.
	public static DbConnectionThreadSafe getInstanceWithBlockSynchronized(){
		
		if(instance==null){
			synchronized(DbConnectionThreadSafe.class){
				if(instance==null){
					System.out.println("create new DbConnectionThreadSafe!");
					instance = new DbConnectionThreadSafe();
				}else{
					System.out.println("use existing DbConnectionThreadSafe!");
				}
			}
		}else{
			System.out.println("use existing DbConnectionThreadSafe!");
		}
		return instance;
	}
	
	public boolean connect(){
		System.out.println("connect to db "+this.dbName+"...good!");
		return true;
	}
	
	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	@Override
	public String toString() {
		return "DbConnectionThreadSafe [dbName=" + dbName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dbName == null) ? 0 : dbName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DbConnectionThreadSafe other = (DbConnectionThreadSafe) obj;
		if (dbName == null) {
			if (other.dbName != null)
				return false;
		} else if (!dbName.equals(other.dbName))
			return false;
		return true;
	}
}
