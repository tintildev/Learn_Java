package at.martinklestil.Controller;

import at.martinklestil.Model.Gamefield;
import at.martinklestil.View.GameButton;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameListener implements MouseListener {

    private static int counter = 0;
    private GameButton gameButton;

    public GameListener(GameButton gamePanel) {
        this.gameButton = gamePanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        TicTacToeLogic logic = new TicTacToeLogic(new Gamefield().getGameArray());

        if(gameButton.isCheck() == false){
            if(counter % 2 == 0){
                gameButton.setText("X");
                counter = counter + 1;
                gameButton.setX(true);
                gameButton.setCheck(true);
                logic.checkGame();
            }else{
                gameButton.setText("0");
                counter = counter + 1;
                gameButton.setX(false);
                gameButton.setCheck(true);
                logic.checkGame();
            }
        }
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
}
