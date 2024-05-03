package at.klestilmartin.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public Client() {
        try {
            // Verbindung zum Server herstellen
            Socket socket = new Socket("localhost", 12345);

            // Ein- und Ausgabestreams erstellen
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Nachricht an den Server senden
            out.println("Hallo Server, ich bin der Client!");

            // Antwort des Servers lesen und auf der Konsole ausgeben
            String response = in.readLine();
            System.out.println("Nachricht vom Server: " + response);

            // Ressourcen freigeben
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
