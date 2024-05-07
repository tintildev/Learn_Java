package at.klestilmartin.controller;

import at.klestilmartin.model.Client;
import at.klestilmartin.model.Server;
import at.klestilmartin.view.MyView;



import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MyController {

    private String adress = "localhost";
    private int port = 12345;
    private File file = new File("example.txt");

    public MyController(MyView view) {
        Server server = new Server(port, file);
        Client client = new Client(adress, port);

        view.witchFile(listOfFiles());
        file = new File(view.getText());

        new Thread(server).start();
        new Thread(client).start();
    }

    public ArrayList<String> listOfFiles () {
        ArrayList<String> list = new ArrayList<>();

        //directory
        String current = System.getProperty("user.dir");
        System.out.println("Directory: " + current);

        Path path = Paths.get(current);
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)){
            for (Path found : files) {
                // search all txt data
                if(Files.isRegularFile(found) && found.toString().toLowerCase().endsWith(".txt")){

                    String temp = found.toString();
                    list.add(temp);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
