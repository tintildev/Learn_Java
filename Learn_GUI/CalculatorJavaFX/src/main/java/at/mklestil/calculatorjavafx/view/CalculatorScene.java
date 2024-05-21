package at.mklestil.calculatorjavafx.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
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
        display.setStyle("-fx-border-color: black");
        display.setPrefWidth(120);

        //math
        listOfOperatorButtons = new ArrayList<>();
        OperatorButton btnClear = new OperatorButton("Clear", "Clear", 2,1, 104);
        OperatorButton btnEnter = new OperatorButton("Enter", "Enter", 3,4, 60, 80);
        listOfOperatorButtons.add(btnClear);
        listOfOperatorButtons.add(new OperatorButton("+", "+", 3,2, 60));
        listOfOperatorButtons.add(new OperatorButton("-", "-", 3,3, 60));
        listOfOperatorButtons.add(new OperatorButton("*", "*", 1,1));
        listOfOperatorButtons.add(new OperatorButton("/", "/", 0,1));
        listOfOperatorButtons.add(new OperatorButton(".", ".", 2,5));
        listOfOperatorButtons.add(btnEnter);

        //numbers
        listOfButtons = new ArrayList<>();
        NumberButton btn0 = new NumberButton("0", 0, 0,5, 80);
        listOfButtons.add(btn0);
        listOfButtons.add(new NumberButton("1", 1, 0,4));
        listOfButtons.add(new NumberButton("2", 2, 1,4));
        listOfButtons.add(new NumberButton("3", 3, 2,4));
        listOfButtons.add(new NumberButton("4", 4, 0,3));
        listOfButtons.add(new NumberButton("5", 5, 1,3));
        listOfButtons.add(new NumberButton("6", 6, 2,3));
        listOfButtons.add(new NumberButton("7", 7, 0,2));
        listOfButtons.add(new NumberButton("8", 8, 1,2));
        listOfButtons.add(new NumberButton("9", 9, 2,2));

        //Add to Gridpane
        for (NumberButton btn : listOfButtons){
            gridPane.add(btn, btn.getCol(), btn.getRow());
        }

        for(OperatorButton oBtn : listOfOperatorButtons){
            gridPane.add(oBtn, oBtn.getCol(), oBtn.getRow());
        }

        GridPane.setColumnSpan(display, 3);
        GridPane.setColumnSpan(btn0, 2);
        GridPane.setColumnSpan(btnClear, 2);
        GridPane.setRowSpan(btnEnter, 2);

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

    public ArrayList<OperatorButton> getListOfOperatorButtons() {
        return listOfOperatorButtons;
    }
}
