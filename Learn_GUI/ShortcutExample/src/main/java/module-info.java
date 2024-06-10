module at.mklestil.shortcutexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens at.mklestil.shortcutexample to javafx.fxml;
    exports at.mklestil.shortcutexample;
    exports at.mklestil.shortcutexample.controll;
    opens at.mklestil.shortcutexample.controll to javafx.fxml;
}