package at.mklestil.shortcutexample.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class ShortCutView {

    private HBox root = new HBox();
    private ArrayList<MyButton> btnList = new ArrayList<MyButton>();

    public ShortCutView() {

        MyButton btn1 = new MyButton("btn", "/images/home.png", "www.google.at");
        MyButton btn2 = new MyButton("btn", "/images/world.png", "www.google.at");
        MyButton btn3 = new MyButton("btn", "/images/linkedin.png", "https://www.linkedin.com/feed/");
        MyButton btn4 = new MyButton("btn", "/images/Stack.png", "https://stackoverflow.com/");

        btnList.add(btn1);
        btnList.add(btn2);
        btnList.add(btn3);
        btnList.add(btn4);




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

    public ArrayList<MyButton> getBtnList() {
        return btnList;
    }
}
