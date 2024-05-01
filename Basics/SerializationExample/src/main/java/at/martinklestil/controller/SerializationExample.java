package at.martinklestil.controller;

import at.martinklestil.model.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public SerializationExample() {
        //Objekt zum Speichern
        Person person = new Person("Max", 25, "Maurer");

        //Dateiname für das speichern
        String fileName = "person.ser";

        try{
            //Objekt in Datei speichern
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Objekt erfolgreich in Datei gespeichert.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
