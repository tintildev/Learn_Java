package view;

import model.Person;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
		info.setOpaque(false);
		this.add(info);
		this.setBackground(Color.white);
		infosPanel.setOpaque(false);
		rowDataPanel.setOpaque(false);
	}


	public void setFirstRowData(ArrayList<String> firstRowData) {
		System.out.println("Daten erste Zeile:" + firstRowData);
		JPanel comboPanel = new JPanel();
		JPanel dataHoldPanel = new JPanel();
		comboPanel.setOpaque(false);
		dataHoldPanel.setOpaque(false);
		dataHoldPanel.setLayout(new GridLayout(1,0));
		JLabel comboLabel = new JLabel("Bitte Auswahlen:");
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
		JPanel theInfos = new JPanel();
		theInfos.setLayout(new FlowLayout(FlowLayout.LEFT, 0 , 0));
		for (int i = 1; i < infos.size(); i++ ){
			theInfos.add(new PersonLabel(infos.get(i)));
		}
		theInfos.setOpaque(false);
		infosPanel.add(theInfos);
		this.add(infosPanel);
		this.add(new JLabel("Eingelesene Daten:"));
		this.revalidate();
		this.repaint();

	}

	public void setPersonArrayData(Person modelPerson, ArrayList<Person> allData){
		this.removeAll();

		JPanel arrayDataPanel = new JPanel(new GridLayout(0,1));
		arrayDataPanel.setOpaque(false);
		JLabel currentDataLabel = new JLabel("Aktuelle Daten: ");
		arrayDataPanel.add(currentDataLabel);

		// Erstelle die Tabelle
		DefaultTableModel tableModel = new DefaultTableModel();
		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);

		// Lösche vorhandene Daten in der Tabelle
		tableModel.setRowCount(0);

		for (int i = 0; i < modelPerson.getPersonCharacteristics().size(); i++){
			tableModel.addColumn(modelPerson.getPersonCharacteristics().get(i));
		}

		for (Person person : allData){
			Object[] rowData = {person.getDatabaseId(), person.getUuid(), person.getTitle(),
					person.getFunktion(), person.getFirma(),
					person.getVorname(), person.getNachname(),
					person.getGeburtstag(), person.getAdresse(),
					person.getAdressekomplett(), person.getPlz(),
					person.getOrt(), person.getTelefon(),
					person.getTelMobile(), person.getEmail(),
					person.getEmailFirma(), person.getLand(),
					person.getInfo1(), person.getInfo2(),
					person.getInfo3(), person.getInfo4(),
					person.getInfo5()


			};
			tableModel.addRow(rowData);
		}

		arrayDataPanel.add(scrollPane);
		this.add(arrayDataPanel);
		this.revalidate();
		this.repaint();

	}
}
