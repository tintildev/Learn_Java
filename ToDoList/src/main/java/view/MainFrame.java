package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame  {

    private String titel = "ToDo App";
	private JPanel northPanel = new JPanel();
	private JPanel footerPanel = new FooterPanel();
	private static JPanel mainPanel;



    public MainFrame() throws HeadlessException {
    	mainPanel = MainPanel.getInstance();

        // Add content to the window.
     	this.setLayout(new BorderLayout());
     	this.add(mainPanel, BorderLayout.CENTER);
     	this.add(footerPanel, BorderLayout.SOUTH);
        this.setTitle(titel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.setVisible(true);
    }
}
