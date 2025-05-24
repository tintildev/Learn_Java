module at.mklestil.mysnakegame {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens at.mklestil.mysnakegame to javafx.fxml;
    exports at.mklestil.mysnakegame;
}