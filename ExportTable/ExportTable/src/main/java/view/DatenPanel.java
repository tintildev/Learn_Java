package view;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class DatenPanel extends JPanel {

	private JPanel infosPanel = new JPanel();
	private JPanel rowDataPanel = new JPanel();


	private ArrayList<String> infos = new ArrayList<>();


	public DatenPanel() {
		infosPanel.setLayout(new BoxLayout(infosPanel, BoxLayout.Y_AXIS));

		this.setLayout(new GridLayout(3,1));

		JLabel info = new JLabel("Daten:");
		this.add(info);

		infos.add("Auswahl:");
		infos.add("DatabaseId");
		infos.add("uudi");
		infos.add("Title");
		infos.add("Funktion");
		infos.add("Firma");
		infos.add("Vorname");
		infos.add("Nachname");
		infos.add("Geburtstag");
		infos.add("Adresse");
		infos.add("Ort");
		infos.add("Telefon");
		infos.add("E-mail");
		infos.add("Land");
		infos.add("Info1");
		infos.add("Info2");
		infos.add("Info3");

		//Set Infos
		JPanel infosPanel = new JPanel();
		infosPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0 , 0));
		for (int i = 1; i < infos.size(); i++ ){
			infosPanel.add(new PersonLabel(infos.get(i)));
		}

		this.infosPanel.add(infosPanel);
		this.add(this.infosPanel);
		this.add(new JLabel("Eingelesene Daten:"));

	}


	public void setFirstRowData(ArrayList<String> firstRowData) {
		System.out.println("Daten erste Zeile:" + firstRowData);
		JPanel comboPanel = new JPanel();
		JPanel dataHoldPanel = new JPanel();
		dataHoldPanel.setLayout(new GridLayout(1,0));

		for (int i = 0; i <firstRowData.size(); i++ ){
			//Daten
			rowDataPanel.add(new JLabel(firstRowData.get(i)));
			//Combobox
			JComboBox temp = new JComboBox<String>(infos.toArray(new String[infos.size()]));
			comboPanel.add(temp);

		}
		rowDataPanel.setLayout(new GridLayout(firstRowData.size(), 0));
		comboPanel.setLayout(new GridLayout(firstRowData.size(), 0));
		dataHoldPanel.add(rowDataPanel);
		dataHoldPanel.add(comboPanel);
		this.add(dataHoldPanel);
		this.revalidate();
		this.repaint();
	}
}
