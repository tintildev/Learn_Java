package at.mklestil.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnector {
    private static final String URL = "jdbc:postgresql://localhost:5432/mydatabase";
    private static final String USER = "myuser";
    private static final String PASSWORD = "mypassword";

    public static Connection connect() throws SQLException {
        System.out.println("Connection to DB");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void createDB() {
        String sql = "CREATE TABLE IF NOT EXISTS person (" +
                "id SERIAL PRIMARY KEY, " +
                "firstname VARCHAR(50), " +
                "lastname VARCHAR(50), " +
                "age INTEGER" +
                ")";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Tabelle erfolgreich erstellt oder existiert bereits.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disconnect(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Disconnected from DB");
            } catch (SQLException e) {
                System.err.println("Error while disconnecting: " + e.getMessage());
            }
        }
    }
}
