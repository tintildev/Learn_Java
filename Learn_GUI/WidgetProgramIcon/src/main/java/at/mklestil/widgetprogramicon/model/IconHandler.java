package at.mklestil.widgetprogramicon.model;

import at.mklestil.widgetprogramicon.view.IconImageView;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class IconHandler  {

    //"Home.png", "IDE.png", "Mail.png", "Explorer.png"
    private EventHandler eventHandler;

    public IconHandler(String path) {

        eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (path.equals("Home.png")){
                    System.out.println("Home");
                } else if (path.equals("IDE.png")) {
                    System.out.println("IDE");
                }else if (path.equals("Mail.png")) {
                    System.out.println("Mail");
                }else if (path.equals("Explorer.png")) {
                    System.out.println("Explorer");
                }else {
                    System.out.println("Fehler");
                }
            }
        };

    }

    public EventHandler getEventHandler() {
        return eventHandler;
    }
}
