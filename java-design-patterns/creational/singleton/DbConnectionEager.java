package singleton;

import java.io.Serializable;

/**
 * Create instance when class is loaded into memory.
 * @author fkaveinga
 * Eager initialization creates the instance even before it�s being used and 
 * that is not the best practice to use. Normally singleton is used for heavy lifting and it's going to
 * take a very long time in load time.
 * - Thread safe
 * - Serializable safe
 */
public class DbConnectionEager implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static final DbConnectionEager instance = new DbConnectionEager();
	
	private String dbName;
	
	private DbConnectionEager() {
		System.out.println("DbConnectionEager!");
	}
	
	public static DbConnectionEager getInstance(){
		System.out.println("return DbConnectionEager already instantiated!");
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
		return "DbConnectionEager [dbName=" + dbName + "]";
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
		DbConnectionEager other = (DbConnectionEager) obj;
		if (dbName == null) {
			if (other.dbName != null)
				return false;
		} else if (!dbName.equals(other.dbName))
			return false;
		return true;
	}
}
