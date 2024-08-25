module at.mklestil.notepad {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.mklestil.notepad to javafx.fxml;
    exports at.mklestil.notepad;
}