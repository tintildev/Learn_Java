package at.klestilmartin;

import at.klestilmartin.controller.Client;
import at.klestilmartin.controller.Server;

public class Main {
    public static void main(String[] args) {
        /*
        In this example I create my first sockets and run them across 2 threads so they can communicate.
         */

        System.out.println("Hello world! This is my first Java Network Example");

        //Starte Server thread
        Thread serverThread = new Thread(() -> {
            Server server = new Server();
        });

        //Starte Client in einem anderem thread
        Thread clientThread = new Thread(() ->{
            Client client = new Client();
        });

        // Starte beide Threads
        System.out.println("Threads server and client started");
        serverThread.start();
        clientThread.start();

    }
}