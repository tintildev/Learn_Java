package at.klestilmartin.view;

import java.util.Scanner;

public class MyView {
    private String text = "";
    public MyView() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter text for server: ");

        text = myObj.nextLine();  // Read user input
    }

    public String getText() {
        return text;
    }
}
