package at.martinklestil.view;

import at.martinklestil.model.Global;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {

    public FooterPanel(Global global){
        Global myGlobal = global;

        //Elemente
        JLabel versionLabel = new JLabel("Version " + myGlobal.version + " " + myGlobal.versionDate);
        JLabel copyrightLabel = new JLabel(myGlobal.copyright);

        //hinzufügen
        this.setLayout((new BorderLayout()));
        this.add(versionLabel, BorderLayout.EAST);
        this.add(copyrightLabel, BorderLayout.WEST);
    }
}
