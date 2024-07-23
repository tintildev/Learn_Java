module at.mklestil.widgetprogramicon {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens at.mklestil.widgetprogramicon to javafx.fxml;
    exports at.mklestil.widgetprogramicon;
}