package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMenuBar extends JMenuBar {

    /**
     *
     */
    private static final long serialVersionUID = 6843050961455322606L;

    private MainFrame mainFrame;
    private JPanel formularPanel;
    private JPanel datenPanel;


    public MyMenuBar(MainFrame mainFrame) {
        formularPanel = mainFrame.getFormularPanel();
        datenPanel = mainFrame.getDatenPanel();
        this.mainFrame = mainFrame;
    }

    public void setStartseitenListener(JMenu menu){
        menu.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                mainFrame.remove(datenPanel);
                mainFrame.add(formularPanel, BorderLayout.CENTER);
                mainFrame.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    };

    public void setDatenListener(JMenu menu){
        menu.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                mainFrame.remove(datenPanel);
                mainFrame.add(formularPanel, BorderLayout.CENTER);
                mainFrame.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    };

}
