module at.mklestil.sliderexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.mklestil.sliderexample to javafx.fxml;
    exports at.mklestil.sliderexample;
}