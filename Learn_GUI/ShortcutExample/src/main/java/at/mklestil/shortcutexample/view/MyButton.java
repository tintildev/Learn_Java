package at.mklestil.shortcutexample.view;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MyButton extends Button {

    private String css = "";

    public MyButton() {
        this.setPrefSize(64,64);
    }

    public MyButton(String css, String imgPath){
        this.css = css;
        this.getStyleClass().add(this.css);
        this.setPrefSize(64,64);

        // Add Image
        ImageView imgView = new ImageView();

        try {
            Image image = new Image(getClass().getResourceAsStream(imgPath));
            imgView = new ImageView(image);
        }catch (Exception e){
            System.out.println("MyButton: Image Path not found! " + e);
        }

        this.setGraphic(imgView);
    }
}
