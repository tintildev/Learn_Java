package at.mklestil.control;

import at.mklestil.db.DBConnector;
import at.mklestil.db.PersonRepository;
import at.mklestil.model.Person;

import java.sql.SQLException;
import java.util.ArrayList;


public class PersonController {
    private Person person;
    private DBConnector dbConnector;
    private PersonRepository personRepository;
    public PersonController() {
        // Initialize the controller, Model, and DBConnector
        dbConnector = new DBConnector();

        try {
            dbConnector.connect();
            dbConnector.createDB(); // Ensure the database and table are created
            personRepository = new PersonRepository(dbConnector);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Adds a person to the database.
     *
     * @param person
     */
    public void addPerson(Person person) {
        personRepository.addPerson(person.getFirstName(), person.getLastName(), person.getAge());

    }

    public ArrayList<Person> getAllPersons() {
        ArrayList<Person> persons = personRepository.getAllPersons();
        return persons;
    }

    public void deletePerson(Person person) {
        // Logic to delete a person from the database
        System.out.println("Deleting person: " + person.getFirstName());
        // Here you would typically call a method from the repository to delete the person
    }


}

