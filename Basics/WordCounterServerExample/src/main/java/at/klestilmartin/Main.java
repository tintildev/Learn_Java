package at.klestilmartin;

import at.klestilmartin.controller.MyController;
import at.klestilmartin.view.MyView;

public class Main {
    /*
    An example of Network in Java with sockets, the client can send messages
    to the server and get the number of words back from it.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world! An example of Network in Java with sockets, the client can send messages to the server and get the number of words back from it.");
        MyView view = new MyView();
        MyController controller = new MyController(view);
    }
}