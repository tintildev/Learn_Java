package at.klestilmartin.model;

import java.io.*;
import java.net.Socket;

public class Client implements Runnable{

    //initialize socket and streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    private String adress = "";
    private int port = 0;

    //constructor with ip and port
    public Client(String adress, int port) {
        this.adress = adress;
        this.port = port;

    }

    @Override
    public void run() {

        try{
            //connection
            socket = new Socket(adress, port);
            System.out.println("Connected to Server");

            // Daten empfangen und in Datei schreiben
            InputStream inputStream = socket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream("received_file.txt");
            System.out.println("Client: receive file received_file.txt");
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("Client: receive file bytes loadet: " + bytesRead);

            // Stream und Socket schließen
            fileOutputStream.close();
            inputStream.close();
            socket.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
