package at.mklestil.mysnakegame.view;

import at.mklestil.mysnakegame.model.SnakeModel;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.io.InputStream;

public class Food extends Rectangle {

    public Food(){
        // Initialize the food view
        startGUI();
    }

    private void startGUI() {
        super.setWidth(SnakeModel.BLOCK_SIZE);
        super.setHeight(SnakeModel.BLOCK_SIZE);

        // Load the image from resources
        InputStream imageStream = getClass().getResourceAsStream("/img/Apfel.png");
        if (imageStream != null) {
            Image foodImage = new Image(imageStream);
            ImagePattern imagePattern = new ImagePattern(foodImage);
            super.setFill(imagePattern);
        } else {
            // Fallback, falls das Bild nicht gefunden wird
            super.setFill(javafx.scene.paint.Color.RED);
        }
    }
}

