package at.mklestil.notepad.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class Window {
    private VBox root;
    private MenuBar menu;
    private ArrayList<Menu> menuItems = new ArrayList<Menu>();
    private TextArea textArea;

    public Window() {
        root = new VBox();
        menu = new MenuBar();
        textArea = new TextArea();

        Menu data = new Menu("Data");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");
        menuItems.add(data);
        menuItems.add(edit);
        menuItems.add(view);

        for(Menu item : menuItems){
            menu.getMenus().add(item);
        }

        root.getChildren().addAll(menu, textArea);
    }

    public VBox getRoot() {
        return root;
    }
}
