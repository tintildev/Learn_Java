module at.mklestil.loginexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.mklestil.loginexample to javafx.fxml;
    exports at.mklestil.loginexample;
}