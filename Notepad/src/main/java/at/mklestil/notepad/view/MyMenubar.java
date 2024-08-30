package at.mklestil.notepad.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import java.util.ArrayList;

public class MyMenubar extends MenuBar {

    private ArrayList<Menu> menuHeader = new ArrayList<Menu>();

    public MyMenubar() {

        this.getMenus().add(getDataMenu());
        this.getMenus().add(getDataEdit());
        this.getMenus().add(getDataFormat());
        this.getMenus().add(getDataView());

    }

    public Menu getDataMenu(){
        ArrayList<MenuItem> menuItemsData = new ArrayList<MenuItem>();
        Menu data = new Menu("Data");

        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        menuItemsData.add(open);
        menuItemsData.add(save);
        menuItemsData.add(exit);

        for(MenuItem item: menuItemsData){
            data.getItems().add(item);
        }

        return data;
    }

    public Menu getDataEdit(){
        ArrayList<MenuItem> menuItemsEdit = new ArrayList<MenuItem>();
        Menu edit = new Menu("Edit");

        MenuItem menuItem1 = new MenuItem("Cut");
        MenuItem menuItem2 = new MenuItem("Copy");
        MenuItem menuItem3 = new MenuItem("Past");
        MenuItem menuItem4 = new MenuItem("Delete");
        menuItemsEdit.add(menuItem1);
        menuItemsEdit.add(menuItem2);
        menuItemsEdit.add(menuItem3);
        menuItemsEdit.add(menuItem4);

        for(MenuItem item: menuItemsEdit){
            edit.getItems().add(item);
        }

        return edit;
    }

    public Menu getDataFormat(){
        ArrayList<MenuItem> menuItemsFormat = new ArrayList<MenuItem>();
        Menu format = new Menu("Format");

        MenuItem menuItem1 = new MenuItem("Font size +");
        MenuItem menuItem2 = new MenuItem("Font size -");
        MenuItem menuItem3 = new MenuItem("Font Arial");
        MenuItem menuItem4 = new MenuItem("Font ....");
        menuItemsFormat.add(menuItem1);
        menuItemsFormat.add(menuItem2);
        menuItemsFormat.add(menuItem3);
        menuItemsFormat.add(menuItem4);

        for(MenuItem item: menuItemsFormat){
            format.getItems().add(item);
        }

        return format;
    }

    public Menu getDataView(){
        ArrayList<MenuItem> menuItemsView = new ArrayList<MenuItem>();
        Menu view = new Menu("View");

        MenuItem open = new MenuItem("Open");
        MenuItem load = new MenuItem("Load");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        menuItemsView.add(open);
        menuItemsView.add(load);
        menuItemsView.add(save);
        menuItemsView.add(exit);

        for(MenuItem item: menuItemsView){
            view.getItems().add(item);
        }

        return view;
    }
}
