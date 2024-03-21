package view;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PersonLabel extends JLabel {

    public  PersonLabel (String names){
        Border blackline = BorderFactory.createLineBorder(Color.black);
        Border margin = new EmptyBorder(10,10,10,10);
        this.setBorder(new CompoundBorder(blackline, margin));
        this.setText(names);
    }
}
