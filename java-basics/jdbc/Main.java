import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.ConstantUtils;
import utils.RandomGeneratorUtils;

public class Main {

    static String     TABLE_NAME      = "user";

    static Connection DB_CONNECTION   = null;

    static int        NUMBER_OF_USERS = 10;

    public static void main(String[] args) {
        createTable();
        insertDataToTable();

        int selectedId = RandomGeneratorUtils.getIntegerWithin(1, NUMBER_OF_USERS);

        readDataFromTable(selectedId);
        updateDataInTable(selectedId);

        readDataFromTable(selectedId);

        try {
            if (DB_CONNECTION != null)
                DB_CONNECTION.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } // end finally try
    }

    public static void createTable() {
        System.out.println("creating " + TABLE_NAME + " table...");
        DB_CONNECTION = DBConnection.INSTANCE.getConnection();
        Statement stmt = null;
        try {
            stmt = DB_CONNECTION.createStatement();
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }

        System.out.println("Check if table " + TABLE_NAME + " already exists.");
        // @formatter:off
        String checkTableSQL = "SELECT COUNT(*) as tableCount " + 
                "FROM INFORMATION_SCHEMA.TABLES " + 
                "WHERE TABLE_SCHEMA = '"+DBConnection.INSTANCE.getDatabase()+"' "+
                "AND TABLE_NAME = '"+TABLE_NAME+"'; "; 
        // @formatter:on

        try {
            System.out.println("SQL QUERY: " + checkTableSQL);
            ResultSet resultSet = stmt.executeQuery(checkTableSQL);
            resultSet.next();
            int tableCount = resultSet.getInt("tableCount");

            if (tableCount > 0) {
                System.out.println("dropping " + TABLE_NAME + " table.");
                System.out.println("SQL QUERY: " + "DROP TABLE " + TABLE_NAME + "; ");
                boolean removedTable = stmt.execute("DROP TABLE " + TABLE_NAME + "; ");
                System.out.println("table dropped " + removedTable);
            }

        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }
        System.out.println("creating " + TABLE_NAME + " table.");
        // @formatter:off
        String createTableSQL = "CREATE TABLE "+TABLE_NAME+" " +
                "(id INTEGER NOT NULL AUTO_INCREMENT, " +
                " first_name VARCHAR(255), " + 
                " last_name VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id )); "; 
        // @formatter:on

        try {
            System.out.println("SQL QUERY: " + createTableSQL);
            stmt.executeUpdate(createTableSQL);
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }
        System.out.println(TABLE_NAME + " table has been created!\n\n");
    }

    public static void insertDataToTable() {
        System.out.println("inserting data into " + TABLE_NAME + " table...");
        DB_CONNECTION = DBConnection.INSTANCE.getConnection();
        Statement stmt = null;
        try {
            stmt = DB_CONNECTION.createStatement();
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }

        // load users
        try {
            for (int i = 0; i < NUMBER_OF_USERS; i++) {
                StringBuilder query = new StringBuilder();
                query.append("INSERT INTO user (first_name, last_name, age) ");
                query.append("VALUES ( ");
                query.append("'" + ConstantUtils.getRandomFirstname() + "', ");
                query.append("'" + ConstantUtils.getRandomLastname() + "', ");
                query.append(RandomGeneratorUtils.getIntegerWithin(1, 51));
                query.append("); ");
                System.out.println("SQL QUERY: " + query.toString());
                stmt.executeUpdate(query.toString());

            }
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }

        System.out.println(TABLE_NAME + " table has been populated with " + NUMBER_OF_USERS + " rows!\n\n");
    }

    public static void updateDataInTable(int selectedId) {
        System.out.println("updating data in " + TABLE_NAME + " table...");
        DB_CONNECTION = DBConnection.INSTANCE.getConnection();
        Statement stmt = null;
        try {
            stmt = DB_CONNECTION.createStatement();
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }

        // Update user
        try {
            StringBuilder query = new StringBuilder();
            query.append("UPDATE user ");
            query.append("SET first_name = 'Folau' ");
            query.append(", age = " + RandomGeneratorUtils.getIntegerWithin(1, 51) + " ");
            query.append("WHERE id = " + selectedId + "; ");
            System.out.println("SQL QUERY: " + query.toString());
            stmt.executeUpdate(query.toString());
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }

        System.out.println(TABLE_NAME + " table has been updated for row with id=" + selectedId + "!\n\n");
    }

    public static void readDataFromTable(int selectedId) {
        System.out.println("reading data from " + TABLE_NAME + " table...");
        DB_CONNECTION = DBConnection.INSTANCE.getConnection();
        Statement stmt = null;
        try {
            stmt = DB_CONNECTION.createStatement();
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }

        // Read user
        try {
            StringBuilder query = new StringBuilder();
            query.append("SELECT id, first_name, last_name, age ");
            query.append("FROM user ");
            query.append("WHERE id = " + selectedId + "; ");
            System.out.println("SQL QUERY: " + query.toString());
            ResultSet rs = stmt.executeQuery(query.toString());
            rs.next();

            int id = rs.getInt("id");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            int age = rs.getInt("age");

            System.out.println("id=" + id);
            System.out.println("firstName=" + firstName);
            System.out.println("lastName=" + lastName);
            System.out.println("age=" + age);
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }

        System.out.println("Row with id=" + selectedId + " has been retrived from " + TABLE_NAME + ".\n\n");
    }

}
