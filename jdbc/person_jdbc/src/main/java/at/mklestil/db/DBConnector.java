package at.mklestil.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 */
public class DBConnector {
    private static final String URL = "jdbc:postgresql://localhost:5432/mydatabase";
    private static final String USER = "myuser";
    private static final String PASSWORD = "mypassword";

    public static Connection connect() throws SQLException {
        System.out.println("Connection to DB");
        return DriverManager.getConnection(URL, USER, PASSWORD);

    }
}
