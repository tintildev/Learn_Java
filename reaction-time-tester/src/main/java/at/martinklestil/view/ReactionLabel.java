package at.martinklestil.view;

import at.martinklestil.controller.KlickListener;
import at.martinklestil.model.Global;
import at.martinklestil.model.Scoure;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class ReactionLabel extends JLabel {

    private Global myGlobal;
    private Scoure scoure;
    public boolean isRed = false;

    public ReactionLabel(String text, Global global, Scoure scoure) {
        super(text);
        myGlobal = global;
        this.scoure = scoure;

        //Style
        Border border = LineBorder.createGrayLineBorder();
        this.setBackground(myGlobal.getSecondcolor());
        this.setForeground(myGlobal.getBlack());
        this.setBorder(border);
        this.setOpaque(true);

        //Listener
        this.addMouseListener(new KlickListener(this));

    }

    //start reaction
    public void startReaction(){
        //color
        this.setText("Click me!");
        this.setBackground(myGlobal.getRed());
        this.setForeground(myGlobal.getWhite());
        isRed = true;
        scoure.setStart(System.nanoTime());
    }

    public void stoppReaction(){
        this.setText(" ");
        this.setBackground(myGlobal.getSecondcolor());
        this.setForeground(myGlobal.getBlack());
        isRed = false;

        scoure.setStop(System.nanoTime());
    }

}
