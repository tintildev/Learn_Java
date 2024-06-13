module at.mklestil.propertyexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.mklestil.propertyexample to javafx.fxml;
    exports at.mklestil.propertyexample;
}