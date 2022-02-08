package at.martinklestil.view;

import at.martinklestil.model.Global;

import javax.swing.*;
import java.awt.*;

public class ResultLabel extends JLabel {

    public ResultLabel() {
        this.setText("Result: ");
        this.setFont(new Global().myFontBig);
    }


}
