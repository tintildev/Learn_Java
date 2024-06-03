package at.mklestil.shortcutexample.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class ShortCutView {

    private HBox root = new HBox();

    public ShortCutView() {
        ArrayList<Button> btnList = new ArrayList<Button>();
        btnList.add(new MyButton());
        btnList.add(new MyButton());
        btnList.add(new MyButton());
        btnList.add(new MyButton());
        btnList.add(new MyButton());

        for(Button btn : btnList){
            root.getChildren().add(btn);
        }

        root.setPrefSize(340,70);
        root.setSpacing(10.0);
        //Center
        root.setAlignment(Pos.CENTER);

    }

    public HBox getRoot() {
        return root;
    }
}
