package at.mklestil.calculatorjavafx.view;

import javafx.scene.control.Button;

public class NumberButton extends Button {

    private String name;
    private int value;

    private int row;

    private int col;


    public NumberButton(String name, int val, int col, int row) {
        this.name = name;
        this.value = val;
        this.setText(name);
        this.row = row;
        this.col = col;
        this.setMinWidth(40);
        this.setMinHeight(40);
    }

    public NumberButton(String name, int val, int col, int row, int with) {
        this.name = name;
        this.value = val;
        this.setText(name);
        this.row = row;
        this.col = col;
        this.setMinWidth(with);
        this.setMinHeight(40);
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
