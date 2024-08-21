package at.mklestil.tableviewexample.control;

import at.mklestil.tableviewexample.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MyController {

    public MyController() {

        //Creat Test Data and work with view

    }

    private ObservableList<Person> getUserList(){
        // create Test Data
        Person person = new Person("Franz123", "Franz", "Baum", "franzbauem123@mail.com");
        Person person1 = new Person("Maxi", "Max", "Muster", "Maxi@mail.com");
        Person person2= new Person("MasterofDesaster", "Anna", "Burg", "TheMaster@mail.com");
        Person person3 = new Person("Admin", "Lisa", "Braumeister", "BesteLisa@mail.com");
        Person person4 = new Person("WallE", "Sissi", "Blackrock", "putzen@mail.com");

        ObservableList<Person> list = FXCollections.observableArrayList(person,person1,person2,person3, person4);
        return list;
    }
}
