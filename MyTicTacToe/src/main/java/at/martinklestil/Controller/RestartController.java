package at.martinklestil.Controller;

import at.martinklestil.Model.Gamefield;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestartController implements ActionListener {

    private at.martinklestil.View.Gamefield mainFrame;

    public RestartController(at.martinklestil.View.Gamefield mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Gamefield cheesBoard = new Gamefield();
        cheesBoard.newCheesBoard();
        JButton[][] gameArray = cheesBoard.getGameArray();
        mainFrame.addCheesboard(gameArray);

    }
}
