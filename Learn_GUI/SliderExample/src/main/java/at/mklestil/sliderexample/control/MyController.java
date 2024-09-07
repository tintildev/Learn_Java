package at.mklestil.sliderexample.control;

import at.mklestil.sliderexample.model.FileModel;
import at.mklestil.sliderexample.view.MyMenubar;
import at.mklestil.sliderexample.view.MyView;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;

import java.io.File;

public class MyController {
    private MyView view;
    private FileModel fileModel;

    public MyController(MyView view) {
        this.view = view;
        this.fileModel = new FileModel();
        initializeListeners();
    }

    private void initializeListeners() {
        view.getOpacitySlider().valueProperty().addListener(createSliderListener(view.getOpacityValue(), "Opacity"));
        view.getSepiaSlider().valueProperty().addListener(createSliderListener(view.getSepiaValue(), "Sepia"));
        view.getScaleSlider().valueProperty().addListener(createSliderListener(view.getScaleValue(), "Scale"));

        // Menu
        MyMenubar menuBar = view.getMenu();
        menuBar.getOpen().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // use Filemodel to open data
                File file = fileModel.openFile(view.getRoot().getScene().getWindow());
                if (file != null) {
                    Image newImage = new Image(file.toURI().toString()); // load image
                    view.getImageView().setImage(newImage); // set new image
                    System.out.println("Datei geöffnet: " + file.getAbsolutePath());
                }
            }
        });
        menuBar.getClose().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });

    }




    private ChangeListener<Number> createSliderListener(Label valueLabel, String sliderName) {
        ChangeListener<Number> changeListener = new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                //The method sets the text to the new value, formatted to two decimal places
                valueLabel.setText(String.format("%.2f", newValue));

                //ToDo: Bild bearbeiten
                switch (sliderName){
                    case "Opacity":
                        view.getImageView().setOpacity((Double) newValue);
                        break;
                    case "Sepia":
                        SepiaTone sepiaTone = new SepiaTone();
                        sepiaTone.setLevel((Double) newValue);
                        view.getImageView().setEffect(sepiaTone);
                        break;
                    case "Scale":
                        view.getImageView().setScaleX((Double) newValue);
                        view.getImageView().setScaleY((Double) newValue);
                        break;
                    default:
                        break;
                }

            }
        };

        return changeListener;
    }
}
