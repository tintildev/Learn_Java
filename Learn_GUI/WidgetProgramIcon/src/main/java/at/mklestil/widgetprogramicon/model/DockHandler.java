package at.mklestil.widgetprogramicon.model;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class DockHandler {

    EventHandler<MouseEvent> mouseEventEventHandler;

    public DockHandler() {

    }

    public EventHandler<MouseEvent> getMouseEventEventHandler(){
        mouseEventEventHandler = new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton().equals((MouseButton.PRIMARY))) {
                    if(mouseEvent.getClickCount() == 2){
                        Platform.exit();
                    }
                }
            }
        };
        return mouseEventEventHandler;
    }


}
