package controller;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.checkerframework.checker.units.qual.Length;

import data.ToDo;
import data.ToDoDao;
import data.ToDoImpl;
import model.Global;



public class KlickListener implements ActionListener {
	private Box container;
	private JTextField inputTextField;
	private JButton button;
	private JPanel mainWindow;
	private ToDoDao toDoDao;
	
	public KlickListener(JPanel mainPanel, JButton button, Box container, JTextField inputTextField) {
		mainWindow = mainPanel;
		this.container = container;
		this.inputTextField = inputTextField;
		this.button = button;
		
		toDoDao = new ToDoImpl();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			ToDo newToDo = new ToDo(Global.getCounter(), inputTextField.getText());
			toDoDao.saveToDos(newToDo);
			JLabel valueLabel = new JLabel();
			for (ToDo todo : toDoDao.getAllToDos()) {
				System.out.println(toDoDao.getAllToDos());
				valueLabel.setText(todo.getValue());
				valueLabel.addMouseListener(new myMousListener(newToDo, container, valueLabel, toDoDao));
				valueLabel.setFont(new Font(Global.getDefaultFont(), Font.PLAIN, 16));
				valueLabel.setForeground(Global.getWhite());
			}
			container.add(valueLabel);
			container.repaint();
			inputTextField.setText("");
			mainWindow.repaint();
			mainWindow.updateUI();
			
		}
		
	}
	
	
	

}
