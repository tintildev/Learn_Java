package at.mklestil.tableviewexample.view;

import at.mklestil.tableviewexample.model.Person;
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
        TableView<Person> tableView = new TableView<Person>();

        // create table colum
        TableColumn<Person, String> userName = new TableColumn<Person, String>("Username");
        TableColumn<Person, String> email = new TableColumn<Person, String>("Email");

        TableColumn<Person, String> fullName = new TableColumn<Person, String>("Full Name");
        TableColumn<Person, String> firstName = new TableColumn<Person, String>("First Name");
        TableColumn<Person, String> lastName = new TableColumn<Person, String>("Last Name");
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
