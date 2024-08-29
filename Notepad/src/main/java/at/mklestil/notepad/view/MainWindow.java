package at.mklestil.notepad.view;

import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class MainWindow {
    private VBox root;
    private MenuBar menu;
    private TextArea textArea;

    public MainWindow() {
        root = new VBox();
        menu = new MyMenubar();
        textArea = new TextArea();

        root.getChildren().addAll(menu, textArea);
        VBox.setVgrow(textArea, Priority.ALWAYS);
    }

    public VBox getRoot() {
        return root;
    }

    public MenuBar getMenu(){
        return menu;
    }

    public TextArea getTextArea() {
        return textArea;
    }
}
