package at.mklestil.calculatorjavafx.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class CalculatorScene {

    private GridPane gridPane = new GridPane();

    public CalculatorScene() {
        //Creating a Grid Pane
        gridPane = new GridPane(3, 3);

        //math
        Button btnPlus = new Button("+");
        Button btnMinus = new Button("-");
        Button btnMal = new Button("*");
        Button btnDiv = new Button("/");
        Button btnKoma = new Button(".");

        //numbers
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");

        btn0.setPrefWidth(50);
        gridPane.add(btn0, 0,1,3,3);
        //GridPane.setColumnSpan(btn0, 1); // 2 columns wide
        gridPane.add(btnKoma, 2, 3);
       // gridPane.add(btn0, 0, 3);
        gridPane.add(btn1, 0, 2);
        gridPane.add(btn2, 1, 2);
        gridPane.add(btn3, 2, 2);
        gridPane.add(btn4, 0, 1);
        gridPane.add(btn5, 1, 1);
        gridPane.add(btn6, 2, 1);
        gridPane.add(btn7, 0, 0);
        gridPane.add(btn8, 1, 0);
        gridPane.add(btn9, 2, 0);

        gridPane.add(btnPlus, 4, 3);
        gridPane.add(btnMinus, 4, 2);
        gridPane.add(btnMal, 4, 1);
        gridPane.add(btnDiv, 4, 0);

    }

    public GridPane getGridPane() {
        return gridPane;
    }
}
