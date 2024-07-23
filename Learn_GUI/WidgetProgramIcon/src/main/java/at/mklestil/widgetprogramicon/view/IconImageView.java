package at.mklestil.widgetprogramicon.view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class IconImageView extends ImageView {

    public IconImageView(String path) {
        Image image = new Image(getClass().getResourceAsStream("/images/" + path +""));
        this.setImage(image);

    }
}
