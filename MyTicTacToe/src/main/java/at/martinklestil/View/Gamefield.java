package at.martinklestil.View;

import at.martinklestil.Model.Global;

import javax.swing.*;
import java.awt.*;

public class Gamefield extends JFrame {

    private JPanel gamePanel = new JPanel();

    public Gamefield(int with, int height){
        Global global = new Global();
        JLabel titelLabel = new JLabel("Welcome by my tic tac toe game.");
        titelLabel.setFont(global.myFontDefault);

        //Game
        gamePanel.setLayout(new GridLayout(3, 3));
        gamePanel.setSize(150,150);
        at.martinklestil.Model.Gamefield cheesBoard = new at.martinklestil.Model.Gamefield();
        cheesBoard.newCheesBoard();
        JButton[][] gameArray = new at.martinklestil.Model.Gamefield().getGameArray();
        addCheesboard(gameArray);

        //Controller
        ControllPanel gameController = new ControllPanel(this);


        this.setLayout(new BorderLayout());
        this.add(titelLabel, BorderLayout.NORTH);
        this.add(gamePanel, BorderLayout.CENTER);
        this.add(gameController, BorderLayout.SOUTH);
        this.setTitle("My Java Tic Tac Toe Game");
        this.setVisible(true);
        this.setSize(with, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addCheesboard(JButton[][] values){
        gamePanel.removeAll();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                gamePanel.add(values[i][j]);
            }
        }

        gamePanel.updateUI();

    }

    public JPanel getGamePanel() {
        return gamePanel;
    }
}
