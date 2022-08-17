package at.martinklestil.controller;

import at.martinklestil.view.ReactionLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ReactionController implements ActionListener {

    private ArrayList<ReactionLabel> labels;

    public ReactionController(ArrayList<ReactionLabel> labels) {
        this.labels = labels;
    }

    private int zufallsgenerator(){
        int rand = (int)(Math.random() * 11) + 1;
        return rand;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        labels.get(zufallsgenerator()).startReaction();
    }
}
