module at.mklestil.calculatorjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.mklestil.calculatorjavafx to javafx.fxml;
    exports at.mklestil.calculatorjavafx;
}