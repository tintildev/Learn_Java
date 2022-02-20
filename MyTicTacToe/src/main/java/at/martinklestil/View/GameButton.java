package at.martinklestil.View;

import at.martinklestil.Controller.GameListener;
import at.martinklestil.Model.Global;

import javax.swing.*;
import java.awt.*;

public class GameButton extends JButton {

    private boolean isX;
    private boolean check = false;

    public GameButton(){
        Global global = new Global();
        this.setText(" ");
        this.setFont(global.myFontDefault);
        this.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        this.setSize(50, 50);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
        this.addMouseListener(new GameListener(this));
    }

    public boolean isX() {
        return isX;
    }

    public void setX(boolean x) {
        isX = x;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
