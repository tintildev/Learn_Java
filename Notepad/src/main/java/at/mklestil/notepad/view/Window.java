package at.mklestil.notepad.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class Window {
    private VBox root;
    private MyMenubar menu;
    private TextArea textArea;

    public Window() {
        root = new VBox();
        menu = new MyMenubar();
        textArea = new TextArea();

        root.getChildren().addAll(menu, textArea);
        VBox.setVgrow(textArea, Priority.ALWAYS);
    }

    public VBox getRoot() {
        return root;
    }
}
