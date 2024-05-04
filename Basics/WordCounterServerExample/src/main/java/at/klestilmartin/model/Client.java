package at.klestilmartin.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable{

    private String nachricht = "";

    public Client(String text) {
       nachricht = text;
    }

    @Override
    public void run() {
        try {
            // Verbindung zum Server herstellen
            Socket socket = new Socket("localhost", 12345);

            // Ein- und Ausgabestreams erstellen
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Nachricht an den Server senden
            System.out.println("Nachricht an Server " + nachricht);
            out.println(nachricht);

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
