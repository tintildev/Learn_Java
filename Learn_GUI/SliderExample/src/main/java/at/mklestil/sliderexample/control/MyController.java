package at.mklestil.sliderexample.control;

import at.mklestil.sliderexample.view.MyView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.effect.SepiaTone;

public class MyController {
    private MyView view;

    public MyController(MyView view) {
        this.view = view;
        initializeListeners();
    }

    private void initializeListeners() {
        view.getOpacitySlider().valueProperty().addListener(createSliderListener(view.getOpacityValue(), "Opacity"));
        view.getSepiaSlider().valueProperty().addListener(createSliderListener(view.getSepiaValue(), "Sepia"));
        view.getScaleSlider().valueProperty().addListener(createSliderListener(view.getScaleValue(), "Scale"));
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
