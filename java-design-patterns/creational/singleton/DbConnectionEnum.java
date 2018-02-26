package singleton;

public enum DbConnectionEnum {
	INSTANCE("db name");
	
	private String dbName;
	
	private DbConnectionEnum(String dbName){
		System.out.println("DbConnectionEnum!");
		this.dbName = dbName;
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

	public DbConnectionEnum getInstance(){
		return INSTANCE;
	}

	@Override
	public String toString() {
		return "DbConnectionEnum [dbName=" + dbName + "]";
	}

}
