package at.mklestil.notepad.control;

import at.mklestil.notepad.model.OpenSaveExitModel;
import at.mklestil.notepad.model.FontModel;
import at.mklestil.notepad.view.MainWindow;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class MyController {
    private MainWindow view;
    public MyController(MainWindow mview) {
        view = mview;

        MenuBar menuBar = view.getMenu();
        Menu viewMenu = menuBar.getMenus().get(0);

        OpenSaveExitModel crudModel = new OpenSaveExitModel(viewMenu, mview);

        FontModel fontModel = new FontModel();

    }

}
