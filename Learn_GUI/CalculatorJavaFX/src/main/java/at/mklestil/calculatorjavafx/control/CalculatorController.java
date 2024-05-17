package at.mklestil.calculatorjavafx.control;

import at.mklestil.calculatorjavafx.model.MathModel;
import at.mklestil.calculatorjavafx.view.NumberButton;
import at.mklestil.calculatorjavafx.view.CalculatorScene;
import at.mklestil.calculatorjavafx.view.OperatorButton;
import javafx.event.Event;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class CalculatorController {

    private CalculatorScene view;

    private double number1 = 0;
    private double number2 = 0;

    private boolean check = false;

    private MathModel model = new MathModel();

    public CalculatorController(CalculatorScene view){
        this.view = view;

        //Set Event Handler on Buttons
        ArrayList<NumberButton> listOfButtons = view.getListOfButtons();
        for(NumberButton btn : listOfButtons){
            btn.setOnAction(myBtnHandler(btn));
        }

        //Set Event Handler for operation
        ArrayList<OperatorButton> operatorButtons = view.getListOfOperatorButtons();
        for(OperatorButton oBtn : operatorButtons){
            oBtn.setOnAction(myOperatorBtnHandler(oBtn));
        }
    }

    // Btn Logic
    public EventHandler myBtnHandler(NumberButton btn){
        EventHandler eventHandler = new EventHandler<>() {
            @Override
            public void handle(Event event) {
                view.setDisplay("" + btn.getValue());
                if (check == false){
                    number1 = btn.getValue();
                }else{
                    number2 = btn.getValue();
                }
            }
        };
        return eventHandler;
    }

    public EventHandler myOperatorBtnHandler(OperatorButton btn){
        EventHandler eventHandler = new EventHandler<>() {
            @Override
            public void handle(Event event) {
                view.setDisplay("" + btn.getTyp());
                System.out.println(btn.getTyp());
                if (!btn.getTyp().equals("Enter")){
                    check = true;
                }else {
                    System.out.println("Enter gedrückt, number1 " + number1 + " numb2 " + number2);
                }
            }
        };
        return eventHandler;
    }

}
