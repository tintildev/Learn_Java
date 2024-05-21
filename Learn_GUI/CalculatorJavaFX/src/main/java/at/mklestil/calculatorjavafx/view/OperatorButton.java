package at.mklestil.calculatorjavafx.view;

import javafx.scene.control.Button;

public class OperatorButton extends Button {
    private String name;
    private String typ;
    private int row;
    private int col;
    public OperatorButton(String name, String typ, int col, int row) {
        this.name = name;
        this.setText(name);
        this.row = row;
        this.col = col;
        setTyp(typ);
        this.setMinWidth(40);
        this.setMinHeight(40);
    }

    public OperatorButton(String name, String typ, int col, int row, int with) {
        this.name = name;
        this.setText(name);
        this.row = row;
        this.col = col;
        setTyp(typ);
        setMinWidth(with);
        setMinHeight(40);
    }

    public OperatorButton(String name, String typ, int col, int row, int with, int height) {
        this.name = name;
        this.setText(name);
        this.row = row;
        this.col = col;
        setTyp(typ);
        setMinWidth(with);
        setMinHeight(height);
    }

    public void setTyp(String typ){
        switch (typ){
            case "+":
                this.typ = typ;
                break;
            case "-":
                this.typ = typ;
                break;
            case "*":
                this.typ = typ;
                break;
            case "/":
                this.typ = typ;
                break;
            case ".":
                this.typ = typ;
                break;
            case "Enter":
                this.typ = typ;
                break;
            case "Clear":
                this.typ = typ;
                break;
            default:
                System.out.println("Error: Worng Typ");
        }
    }

    public String getName() {
        return name;
    }

    public String getTyp() {
        return typ;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
