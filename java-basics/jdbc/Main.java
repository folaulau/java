import java.sql.Connection;
import java.sql.PreparedStatement;
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
        try {
            DB_CONNECTION.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }

        // load users
        try {
            for (int i = 0; i < NUMBER_OF_USERS; i++) {
                StringBuilder query = new StringBuilder();
                query.append("INSERT INTO user (first_name, last_name, age) ");
                query.append("VALUES (?, ?, ?); ");
                System.out.println("SQL QUERY: " + query.toString());

                /**
                 * Use prepareStatement to insert data into the query and avoid SQL injection
                 */
                PreparedStatement pStmnt = DB_CONNECTION.prepareStatement(query.toString(), Statement.RETURN_GENERATED_KEYS);
                String firstName = ConstantUtils.getRandomFirstname();
                String lastName = ConstantUtils.getRandomLastname();
                int age = RandomGeneratorUtils.getIntegerWithin(1, 51);
                pStmnt.setString(1, firstName);
                pStmnt.setString(2, lastName);
                pStmnt.setInt(3, age);

                System.out.println("parameter 1: " + firstName);
                System.out.println("parameter 2: " + lastName);
                System.out.println("parameter 3: " + age);

                int numOfRowsCreated = pStmnt.executeUpdate();

                if (numOfRowsCreated > 0) {
                    int id = 0;
                    ResultSet rs = pStmnt.getGeneratedKeys();
                    if (rs.next()) {
                        id = rs.getInt(1);
                    }
                    System.out.println("new id: " + id);
                }

            }

            DB_CONNECTION.commit();
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());

            e.printStackTrace();

            try {
                DB_CONNECTION.rollback();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        } finally {
        }

        System.out.println(TABLE_NAME + " table has been populated with " + NUMBER_OF_USERS + " rows!\n\n");
    }

    public static void updateDataInTable(int selectedId) {
        System.out.println("updating data in " + TABLE_NAME + " table...");
        DB_CONNECTION = DBConnection.INSTANCE.getConnection();
        try {
            DB_CONNECTION.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }

        // Update user
        try {
            StringBuilder query = new StringBuilder();
            query.append("UPDATE user ");
            query.append("SET first_name = ? ");
            query.append(", age = ? ");
            query.append("WHERE id = ? ");
            System.out.println("SQL QUERY: " + query.toString());

            PreparedStatement pStmnt = DB_CONNECTION.prepareStatement(query.toString());
            int age = RandomGeneratorUtils.getIntegerWithin(1, 51);
            String firstName = "Folau";

            pStmnt.setString(1, firstName);
            pStmnt.setInt(2, age);
            pStmnt.setInt(3, selectedId);

            System.out.println("parameter 1: " + firstName);
            System.out.println("parameter 2: " + age);
            System.out.println("parameter 3: " + selectedId);

            pStmnt.executeUpdate();

            DB_CONNECTION.commit();
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();

            try {
                DB_CONNECTION.rollback();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

        }

        System.out.println(TABLE_NAME + " table has been updated for row with id=" + selectedId + "!\n\n");
    }

    public static void readDataFromTable(int selectedId) {
        System.out.println("reading data from " + TABLE_NAME + " table...");
        DB_CONNECTION = DBConnection.INSTANCE.getConnection();

        try {
            DB_CONNECTION.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        }

        ResultSet rs = null;
        PreparedStatement pStmnt = null;
        // Read user
        try {
            StringBuilder query = new StringBuilder();
            query.append("SELECT id, first_name, last_name, age ");
            query.append("FROM user ");
            query.append("WHERE id = ? ");
            System.out.println("SQL QUERY: " + query.toString());

            pStmnt = DB_CONNECTION.prepareStatement(query.toString());
            pStmnt.setInt(1, selectedId);
            System.out.println("parameter 1: " + selectedId);

            rs = pStmnt.executeQuery();
            DB_CONNECTION.commit();

            rs.next();

            User user = User.generateUserFromResultset(rs);
            System.out.println(user.toString());

        } catch (SQLException e) {
            System.out.println("SQLException, msg=" + e.getLocalizedMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (pStmnt != null) {
                    pStmnt.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Row with id=" + selectedId + " has been retrived from " + TABLE_NAME + ".\n\n");
    }

}
