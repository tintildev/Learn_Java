package at.mklestil.notepad.model;

import at.mklestil.notepad.view.MainWindow;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Font;

import java.util.ArrayList;

public class FontModel {
    private MainWindow view;

    public FontModel(Menu menu, MainWindow view) {
        this.view = view;
        ArrayList<MenuItem> menu1 = new ArrayList<MenuItem>(menu.getItems());
        menu1.get(0).setOnAction(listenerFontPlus());
        menu1.get(1).setOnAction(listenerFontMinus());
        menu1.get(2).setOnAction(listenerFontArial());
        menu1.get(3).setOnAction(listenerFontHelvetica());
    }

    private EventHandler<ActionEvent> listenerFontHelvetica() {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                view.getTextArea().setFont(Font.font("Helvetica"));
            }
        };
        return event;
    }

    private EventHandler<ActionEvent> listenerFontArial() {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                view.getTextArea().setFont(Font.font("Arial"));
            }
        };
        return event;
    }

    private EventHandler<ActionEvent> listenerFontMinus() {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                view.getTextArea().setFont(Font.font(view.getTextArea().getFont().getSize() - 1));
            }
        };
        return event;
    }

    private EventHandler<ActionEvent> listenerFontPlus() {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                view.getTextArea().setFont(Font.font(view.getTextArea().getFont().getSize() + 1));
            }
        };
        return event;
    }
}
