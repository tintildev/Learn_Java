package at.klestilmartin.controller;

import at.klestilmartin.model.Client;
import at.klestilmartin.model.Server;

import java.io.File;

public class MyController {

    private String adress = "localhost";
    private int port = 12345;
    private File file = new File("example.txt");

    public MyController() {
        Server server = new Server(port, file);
        Client client = new Client(adress, port);

        new Thread(server).start();
        new Thread(client).start();
    }
}
