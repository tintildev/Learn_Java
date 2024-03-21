package model;

import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelDataLoader {

    private ArrayList<String> firstRowData;
    private ArrayList<String> allData;

    public void loadXlsData(File file) {
        try (FileInputStream fis = new FileInputStream(file)) {
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0); // Erste Tabelle in der Excel-Datei

            // Neue ArrayList erstellen
            firstRowData = new ArrayList<>();

            // Füge die erste Zeile der JComboBox hinzu
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

    public ArrayList<String> getFirstRowData() {
        return firstRowData;
    }
}
