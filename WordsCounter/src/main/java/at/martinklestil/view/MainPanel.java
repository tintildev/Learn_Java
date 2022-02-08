package at.martinklestil.view;

import at.martinklestil.model.Global;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {

    private Global myGlobal;
    private ResultLabel result = new ResultLabel();

    public MainPanel(Global global){
        myGlobal = global;
        JLabel h1Label = new JLabel("Enter words:");
        h1Label.setFont(myGlobal.myFontBig);

        //Input
        JTextField input = new JTextField(10);
        input.setBackground(myGlobal.secondcolor);
        input.setFont(myGlobal.myFontDefault);

        //Button
        JButton button = new JButton("Start word counts");
        button.setFont(myGlobal.myFontDefault);
        button.setBackground(myGlobal.maincolor);
        button.setForeground(myGlobal.white);

        //ActionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = input.getText();
                String[] words = text.split(" ");
                result.setText("Result: " + words.length);
            }
        });

        this.add(h1Label);
        this.add(input);
        this.add(button);
        this.add(new JSeparator());
        this.add(result);
        //Center
        result.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(new JSeparator());

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground((myGlobal.white));

    }

}
