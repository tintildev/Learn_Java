package at.klestilmartin.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server() {
        try {
            // ServerSocket erstellen und an einem bestimmten Port lauschen
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server wartet auf Verbindungen...");

            // Auf eingehende Verbindungen warten
            Socket clientSocket = serverSocket.accept();

            System.out.println("Client verbunden: " + clientSocket.getInetAddress().getHostAddress());

            // Ein- und Ausgabestreams erstellen
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Nachricht vom Client lesen und auf der Konsole ausgeben
            String message = in.readLine();
            System.out.println("Nachricht vom Client: " + message);

            // Nachricht an den Client senden
            out.println("Nachricht vom Server: Danke für die Verbindung!");

            // Ressourcen freigeben
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();


        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
