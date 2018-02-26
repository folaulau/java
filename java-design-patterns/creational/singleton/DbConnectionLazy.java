package singleton;

import java.io.Serializable;

/**
 * Create instance when getInstance is called.
 * @author fkaveinga
 * This can cause issues if multiple threads are inside the if loop at the same time. 
 * It will destroy the singleton pattern and both threads will get the different instances 
 * of singleton class
 * - Not thread safe
 * - Serializable safe
 */
public class DbConnectionLazy implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static DbConnectionLazy instance = null;
	
	private String dbName;
	
	private DbConnectionLazy() {}
	
	public static DbConnectionLazy getInstance(){
		if(instance==null){
			System.out.println("create new DbConnectionLazy!");
			instance = new DbConnectionLazy();
		}else{
			System.out.println("use existing DbConnectionLazy!");
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
		return "DbConnectionLazy [dbName=" + dbName + "]";
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
		DbConnectionLazy other = (DbConnectionLazy) obj;
		if (dbName == null) {
			if (other.dbName != null)
				return false;
		} else if (!dbName.equals(other.dbName))
			return false;
		return true;
	}
}
