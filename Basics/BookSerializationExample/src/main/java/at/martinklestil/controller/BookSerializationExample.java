package at.martinklestil.controller;

import at.martinklestil.model.Book;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class BookSerializationExample {

    public BookSerializationExample() {

        // Erstelle eine Liste von Büchern
        List<Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("Darlington & Milow Air Cargo", "Anna Lisa Franzke", 2023));

        // Dateiname für die Speicherung der Liste
        String fileName = "books.ser";

        try {
            // Liste von Büchern serialisieren
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(books);
            out.close();
            fileOut.close();
            System.out.println("Liste von Büchern erfolgreich in Datei gespeichert.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
