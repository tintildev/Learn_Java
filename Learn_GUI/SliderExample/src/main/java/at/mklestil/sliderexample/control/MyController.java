package at.mklestil.sliderexample.control;

import at.mklestil.sliderexample.view.MyView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;

public class MyController {
    private MyView view;

    public MyController(MyView view) {
        this.view = view;
        initializeListeners();
    }

    private void initializeListeners() {
        view.getOpacitySlider().valueProperty().addListener(createSliderListener(view.getOpacityValue()));
        view.getSepiaSlider().valueProperty().addListener(createSliderListener(view.getSepiaValue()));
        view.getScaleSlider().valueProperty().addListener(createSliderListener(view.getScaleValue()));
    }

    private ChangeListener<Number> createSliderListener(Label valueLabel) {
        ChangeListener<Number> changeListener = new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                //The method sets the text to the new value, formatted to two decimal places
                valueLabel.setText(String.format("%.2f", newValue));
            }
        };

        return changeListener;
    }
}
