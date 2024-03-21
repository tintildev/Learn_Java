package model;

import com.opencsv.CSVReader;

import javax.swing.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVDataLoader {
    private  ArrayList<String> firstRowData;
    private String trenner;

    public CSVDataLoader(String trenner) {
        this.trenner = trenner;
    }

    public ArrayList<String> loadCSVData(String fileName) {
        firstRowData = new ArrayList<>();

        try {
            CSVReader reader = new CSVReader(new FileReader(fileName));
            String[] nextLine;
            int lineNumber = 0;
            while ((nextLine = reader.readNext()) != null) {

                lineNumber++;

                // Split defenieren mit Trenner
                String[] test = nextLine[0].split(trenner);
                List<String> userList = new ArrayList<String>();
                //Achtung asList macht ein Array mit Fixer Größe
                //geht erste Zeile der Excel durch und gibt die Titel ein
                userList.addAll(Arrays.asList(test));

                //TODO: Dynamisch nach Titel
                if (userList.size() < 0) {

                }
                for (int i = 0; i < userList.size(); i++) {

                    //TODO: Hier Datein speichern.
                }




            }

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Es ist zu folgenden Fehler gekommen: " + e);
        }
        System.out.println("User: " + firstRowData.size());
        return firstRowData;
    }
}
