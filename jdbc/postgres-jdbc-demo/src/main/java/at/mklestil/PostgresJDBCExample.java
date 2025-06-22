package at.mklestil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgresJDBCExample {
    public PostgresJDBCExample() {
        String url = "jdbc:postgresql://localhost:5432/mydatabase";
        String user = "myuser";
        String password = "mypassword";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            System.out.println("Connected to PostgreSQL!");

            // Create table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS test_table (id SERIAL PRIMARY KEY, name VARCHAR(100));");

            // Insert some rows
            stmt.executeUpdate("INSERT INTO test_table (name) VALUES ('Alice'), ('Bob'), ('Charlie');");

            // Read data
            ResultSet rs = stmt.executeQuery("SELECT * FROM test_table;");
            System.out.println("Data in test_table:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
