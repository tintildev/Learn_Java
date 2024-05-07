package at.klestilmartin.view;

import java.util.ArrayList;
import java.util.Scanner;

public class MyView {
    private String text = "";

    public MyView() {

    }

    public void witchFile(ArrayList<String> fileListe){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("FileList: ");
        for(String item : fileListe){
            System.out.println(item);
        }
        System.out.println("Which File do you want from server: " );

        text = myObj.nextLine();  // Read user input
    }

    public String getText() {
        return text;
    }
}
