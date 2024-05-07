package at.klestilmartin.model;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable{

    //initialize socket and streams
    private Socket clientSocket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    private File file;

    private int port = 0;
    public Server(int port, File file) {
        this.port = port;
        this.file = file;
    }

    @Override
    public void run() {
        try{
            //create serversocket on port ...
            server = new ServerSocket(port);
            System.out.println("Server wait of connection ...");

            // Server wait of incoming connection
            clientSocket = server.accept();
            System.out.println("Client accepted");

            sendFile();

            //close stream and socket
            clientSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void sendFile (){
        try {
            //read data and send over socket
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("Server: Read file completed");
            OutputStream outputStream = clientSocket.getOutputStream();

            //A buffer of 4096 bytes is created. This buffer is used to read data from the file and then write it to the OutputStream.
            byte[] buffer = new byte[4096];

            //Number of bytes read
            int bytesRead;

            //returns the number of bytes actually read. The loop runs as long as there are still bytes in the file
            while (((bytesRead = fileInputStream.read(buffer)) != -1)) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
