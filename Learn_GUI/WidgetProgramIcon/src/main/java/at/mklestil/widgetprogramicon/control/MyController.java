package at.mklestil.widgetprogramicon.control;

import at.mklestil.widgetprogramicon.model.DockHandler;
import at.mklestil.widgetprogramicon.model.IconHandler;
import at.mklestil.widgetprogramicon.view.IconImageView;
import at.mklestil.widgetprogramicon.view.MyView;

import java.util.ArrayList;

public class MyController {
    private  MyView view;

    public MyController(MyView view) {
        this.view = view;
        DockHandler dockHandler = new DockHandler();

        //Add Event Handler, exit by 2 clicks
        this.view.getImageViewDock().setOnMouseClicked(dockHandler.getMouseEventEventHandler());

        //Add Event Handler Icons
        ArrayList<IconImageView> iconsList = view.getIconsList();
        for ( int i = 0; i < iconsList.size(); i++){
            iconsList.get(i).setOnMouseClicked(new IconHandler(iconsList.get(i).getPath()).getEventHandler());
        }
    }
}
