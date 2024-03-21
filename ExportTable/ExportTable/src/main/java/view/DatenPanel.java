package view;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DatenPanel extends JPanel {

	private JPanel viewDataPanel = new JPanel();
	private JPanel rowDataPanel = new JPanel();

	private ArrayList<String> infos = new ArrayList<>();

	public DatenPanel() {
		viewDataPanel.setLayout(new BoxLayout(viewDataPanel, BoxLayout.Y_AXIS));

		this.setLayout(new BorderLayout());

		JLabel info = new JLabel("Daten:");
		this.add(info,BorderLayout.NORTH);

		infos = new ArrayList<>();
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

		/*
		// Erstellen des TableModels
		DefaultTableModel model = new DefaultTableModel();
		for (String names : infos) {
			model.addColumn(names);
		}
		//model.addRow(rowData.toArray());

		// Erstellen der Tabelle
		JTable table = new JTable(model);
		table.setEnabled(false); // Die Tabelle ist nicht bearbeitbar
		table.setFillsViewportHeight(true); // Die Tabelle füllt die gesamte Höhe des Bereichs aus

		JScrollPane scrollPane = new JScrollPane(table);
		viewDataPanel.add(scrollPane);
		rowDataPanel.setLayout(new FlowLayout());


		*/
		JPanel infosPanel = new JPanel();
		infosPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0 , 0));
		for (String names: infos){
			infosPanel.add(new PersonLabel(names));
		}

		viewDataPanel.add(infosPanel);
		this.add(viewDataPanel, BorderLayout.CENTER);

	}


	public void setFirstRowData(ArrayList<String> firstRowData) {
		viewDataPanel.add(new JLabel("Eingelesene Daten:"));
		System.out.println("Daten erste Zeile:" + firstRowData);
		for(String data: firstRowData){
			rowDataPanel.add(new JLabel(data));
		}
		viewDataPanel.add(rowDataPanel);
		viewDataPanel.repaint();
		repaint();
	}
}
