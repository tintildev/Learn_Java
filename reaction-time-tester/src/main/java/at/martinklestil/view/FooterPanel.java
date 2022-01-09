package at.martinklestil.view;

import at.martinklestil.model.Global;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {

    public FooterPanel(Global myGlobal) {

        Global global = new Global();

        // Elemente
        JLabel centerSouth = new JLabel("2021 Martin Klestil");
        JLabel versionDate = new JLabel ("Version " + global.getVersion() +" vom "+ global.getVersionDate());
        centerSouth.setBackground(myGlobal.getBlack());
        versionDate.setBackground(myGlobal.getBlack());

        //Hinzufügen
        this.setLayout(new BorderLayout());
        this.add(versionDate, BorderLayout.EAST);
        this.add(centerSouth, BorderLayout.WEST);
        this.setBackground(myGlobal.getWhite());


    }

}
