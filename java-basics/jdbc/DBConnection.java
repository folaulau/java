import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DBConnection {

    INSTANCE("java_jdbc");

    private Connection connection = null;

    private String     database;

    private DBConnection(String database) {
        this.database = database;
        String URL = "jdbc:mysql://localhost:3306/" + database + "?createDatabaseIfNotExist=true&useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
        String USER = "root";
        String PASS = "";

        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public Connection getConnection() {

        return connection;
    }

    public String getDatabase() {
        return this.database;
    }

}
