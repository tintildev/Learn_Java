package at.mklestil.sliderexample.model;

import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;

public class FileModel {
    public File openFile(Window ownerWindow) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif")
        );

        return fileChooser.showOpenDialog(ownerWindow);
    }
}
