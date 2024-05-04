package at.klestilmartin.controller;

import at.klestilmartin.model.Client;
import at.klestilmartin.model.Server;
import at.klestilmartin.view.MyView;

public class MyController {
    public MyController(MyView view) throws Exception {

        Server server = new Server();
        Client client = new Client(view.getText());

        new Thread(server).start();
        new Thread(client).start();

    }
}
