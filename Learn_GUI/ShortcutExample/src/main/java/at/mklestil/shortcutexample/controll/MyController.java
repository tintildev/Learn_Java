package at.mklestil.shortcutexample.controll;

import at.mklestil.shortcutexample.model.MyClickHandler;
import at.mklestil.shortcutexample.view.MyButton;
import at.mklestil.shortcutexample.view.ShortCutView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class MyController {

    private ShortCutView view;
    private MyClickHandler clickHandler = new MyClickHandler();

    private ArrayList<MyButton> btnList = new ArrayList<MyButton>();

    public MyController(ShortCutView view) {
        this.view = view;

        btnList = view.getBtnList();

        for(MyButton btn : btnList){
            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    clickHandler.openBrowser(btn.getUrl());
                }
            });

        }

    }
}