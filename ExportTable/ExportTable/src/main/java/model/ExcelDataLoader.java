package model;

import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelDataLoader {

    private ArrayList<String> firstRowData;
    private ArrayList<Person> allData;
    private File file;

    public ExcelDataLoader() {
        allData = new ArrayList<>();
    }

    public void loadFirstXlsData() {
        try (FileInputStream fis = new FileInputStream(file)) {
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0); // Erste Tabelle in der Excel-Datei

            // Neue ArrayList erstellen
            firstRowData = new ArrayList<>();

            // Erste Zeile
            Row row = sheet.getRow(0);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                Cell cell = row.getCell(i);
                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            firstRowData.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            firstRowData.add(String.valueOf(cell.getNumericCellValue()));
                            break;
                        case BOOLEAN:
                            firstRowData.add(String.valueOf(cell.getBooleanCellValue()));
                            break;
                        default:
                            firstRowData.add("");
                    }
                } else {
                    firstRowData.add("");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Fehler beim Öffnen der Excel-Datei: " + ex.getMessage(),
                    "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void loadXlsDatas(ArrayList<String> chosenData){
        try (FileInputStream fis = new FileInputStream(file)) {
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0); // Erste Tabelle in der Excel-Datei


            //starte bei Zeile 1 bis zur letzten Zeile
            for (int i = 1; i < sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                Person tempPerson = new Person();
                for(int d = 0; d < chosenData.size(); d++){
                    Cell cell = row.getCell(d);
                    //System.out.println("last Cell Number:" + row.getLastCellNum());
                    //System.out.println("index: " + d);
                    //System.out.println("Characteristics: " + tempPerson.getPersonCharacteristics());
                    //System.out.println("Chosen Data:" + chosenData.get(d));
                    for(int a = 0; a < tempPerson.getPersonCharacteristics().size(); a++){
                        if(tempPerson.getPersonCharacteristics().get(a).equals(chosenData.get(d))){
                            if(cell != null){
                                tempPerson.setData(tempPerson.getPersonCharacteristics().get(a), cell.toString());
                                //System.out.println(tempPerson.getPersonCharacteristics().get(a));
                                //System.out.println(cell.toString());
                            }else{
                                tempPerson.setData(tempPerson.getPersonCharacteristics().get(a), " ");
                            }

                        }
                    }
                }
                allData.add(tempPerson);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Fehler beim Öffnen der Excel-Datei: " + ex.getMessage(),
                    "Fehler", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<String> getFirstRowData() {
        return firstRowData;
    }

    public ArrayList<Person> getAllData() {
        return allData;
    }
}
