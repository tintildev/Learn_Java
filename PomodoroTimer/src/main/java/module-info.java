module at.mklestil.pomodorotimer {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.mklestil.pomodorotimer to javafx.fxml;
    exports at.mklestil.pomodorotimer;
}