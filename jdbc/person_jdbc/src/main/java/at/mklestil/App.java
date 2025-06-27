package at.mklestil;

import at.mklestil.control.PersonController;
import at.mklestil.model.Person;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world! JDBC and Docker Example");

        PersonController personController = new PersonController();
        personController.addPerson(new Person("John", "Doe", 30));
        personController.addPerson(new Person("Johni", "Doe", 33));
        personController.addPerson(new Person("Johna", "Doe", 20));
    }
}