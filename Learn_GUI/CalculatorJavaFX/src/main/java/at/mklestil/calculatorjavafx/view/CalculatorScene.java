package at.mklestil.calculatorjavafx.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class CalculatorScene {

    private GridPane gridPane = new GridPane();
    private Label display = new Label("");
    private ArrayList<NumberButton> listOfButtons;
    private ArrayList<OperatorButton> listOfOperatorButtons;

    public CalculatorScene() {
        //Creating a Grid Pane
        gridPane = new GridPane(3, 3);

        //display
        display = new Label("");

        //enter
        Button btnEnter = new Button("Enter");
        GridPane.setColumnSpan(btnEnter, 3);

        //math
        listOfOperatorButtons = new ArrayList<>();
        listOfOperatorButtons.add(new OperatorButton("+", "+", 4,4));
        listOfOperatorButtons.add(new OperatorButton("-", "-", 4,3));
        listOfOperatorButtons.add(new OperatorButton("*", "*", 4,2));
        listOfOperatorButtons.add(new OperatorButton("/", "/", 4,1));
        listOfOperatorButtons.add(new OperatorButton(".", ".", 2,4));
        listOfOperatorButtons.add(new OperatorButton("Enter", "Enter", 0,5));

        //numbers
        listOfButtons = new ArrayList<>();
        listOfButtons.add(new NumberButton("0", 0, 0,4));
        listOfButtons.add(new NumberButton("1", 1, 0,3));
        listOfButtons.add(new NumberButton("2", 2, 1,3));
        listOfButtons.add(new NumberButton("3", 3, 2,3));
        listOfButtons.add(new NumberButton("4", 4, 0,2));
        listOfButtons.add(new NumberButton("5", 5, 1,2));
        listOfButtons.add(new NumberButton("6", 6, 2,2));
        listOfButtons.add(new NumberButton("7", 7, 0,1));
        listOfButtons.add(new NumberButton("8", 8, 1,1));
        listOfButtons.add(new NumberButton("9", 9, 2,1));

        //Add to Gridpane
        for (NumberButton btn : listOfButtons){
            gridPane.add(btn, btn.getCol(), btn.getRow());
        }

        for(OperatorButton oBtn : listOfOperatorButtons){
            gridPane.add(oBtn, oBtn.getCol(), oBtn.getRow());
        }

        gridPane.add(display, 0, 0);



    }

    public GridPane getGridPane() {
        return gridPane;
    }

    public String getDisplay() {

        return display.getText();
    }

    public void setDisplay(String text) {

        display.setText(text);
    }

    public ArrayList<NumberButton> getListOfButtons() {
        return listOfButtons;
    }
}
