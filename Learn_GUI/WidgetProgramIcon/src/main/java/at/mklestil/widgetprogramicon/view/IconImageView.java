package at.mklestil.widgetprogramicon.view;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class IconImageView extends ImageView {

    String path = "";

    public IconImageView(String path) {
        this.path = path;
        Image image = new Image(getClass().getResourceAsStream("/images/" + this.path +""));
        this.setImage(image);
        this.setScaleY(0.8);
        this.setScaleX(0.8);
        this.zoomIn(this);
        this.zoomOut(this);

    }

    public void zoomIn(ImageView icon){
        icon.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                icon.setScaleX(1.0);
                icon.setScaleY(1.0);
            }
        });
    }

    public void zoomOut(ImageView icon){
        icon.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                icon.setScaleX(0.8);
                icon.setScaleY(0.8);
            }
        });
    }

    public String getPath() {
        return path;
    }
}
