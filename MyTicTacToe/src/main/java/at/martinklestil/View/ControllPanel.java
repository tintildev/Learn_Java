package at.martinklestil.View;

import at.martinklestil.Controller.RestartController;
import at.martinklestil.Model.Gamefield;
import at.martinklestil.Model.Global;

import javax.swing.*;
import java.awt.*;

public class ControllPanel extends JPanel{

    private JLabel result = new JLabel("");
    private JButton restart = new JButton("restart");
    private Gamefield mainFrame;

    public ControllPanel(Gamefield mainFrame){
        Global global = new Global();
        this.mainFrame = mainFrame;

        //Side
        JLabel player1 = new JLabel("Player 1 = X");
        player1.setFont(global.myFontDefault);
        JLabel player2 = new JLabel("Player 2 = 0");
        player2.setFont(global.myFontDefault);

        restart.addActionListener(new RestartController(this.mainFrame));

        this.setLayout(new GridLayout(2, 2));
        this.add(player1);
        this.add(player2);
        this.add(result);
        this.add(restart);
    }



}
