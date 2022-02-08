package at.martinklestil.view;

import at.martinklestil.model.Global;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private String titel = "Words Counter App";
    private Global global = new Global();

    public MainFrame(){
        FooterPanel footerPanel = new FooterPanel(global);
        MainPanel mainPanel = new MainPanel(global);


        this.setLayout(new BorderLayout());
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(footerPanel, BorderLayout.SOUTH);
        this.setTitle(titel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.setVisible(true);
    }
}
