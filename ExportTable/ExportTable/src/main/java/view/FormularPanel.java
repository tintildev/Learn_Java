package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormularPanel extends JPanel {

	private JComboBox<String> boxFirstRowData = new JComboBox<>();
	private JComboBox<String> delimiterComboBox;
	private JPanel formPanel = new JPanel();
	JLabel infoCSV = new JLabel("Bitte erste Excel Datei waehlen:");
	private JButton openFileButton;
	public FormularPanel(){
		//Formular Panel
		formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
		this.setLayout(new BorderLayout());
		Color color = Color.decode("#a1dfb5");
		this.setBackground(color);

		//Erstelle open Excel View;
		JPanel secoundFloor = new JPanel(new FlowLayout());
		openFileButton = new JButton("Oeffnen");
		openFileButton.setPreferredSize(new Dimension(120, 60));
		secoundFloor.add(infoCSV);
		secoundFloor.add(openFileButton);
		formPanel.add(secoundFloor);


		// set Opaque
		secoundFloor.setOpaque(false);
		infoCSV.setOpaque(false);
		formPanel.setOpaque(false);



		//hinzufügen zu MainPanel
		this.add(new JLabel("Auswahl der Excel Datei:"), BorderLayout.NORTH);
		this.add(formPanel, BorderLayout.CENTER);

	}

	public void setBoxFirstRowData(ArrayList<String> data) {
		for(int i = 0; i < data.size(); i++){
			this.boxFirstRowData.addItem(data.get(i));
		}
	}

	//Set Action Listener MainController (Logik)
	public void addOpenFileListener(ActionListener listener) {
		openFileButton.addActionListener(listener);
	}

	//Get Auswahl Trennzeichen
	public String getDelimiterComboBox() {
		return delimiterComboBox.getSelectedItem().toString();
	}

	public void openCsvView () {

		//View falls csv geöffnet werdern soll:
		JPanel zeroFloor = new JPanel(new FlowLayout());
		JLabel witchFile = new JLabel("Dateiart:");
		JComboBox fileComboBox = new JComboBox(new String[]{"csv", "xls"});
		zeroFloor.add(witchFile);
		zeroFloor.add(fileComboBox);
		JPanel firstFloor = new JPanel(new FlowLayout());

		JLabel infoTrenner = new JLabel("Trennzeichen:");
		delimiterComboBox = new JComboBox<>(new String[]{"Spalten", ";", ","});
		firstFloor.add(infoTrenner);
		firstFloor.add(delimiterComboBox);

		formPanel.add(zeroFloor);
		formPanel.add(firstFloor);
		formPanel.setOpaque(false);
		zeroFloor.setOpaque(false);
		firstFloor.setOpaque(false);
	}

	public void setCompareView(){
		// compare View:
		formPanel.removeAll();
		JPanel excelDataPanel = new JPanel(new FlowLayout());
		JLabel excelDataLabel = new JLabel("Anhand welcher Spalte sollen die Datein verglichen werden:");
		excelDataPanel.add(excelDataLabel);
		excelDataPanel.add(boxFirstRowData);
		formPanel.add(excelDataPanel);
		formPanel.revalidate();
		formPanel.repaint();

	}

	public void setInfoCSVLabelToSecoundData () {
		infoCSV.setText("Bitte zweite Datei wählen:");
		openFileButton.setBackground(Color.RED);
		//openFileButton.addActionListener();

	}
}
