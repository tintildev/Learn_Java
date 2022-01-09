package at.martinklestil.view;

import at.martinklestil.controller.ReactionController;
import at.martinklestil.model.Global;
import at.martinklestil.model.Scoure;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainPanel extends JPanel {

    private static Scoure scoure;

    public MainPanel(Global myGlobal) {

        //Head - Titel, Buttons
        JPanel headPanel = new JPanel();
        headPanel.setLayout(new BoxLayout(headPanel, BoxLayout.Y_AXIS));
        JLabel titel = new JLabel(myGlobal.getTitle());
        headPanel.add(titel);
        JButton startButton = new JButton("Starten");
        JLabel scoreLabel = new JLabel();
        scoure = new Scoure(scoreLabel);
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.X_AXIS));
        buttonsPanel.add(startButton);
        buttonsPanel.add(scoreLabel);
        headPanel.setBackground(myGlobal.getWhite());
        headPanel.add(buttonsPanel);

        // Center Labels for reaction
        JPanel centerPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(3,4);
        gridLayout.setHgap(25);
        gridLayout.setVgap(25);
        centerPanel.setLayout(gridLayout);
        centerPanel.setBackground(myGlobal.getMaincolor());

        // create
        ArrayList<ReactionLabel> theLabels = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            ReactionLabel tempLabel = new ReactionLabel(" ", myGlobal, scoure );
            theLabels.add(tempLabel);
        }
        // add
        for(JLabel label : theLabels){
            centerPanel.add(label);
        }

        //start
        startButton.addActionListener(new ReactionController(theLabels));

        // MainPanel add Content
        this.setLayout(new BorderLayout());
        this.add(headPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.setBackground(myGlobal.getWhite());
    }
}
