package at.mklestil.calculatorjavafx.control;

import at.mklestil.calculatorjavafx.view.NumberButton;
import at.mklestil.calculatorjavafx.view.CalculatorScene;
import javafx.event.Event;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class CalculatorController {

    private CalculatorScene view;

    public CalculatorController(CalculatorScene view){
        this.view = view;

        //Set Event Handler on Buttons
        ArrayList<NumberButton> listOfButtons = view.getListOfButtons();
        for(NumberButton btn : listOfButtons){
            btn.setOnAction(myCalcHandler(btn));
        }
    }

    // Btn Logic
    public EventHandler myCalcHandler(NumberButton btn){
        EventHandler eventHandler = new EventHandler<>() {
            @Override
            public void handle(Event event) {
                view.setDisplay("" + btn.getValue());
                System.out.println(btn.getValue());
            }
        };
        return eventHandler;
    }
}
