package at.mklestil.db;

import at.mklestil.model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static at.mklestil.db.DBConnector.connect;

public class PersonRepository {
    DBConnector dbConnector;

    public PersonRepository(DBConnector dbConnector){
        // Initialize the repository with a database connector
        this.dbConnector = dbConnector;
        System.out.println("PersonRepository initialized with DBConnector");

        try {
            connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addPerson(String firstName, String lastName, int age) {
        String insertQuery = "INSERT INTO person (first_name, last_name, age) VALUES (?, ?, ?)";

        try (Connection conn = DBConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setInt(3, age);

            pstmt.executeUpdate();
            System.out.println("Person erfolgreich eingefügt: " + firstName + " " + lastName);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Person> getAllPersons() {
        // Logic to retrieve all persons from the database
        System.out.println("Retrieving all persons");
        // Here you would typically execute an SQL SELECT statement and return the results
        return new ArrayList<Person>();
    }

    public void deletePerson(int id) {
        // Logic to delete a person from the database
        System.out.println("Deleting person: " + id);
        // Here you would typically execute an SQL DELETE statement
    }
}
