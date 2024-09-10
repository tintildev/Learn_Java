package at.mklestil.sliderexample.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tooltip;

public class MyMenubar extends MenuBar {
    private MenuItem open = new MenuItem("Open");
    private MenuItem close = new MenuItem("Close");

    public MyMenubar() {
        Menu menu = new Menu("Data");
        menu.getItems().add(open);
        menu.getItems().add(close);
        this.getMenus().add(menu);

    }

    public MenuItem getOpen() {
        return open;
    }

    public MenuItem getClose() {
        return close;
    }
}
