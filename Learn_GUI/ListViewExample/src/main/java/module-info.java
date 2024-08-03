module at.mklestil.listviewexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.mklestil.listviewexample to javafx.fxml;
    exports at.mklestil.listviewexample;
}