package at.mklestil.loginexample.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MyView {
    private GridPane root = new GridPane();

    private TextField user = new TextField("Username");
    private PasswordField pw = new PasswordField();
    private Button btn = new Button("Login");


    public MyView() {

        Label infoLabel = new Label("Login:");

        root.add(infoLabel, 0 ,0);
        root.add(user, 0, 1);
        root.add(pw, 0, 2);
        root.add(btn, 0, 3);

        root.setAlignment(Pos.CENTER);

    }

    public GridPane getRoot() {
        return root;
    }

    public TextField getUser() {
        return user;
    }

    public PasswordField getPw() {
        return pw;
    }

    public Button getBtn() {
        return btn;
    }
}
