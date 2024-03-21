package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class MainFrame extends JFrame  {

    private String titel = "Auswertung";
	private JPanel sidebar = new JPanel();
	private JPanel footerPanel = new FooterPanel();
	private FormularPanel formularPanel;
    private DatenPanel datenPanel;

    private JPanel mainPanel;



    public MainFrame() throws HeadlessException {
        formularPanel = new FormularPanel();
        datenPanel = new DatenPanel();
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0 , 0));

        // ------------------------northPanel
        Color color = Color.decode("#55C57A");
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(color);

        JMenuBar sideMenuBar = new MyMenuBar(this);
        sideMenuBar.setLayout(new BoxLayout(sideMenuBar, BoxLayout.Y_AXIS));
        sideMenuBar.setBackground(Color.BLACK);
        sidebar.add(sideMenuBar, BorderLayout.WEST);

        // Seitliches Menüelement 1
        JMenu homeMenu = new JMenu("Startseite");
        homeMenu.setForeground(Color.WHITE);
        sideMenuBar.add(homeMenu);

        // Seitliches Menüelement 2
        JMenu datenMenu = new JMenu("Daten");
        datenMenu.setForeground(Color.WHITE);
        //datenMenu.setPreferedSize(new Dimension(100, 100));
        sideMenuBar.add(datenMenu);

        JMenu info = new JMenu("Kontakt");
        info.setForeground(Color.WHITE);
        sideMenuBar.add(info);
        //JMenu copy = new JMenu("Copyright");


        //Menü
        sidebar.setLayout(new BorderLayout());
        sidebar.add(colorPanel, BorderLayout.EAST);
        sidebar.add(sideMenuBar, BorderLayout.CENTER);
        sidebar.setPreferredSize(new Dimension(200, getHeight()));

        // Add content to the window.
        this.setLayout(new BorderLayout());
        this.add(sidebar, BorderLayout.WEST);
        formularPanel.setPreferredSize(new Dimension(200, 800));
        //datenPanel.setPreferredSize(new Dimension(600, 800));


        mainPanel.add(formularPanel);
        mainPanel.add(datenPanel);
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(footerPanel, BorderLayout.SOUTH);
        this.setTitle(titel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    public FormularPanel getFormularPanel() {
        return formularPanel;
    }

    public DatenPanel getDatenPanel() {
        return datenPanel;
    }
}

