module at.mklestil.mysnakegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.mklestil.mysnakegame to javafx.fxml;
    exports at.mklestil.mysnakegame;
}