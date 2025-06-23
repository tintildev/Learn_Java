package at.mklestil.control;

import at.mklestil.db.DBConnector;
import at.mklestil.model.Person;

import java.sql.SQLException;

public class PersonController {
    Person person;
    DBConnector dbConnector;
    public PersonController(){
        // Initialize the controller, Model, and DBConnector
        person = new Person();
        dbConnector = new DBConnector();
        try {
            dbConnector.connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
