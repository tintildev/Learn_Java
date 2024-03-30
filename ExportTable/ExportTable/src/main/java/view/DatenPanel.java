package view;

import model.Person;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class DatenPanel extends JPanel {

	private JPanel infosPanel = new JPanel();
	private JPanel rowDataPanel = new JPanel();


	private ArrayList<String> infos;

	private ArrayList<JComboBox> comboBoxesArray= new ArrayList<>();

	private JButton sendData = new JButton("Daten laden");


	public DatenPanel() {
		infosPanel.setLayout(new BoxLayout(infosPanel, BoxLayout.Y_AXIS));
		this.setLayout(new GridLayout(3,1));
		JLabel info = new JLabel("Daten:");
		this.add(info);
	}


	public void setFirstRowData(ArrayList<String> firstRowData) {
		System.out.println("Daten erste Zeile:" + firstRowData);
		JPanel comboPanel = new JPanel();
		JPanel dataHoldPanel = new JPanel();
		dataHoldPanel.setLayout(new GridLayout(1,0));
		JLabel tableDatenLabel = new JLabel("Daten aus Tabelle");
		JLabel comboLabel = new JLabel("Bitte Auswahlen:");
		dataHoldPanel.add(tableDatenLabel);
		dataHoldPanel.add(comboLabel);

		for (int i = 0; i <firstRowData.size(); i++ ){
			//Daten
			rowDataPanel.add(new JLabel(firstRowData.get(i)));
			//Combobox
			JComboBox temp = new JComboBox<String>(infos.toArray(new String[infos.size()]));
			comboBoxesArray.add(temp);
			comboPanel.add(temp);

		}
		rowDataPanel.setLayout(new GridLayout(firstRowData.size(), 0));
		comboPanel.setLayout(new GridLayout(firstRowData.size(), 0));
		dataHoldPanel.add(rowDataPanel);
		dataHoldPanel.add(comboPanel);
		this.add(dataHoldPanel);
		this.add(sendData);
		this.revalidate();
		this.repaint();
	}

	public ArrayList<JComboBox> getComboBoxesArray() {
		return comboBoxesArray;
	}

	public JButton getSendData() {
		return sendData;
	}

	public void setInfos(ArrayList<String> infos) {
		this.infos = infos;
		//Set Infos
		JPanel infosPanel = new JPanel();
		infosPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0 , 0));
		for (int i = 1; i < infos.size(); i++ ){
			infosPanel.add(new PersonLabel(infos.get(i)));
		}
		this.infosPanel.add(infosPanel);
		this.add(this.infosPanel);
		this.add(new JLabel("Eingelesene Daten:"));
		this.revalidate();
		this.repaint();

	}
}
