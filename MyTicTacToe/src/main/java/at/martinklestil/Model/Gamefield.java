package at.martinklestil.Model;

import at.martinklestil.View.GameButton;

import javax.swing.*;

public class Gamefield {

    private static JButton[][] gameArray = new JButton[3][3];

    public Gamefield(){

    }

    public void newCheesBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++ ){
                JButton temp = new GameButton();
                gameArray[i][j] = temp;
            }
        }
    }

    public JButton[][] getGameArray() {
        return gameArray;
    }
}
