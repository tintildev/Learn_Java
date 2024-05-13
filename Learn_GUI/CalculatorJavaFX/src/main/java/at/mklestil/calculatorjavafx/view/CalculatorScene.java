package at.mklestil.calculatorjavafx.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class CalculatorScene {

    private GridPane gridPane = new GridPane();

    public CalculatorScene() {
        //Creating a Grid Pane
        gridPane = new GridPane(3, 3);

        //display
        Label display = new Label("");

        //enter
        Button btnEnter = new Button("Enter");
        GridPane.setColumnSpan(btnEnter, 3);

        //math
        Button btnPlus = new Button("+");
        Button btnMinus = new Button("-");
        Button btnMal = new Button("*");
        Button btnDiv = new Button("/");
        Button btnKoma = new Button(".");

        //numbers
        ArrayList<CalcButton> listOfButtons = new ArrayList<>();
        listOfButtons.add(new CalcButton("0", 0, 0,4));
        listOfButtons.add(new CalcButton("1", 0, 0,3));
        listOfButtons.add(new CalcButton("2", 0, 1,3));
        listOfButtons.add(new CalcButton("3", 0, 2,3));
        listOfButtons.add(new CalcButton("4", 0, 0,2));
        listOfButtons.add(new CalcButton("5", 0, 1,2));
        listOfButtons.add(new CalcButton("6", 0, 2,2));
        listOfButtons.add(new CalcButton("7", 0, 0,1));
        listOfButtons.add(new CalcButton("8", 0, 1,1));
        listOfButtons.add(new CalcButton("9", 0, 2,1));

        for (CalcButton btn : listOfButtons){
            gridPane.add(btn, btn.getCol(), btn.getRow());
        }

        gridPane.add(display, 0, 0);
        gridPane.add(btnKoma, 2, 4);
        gridPane.add(btnPlus, 4, 4);
        gridPane.add(btnMinus, 4, 3);
        gridPane.add(btnMal, 4, 2);
        gridPane.add(btnDiv, 4, 1);
        gridPane.add(btnEnter, 0, 5);


    }

    public GridPane getGridPane() {
        return gridPane;
    }
}
