package at.mklestil.tableviewexample.view;

import at.mklestil.tableviewexample.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class MyView {

    private BorderPane root = new BorderPane();
    private ObservableList<Person> data = FXCollections.observableArrayList();

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

        //prepare columns to fill with data
        //get Data from Person object
        userName.setCellValueFactory(new PropertyValueFactory<>("userName"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        // binde tableView on empty list, in setData update empty list
        tableView.setItems(data);

        //edit data
        tableView.setEditable(true);
        //set Cell Factory
        userName.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
        //save data
        userName.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Person, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Person, String> event) {
                // get edit value and postion
                String newValue = event.getNewValue();
                TablePosition<Person, String> position = event.getTablePosition();

                // get from tableview the person object and edit
                Person person = event.getTableView().getItems().get(position.getRow());
                person.setUserName(newValue);
            }
        });

        // TableView will always try to take up as much vertical space as possible within the VBox.
        VBox.setVgrow(tableView, Priority.ALWAYS);

        // Add Nodes
        vBox.getChildren().addAll(userLabel, tableView);
        root.setCenter(vBox);
    }

    public void setData(ObservableList<Person> dataList){
        if(dataList != null){
            //get data from controll
            // Keep empty list and update contents instead
            data.setAll(dataList);
        }else {
            System.out.println("Error dataList is null");
        }
    }

    private void setDatatoTable(){

    }

    public BorderPane getRoot() {
        return root;
    }
}
