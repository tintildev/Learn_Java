package at.mklestil.tableviewexample.view;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class MyView {

    private Group root = new Group();

    public MyView() {
        VBox vBox = new VBox();

        Label userLabel = new Label("User:");
        userLabel.setFont(new Font(20));

        // TableView
        TableView<String> tableView = new TableView<String>();

        // create table colum
        TableColumn<String, String> userName = new TableColumn<String, String>("Username");
        TableColumn<String, String> email = new TableColumn<String, String>("Email");

        TableColumn<String, String> fullName = new TableColumn<String, String>("Full Name");
        TableColumn<String, String> firstName = new TableColumn<String, String>("First Name");
        TableColumn<String, String> lastName = new TableColumn<String, String>("Last Name");
        fullName.getColumns().addAll(firstName, lastName);

        tableView.getColumns().addAll(userName, email, fullName);


        // Add Nodes
        vBox.getChildren().addAll(userLabel, tableView);
        root.getChildren().add(vBox);
    }

    public Group getRoot() {
        return root;
    }
}
