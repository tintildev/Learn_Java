package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.ToDo;
import data.ToDoDao;
import data.ToDoImpl;

public class myMousListener implements MouseListener {
	
	private ToDo toDoClicked;
	private Box mainWindow;
	private JLabel labelClicked;
	private ToDoDao data;
	
	
	public myMousListener(ToDo toDo, Box container, JLabel label, ToDoDao toDoDao) {
		toDoClicked = toDo;
		this.mainWindow = container;
		labelClicked = label;
		data = toDoDao;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Delet Event");
		data.deletToDos(toDoClicked);
		mainWindow.remove(labelClicked);
		mainWindow.revalidate();
		mainWindow.repaint();
		mainWindow.updateUI();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
