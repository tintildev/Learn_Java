package at.mklestil.db;

import at.mklestil.model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

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
     * Retrieves a person from the database by ID.
     * @param id
     * @return
     */
    public Person getPersonById(int id) {
        String insertQuery = "SELECT * FROM person WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {
            pstmt.setInt(1, id); // <-- das musst du ergänzen

            var resultSet = pstmt.executeQuery();

            if (resultSet.next()) { // WICHTIG: .next() muss aufgerufen werden
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                int age = resultSet.getInt("age");

                return new Person(firstName, lastName, age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * Retrieves all persons from the database.
     * @return
     */
    public ArrayList<Person> getAllPersons() {
        System.out.println("Start retrieving all persons");

        String insertQuery = "SELECT * FROM person";

        try (PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {
            var resultSet = pstmt.executeQuery();

            ArrayList<Person> persons = new ArrayList<>();

            while (resultSet.next()) {
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                int age = resultSet.getInt("age");

                Person person = new Person(firstName, lastName, age);
                persons.add(person);
            }

            System.out.println("Persons retrieved successfully: " + persons.size());
            return persons;




        } catch (SQLException e) {
            e.printStackTrace();
        }


        return new ArrayList<Person>();
    }

    /**
     * Deletes a person from the database by ID.
     * Check if the person exists before deleting.
     * @param id
     */
    public void deletePerson(int id) {
        String deleteQuery = "DELETE FROM person WHERE id = ?";

        // Check if the person exists before attempting to delete
        Person person = getPersonById(id);
        if (person == null) {
            System.out.println("Person with ID " + id + " not found.");
            return;
        }
        System.out.println("Deleting person: " + person.getFirstName() + " " + person.getLastName());

        try (PreparedStatement pstmt = connection.prepareStatement(deleteQuery)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Person successfully deleted.");
            } else {
                System.out.println("No person deleted. ID may not exist.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
