package at.martinklestil.controller;

import at.martinklestil.view.ReactionLabel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class KlickListener implements MouseListener {

    private ReactionLabel reactionLabel;

    public KlickListener(ReactionLabel reactionLabel) {
        this.reactionLabel = reactionLabel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(reactionLabel.isRed){
            reactionLabel.stoppReaction();
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
