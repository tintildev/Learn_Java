package controller;

import model.ExcelDataLoader;
import view.DatenPanel;
import view.FormularPanel;
import view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainController {
    private MainFrame mainFrame;
    private FormularPanel formularPanel;
    private DatenPanel datenPanel;
    private ExcelDataLoader excelDataLoader = new ExcelDataLoader();
    private Boolean checkLoadData = false;
    public MainController(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        formularPanel = this.mainFrame.getFormularPanel();
        datenPanel = this.mainFrame.getDatenPanel();

        //Set ActionListener
        setActioListener();

        if(checkLoadData){
            //Set Data in View

        }


        //formularPanel.setBoxFirstRowData(excelDataLoader.getFirstRowData());


    }

    public void setActioListener(){
        formularPanel.addOpenFileListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Öffnen einer Dialogbox zur Dateiauswahl
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    // Hier könnten Sie den ausgewählten Dateipfad verwenden
                    System.out.println("Ausgewählte Datei: " + selectedFile.getAbsolutePath());

                    // Überprüfen der Dateierweiterung
                    String fileName = selectedFile.getName();
                    String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
                    System.out.println("Dateierweiterung: " + extension);

                    // Überprüfen der Dateierweiterung und Laden der Daten entsprechend
                    if (extension.equalsIgnoreCase("xls") || extension.equalsIgnoreCase("xlsx")) {
                        excelDataLoader.loadXlsData(selectedFile);
                        //checkLoadData = true;
                        datenPanel.setFirstRowData(excelDataLoader.getFirstRowData());
                    } else if (extension.equalsIgnoreCase("csv")) {
                        //loadCSVData(selectedFile);
                    } else {
                        JOptionPane.showMessageDialog(null, "Bitte wählen Sie eine Excel-Datei aus.", "Fehler", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }


}
