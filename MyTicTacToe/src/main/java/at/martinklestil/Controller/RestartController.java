package at.martinklestil.Controller;

import at.martinklestil.Model.Gamefield;
import at.martinklestil.View.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestartController implements ActionListener {

    private MainFrame mainFrame;

    public RestartController(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Gamefield cheesBoard = new Gamefield();
        cheesBoard.newCheesBoard();
        JButton[][] gameArray = cheesBoard.getGameArray();
        mainFrame.addChessboard(gameArray);

    }
}
