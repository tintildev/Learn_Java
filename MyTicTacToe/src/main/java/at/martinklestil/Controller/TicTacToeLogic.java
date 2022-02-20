package at.martinklestil.Controller;

import at.martinklestil.View.ControllPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToeLogic {

    private String result = "";
    private JButton[][] data;
    private ArrayList<JButton> listOfJButtons = new ArrayList<>();

    public TicTacToeLogic(JButton[][] theData){
        data = theData;
        listOfJButtons = dataToList(data);
    }

    public void checkGame(){
        boolean horizontal = threeHorizontal(data);
        boolean vertical = threeVertical(data);
        boolean diagonal = threeDiagonal(data);
        if (horizontal || vertical || diagonal == true){
            removeListener(listOfJButtons);
        }
    }

    private ArrayList<JButton> dataToList(JButton[][] data){
        ArrayList<JButton> list = new ArrayList<>();
        for(JButton[] buttons: data){
            list.addAll(Arrays.asList(buttons));
        }
        return list;
    }

    private void removeListener(ArrayList<JButton> buttons){
        for(JButton button : buttons){
            for(MouseListener mouse : button.getMouseListeners()){
                button.removeMouseListener(mouse);
            }
        }
    }

    private boolean threeHorizontal(JButton[][] theData){
        String[] line1 = new String[3];
        line1[0] = theData[0][0].getText();
        line1[1] = theData[0][1].getText();
        line1[2] = theData[0][2].getText();

        String[] line2 = new String[3];
        line2[0] = theData[1][0].getText();
        line2[1] = theData[1][1].getText();
        line2[2] = theData[1][2].getText();

        String[] line3 = new String[3];
        line3[0] = theData[2][0].getText();
        line3[1] = theData[2][1].getText();
        line3[2] = theData[2][2].getText();

        if(line1[0].equals("X") & line1[1].equals("X") & line1[2].equals("X")){
            System.out.println("True Line 1");
            theData[0][0].setBackground(Color.GREEN);
            theData[0][1].setBackground(Color.GREEN);
            theData[0][2].setBackground(Color.GREEN);
            result = "X hat gewonnen!";
            return true;
        }else if(line2[0].equals("X") & line2[1].equals("X") & line2[2].equals("X")){
            System.out.println("True Line 2");
            theData[1][0].setBackground(Color.GREEN);
            theData[1][1].setBackground(Color.GREEN);
            theData[1][2].setBackground(Color.GREEN);
            result = "X hat gewonnen!";
            return true;
        }else if(line3[0].equals("X") & line3[1].equals("X") & line3[2].equals("X")){
            System.out.println("True Line 3");
            theData[2][0].setBackground(Color.GREEN);
            theData[2][1].setBackground(Color.GREEN);
            theData[2][2].setBackground(Color.GREEN);
            result = "X hat gewonnen!";
            return true;
        }else if(line1[0].equals("0") & line1[1].equals("0") & line1[2].equals("0")){
            System.out.println("True Line 1");
            theData[0][0].setBackground(Color.GREEN);
            theData[0][1].setBackground(Color.GREEN);
            theData[0][2].setBackground(Color.GREEN);
            result = "0 hat gewonnen!";
            return true;
        }else if(line2[0].equals("0") & line2[1].equals("0") & line2[2].equals("0")){
            System.out.println("True Line 2");
            theData[1][0].setBackground(Color.GREEN);
            theData[1][1].setBackground(Color.GREEN);
            theData[1][2].setBackground(Color.GREEN);
            result = "0 hat gewonnen!";
            return true;
        }else if(line3[0].equals("0") & line3[1].equals("0") & line3[2].equals("0")){
            System.out.println("True Line 3");
            theData[2][0].setBackground(Color.GREEN);
            theData[2][1].setBackground(Color.GREEN);
            theData[2][2].setBackground(Color.GREEN);
            result = "0 hat gewonnen!";
            return true;
        }
        else{
            return false;
        }
    }

    private boolean threeVertical(JButton[][] theData){
        String[] row1 = new String[3];
        row1[0] = theData[0][0].getText();
        row1[1] = theData[1][0].getText();
        row1[2] = theData[2][0].getText();

        String[] row2 = new String[3];
        row2[0] = theData[0][1].getText();
        row2[1] = theData[1][1].getText();
        row2[2] = theData[2][1].getText();

        String[] row3 = new String[3];
        row3[0] = theData[0][2].getText();
        row3[1] = theData[1][2].getText();
        row3[2] = theData[2][2].getText();

        if(row1[0].equals("X") & row1[1].equals("X") & row1[2].equals("X")){
            System.out.println("True Row 1");
            theData[0][0].setBackground(Color.GREEN);
            theData[1][0].setBackground(Color.GREEN);
            theData[2][0].setBackground(Color.GREEN);
            result = "X hat gewonnen!";
            return true;
        }else if(row2[0].equals("X") & row2[1].equals("X") & row2[2].equals("X")){
            System.out.println("True Row 2 X");
            theData[0][1].setBackground(Color.GREEN);
            theData[1][1].setBackground(Color.GREEN);
            theData[2][1].setBackground(Color.GREEN);
            result = "X hat gewonnen!";
            return true;
        }else if(row3[0].equals("X") & row3[1].equals("X") & row3[2].equals("X")){
            System.out.println("True Row 3");
            theData[0][2].setBackground(Color.GREEN);
            theData[1][2].setBackground(Color.GREEN);
            theData[2][2].setBackground(Color.GREEN);
            result = "X hat gewonnen!";
            return true;
        }else if(row1[0].equals("0") & row1[1].equals("0") & row1[2].equals("0")){
            System.out.println("True Row 1");
            theData[0][0].setBackground(Color.GREEN);
            theData[1][0].setBackground(Color.GREEN);
            theData[2][0].setBackground(Color.GREEN);
            result = "0 hat gewonnen!";
            return true;
        }else if(row2[0].equals("0") & row2[1].equals("0") & row2[2].equals("0")){
            System.out.println("True Row 2 0");
            theData[0][1].setBackground(Color.GREEN);
            theData[1][1].setBackground(Color.GREEN);
            theData[2][1].setBackground(Color.GREEN);
            result = "0 hat gewonnen!";
            return true;
        }else if(row3[0].equals("0") & row3[1].equals("0") & row3[2].equals("0")){
            System.out.println("True Row 3");
            theData[0][2].setBackground(Color.GREEN);
            theData[1][2].setBackground(Color.GREEN);
            theData[2][2].setBackground(Color.GREEN);
            result = "0 hat gewonnen!";
            return true;
        }
        else{
            return false;
        }
    }

    private boolean threeDiagonal(JButton[][] theData){
        String[] dia1 = new String[3];
        dia1[0] = theData[2][0].getText();
        dia1[1] = theData[1][1].getText();
        dia1[2] = theData[0][2].getText();

        String[] dia2 = new String[3];
        dia2[0] = theData[2][2].getText();
        dia2[1] = theData[1][1].getText();
        dia2[2] = theData[0][0].getText();

        if(dia1[0].equals("X") & dia1[1].equals("X") & dia1[2].equals("X")){
            System.out.println("True Diagonal 1");
            theData[2][0].setBackground(Color.GREEN);
            theData[1][1].setBackground(Color.GREEN);
            theData[0][2].setBackground(Color.GREEN);
            result = "X hat gewonnen!";
            return true;
        }else if(dia2[0].equals("X") & dia2[1].equals("X") & dia2[2].equals("X")){
            System.out.println("True Diagonal 2 X");
            theData[2][2].setBackground(Color.GREEN);
            theData[1][1].setBackground(Color.GREEN);
            theData[0][0].setBackground(Color.GREEN);
            result = "X hat gewonnen!";
            return true;
        }else if(dia1[0].equals("0") & dia1[1].equals("0") & dia1[2].equals("0")){
            System.out.println("True Diagonal 2 X");
            theData[2][0].setBackground(Color.GREEN);
            theData[1][1].setBackground(Color.GREEN);
            theData[0][2].setBackground(Color.GREEN);
            result = "X hat gewonnen!";
            return true;
        }else if(dia2[0].equals("0") & dia2[1].equals("0") & dia2[2].equals("0")){
            System.out.println("True Diagonal 2 X");
            theData[2][2].setBackground(Color.GREEN);
            theData[1][1].setBackground(Color.GREEN);
            theData[0][0].setBackground(Color.GREEN);
            result = "X hat gewonnen!";
            return true;
        }

        else{
            return false;
        }
    }

}
