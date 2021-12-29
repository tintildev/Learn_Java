package view;

import javax.swing.*;

import controller.KlickListener;
import model.Global;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel mainPanel;
	
	private MainPanel(){
    	mainPanel = this;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.white);
        
        /* The class is called javax.swing.Box and acts like a container.
           The BoxLayout layout manager is automatically assigned to the box object. */
        Box center = new Box(BoxLayout.Y_AXIS);
        //Background Color
        center.setBackground(Global.getMaincolor());
        center.setOpaque(true);
        
        JLabel h1Label = new JLabel("TO DO LIST");
        h1Label.setFont(new Font(Global.getDefaultFont(), Font.PLAIN, 25));
        h1Label.setForeground(Global.getWhite());
        //Center
        h1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        
        JTextField input = new JTextField("Add To Do", 30);
        input.setForeground(Global.getBlack());
        input.setBackground(Global.getSecondcolorLight());
        input.setFont(new Font(Global.getDefaultFont(), Font.PLAIN, 16));
        input.setBorder(BorderFactory.createLineBorder(Global.getBlack()));
        
        JButton button = new JButton(" + ");
        button.setForeground(Global.getGrey());
        button.setBackground(Global.getSecondcolor());
        button.setFont(new Font(Global.getDefaultFont(), Font.PLAIN, 16));
        button.setBorder(BorderFactory.createLineBorder(Global.getBlack()));
        
        inputPanel.add(input);
        inputPanel.add(button);
        inputPanel.setOpaque(false);
        	
        center.add(h1Label);
        center.add(inputPanel);
        
        JPanel toDos = new JPanel();
        toDos.setLayout(new FlowLayout());
        toDos.setBackground(Global.getSecondcolor());
        toDos.setOpaque(true);
        Box toDoList = new Box(BoxLayout.Y_AXIS);
        toDos.add(toDoList);
        
        //Controll
      	button.addActionListener(new KlickListener(this, button, toDoList, input));
		
        
        
        this.add(center);
        this.add(toDos);
        

    }

	public static JPanel getInstance() {
    	if (mainPanel == null) {
    		mainPanel = new MainPanel();
    	}
    	return mainPanel;
    }
}
