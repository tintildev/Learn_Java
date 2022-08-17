package at.martinklestil.view;
import at.martinklestil.model.Global;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private final Global myGlobal = new Global();
    private final JPanel northPanel = new JPanel();
    private final JPanel footerPanel = new FooterPanel(myGlobal);
    private final JPanel mainPanel = new MainPanel(myGlobal);


    public MainFrame() throws HeadlessException {

        northPanel.add(new JLabel(myGlobal.getTitle()));


        // Add content to the window.
        this.setLayout(new BorderLayout());
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(footerPanel, BorderLayout.SOUTH);
        this.setTitle(myGlobal.getTitle());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.setVisible(true);

    }
}
