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
    Connection connection;

    public PersonRepository(DBConnector dbConnector){
        // Initialize the repository with a database connector
        this.dbConnector = dbConnector;
        System.out.println("PersonRepository initialized with DBConnector");

        try {
            this.connection = connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Adds a person to the database.
     *
     * @param firstName
     * @param lastName
     * @param age
     */
    public void addPerson(String firstName, String lastName, int age) {
        String insertQuery = "INSERT INTO person (firstname, lastname, age) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {

            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setInt(3, age);

            pstmt.executeUpdate();
            System.out.println("Person erfolgreich eingefügt: " + firstName + " " + lastName);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieves all persons from the database.
     * @return
     */
    public ArrayList<Person> getAllPersons() {
        //TODO Implement the logic to retrieve all persons from the database

        System.out.println("Retrieving all persons");
        // Here you would typically execute an SQL SELECT statement and return the results
        return new ArrayList<Person>();
    }

    public void deletePerson(int id) {
        //TODO Implement the logic to delete a person from the database by ID
        System.out.println("Deleting person: " + id);
        // Here you would typically execute an SQL DELETE statement
    }
}
