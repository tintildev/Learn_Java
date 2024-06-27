package at.mklestil.loginexample.controll;

import at.mklestil.loginexample.view.MyView;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MyController {

    private MyView view;
    public MyController(MyView view) {
        this.view = view;
        Button btn = view.getBtn();
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED,getEventHandler());
    }

    public EventHandler getEventHandler (){
        EventHandler eventHandler = new EventHandler() {
            @Override
            public void handle(Event event) {
                String user = view.getUser().getText();
                String pw = view.getPw().getText();
                if(user.equals("Hello") && pw.equals("World")){
                    System.out.println(user + " " + pw);
                }
            }
        };
        return eventHandler;
    }
}
