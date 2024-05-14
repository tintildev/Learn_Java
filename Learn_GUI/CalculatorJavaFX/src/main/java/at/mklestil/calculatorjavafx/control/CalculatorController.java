package at.mklestil.calculatorjavafx.control;

import at.mklestil.calculatorjavafx.view.CalcButton;
import at.mklestil.calculatorjavafx.view.CalculatorScene;
import javafx.event.Event;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class CalculatorController {

    public CalculatorController(CalculatorScene view){

        //Set Event Handler on Buttons
        ArrayList<CalcButton> listOfButtons = view.getListOfButtons();
        for(CalcButton btn : listOfButtons){
            btn.setOnAction(myCalcHandler(btn));
        }
    }

    // Btn Logic
    public EventHandler myCalcHandler(CalcButton btn){
        EventHandler eventHandler = new EventHandler<>() {
            @Override
            public void handle(Event event) {
                System.out.println(btn.getValue());
            }
        };
        return eventHandler;
    }
}
