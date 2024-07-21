package at.mklestil.widgetprogramicon.view;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class MyView {
    private Group root = new Group();

    private final String[] icons = {"browser.png", "ide.png", "mail.png", "textfile.png" };

    public MyView() {

        //Dock
        ImageView imageview = new ImageView(new Image("../Image/Dock.png"));
    }

    public Group getRoot() {
        return root;
    }
}
