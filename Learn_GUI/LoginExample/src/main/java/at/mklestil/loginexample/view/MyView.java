package at.mklestil.loginexample.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MyView {
    private GridPane root = new GridPane();


    public MyView() {

        Label infoLabel = new Label("Login:");
        TextField user = new TextField("Username");
        PasswordField pw = new PasswordField();
        Button btn = new Button("Login");


    }

    public GridPane getRoot() {
        return root;
    }
}
