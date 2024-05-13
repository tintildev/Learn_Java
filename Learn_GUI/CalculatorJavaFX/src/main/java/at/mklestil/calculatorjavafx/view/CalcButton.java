package at.mklestil.calculatorjavafx.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class CalcButton extends Button {

    private String name;
    private int value;

    private int row;

    private int col;


    public CalcButton(String name, int value, int col, int row) {
        this.name = name;
        this.value = value;
        this.setText(name);
        this.row = row;
        this.col = col;

        this.setMaxSize(80,80);

        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(value);
            }
        });
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


}
