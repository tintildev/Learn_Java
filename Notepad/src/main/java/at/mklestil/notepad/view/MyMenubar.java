package at.mklestil.notepad.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import java.util.ArrayList;

public class MyMenubar extends MenuBar {

    private ArrayList<Menu> menuHeader = new ArrayList<Menu>();
    private ArrayList<MenuItem> menuItemsData = new ArrayList<MenuItem>();

    public MyMenubar() {
        Menu data = new Menu("Data");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");
        menuHeader.add(data);
        menuHeader.add(edit);
        menuHeader.add(view);

        for(Menu item : menuHeader){
            this.getMenus().add(item);
        }

        MenuItem open = new MenuItem("Open");
        MenuItem load = new MenuItem("Load");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        menuItemsData.add(open);
        menuItemsData.add(load);
        menuItemsData.add(save);
        menuItemsData.add(exit);

        for(MenuItem item: menuItemsData){
            data.getItems().add(item);
        }
    }
}
