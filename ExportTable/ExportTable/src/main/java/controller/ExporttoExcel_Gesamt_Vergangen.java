package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JLabel;

/**
 * Klasse um den Export zu Excel zu erm�glichen.
 * @author Martin Klestil
 *
 */
public class ExporttoExcel_Gesamt_Vergangen {

    private String filePath;
    private String fileAbsoultePath;
    private ArrayList<String> listofUser;
    private ArrayList<String> mEinheitList;

    private Date mDate = new Date();
    private SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private static JLabel centerLabel;

/**
 * Konstruktor �bernimmt die Daten und startet die Auswertung.
 * @param fileAbsoultePath
 * @param filePath
 * @param auswertungArrayList
 * @param listofUser
 * @param einheiten
 * @param auswertungListe

    public ExporttoExcel_Gesamt_Vergangen(String fileAbsoultePath, String filePath, ArrayList<Stunden_Vergangen> auswertungArrayList, ArrayList<User> listofUser, ArrayList<String> einheiten, ArrayList<Stunden_Vergangen> auswertungListe) {
        mGesamtList = auswertungArrayList;
        mEinheitList = einheiten;
        this.listofUser = listofUser;
        this.fileAbsoultePath = fileAbsoultePath;
        this.filePath = filePath;
        this.mAuswertungs = auswertungListe;
        centerLabel = CenterLabel.getInstance();


        exportEinzelln(filePath);
        centerLabel.setText("Auswertung abgeschlossen!");


    }
 */

    /**
     * Methode um Auswertung anhand der einzellnen Einheiten zu erm�glichen.
     * @param filePath

    public void exportEinzelln(String filePath) {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet2;

        /**
         * Hier wird jede einzellne Einheit durchlaufen.
         */



    /**
     * Methode um Auswertungen f�r einzellne Benutzer zu erm�glichen.
     * @param filePath

    public void exportSingleUserExcel(String filePath) {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet2;

        for (User list : listofUser) {

            wb = new HSSFWorkbook(); // wird benötigt damit jedes sheet eine eigene Datei wird.
            sheet2 = wb.createSheet(list.getNachname());
            int rowNum1 = 0;
            Row row1 = sheet2.createRow(rowNum1++);
            row1.createCell(0).setCellValue("Mitgliedsnummer");
            row1.createCell(1).setCellValue("Namen");

            row1.createCell(3).setCellValue("Einheit ID");
            row1.createCell(4).setCellValue("Einheit Name");
            row1.createCell(5).setCellValue("Verwendung");
            row1.createCell(6).setCellValue("Anker");
            row1.createCell(7).setCellValue("Abt");
            row1.createCell(8).setCellValue("Dienstart");


            row1.createCell(10).setCellValue("Beginn");
            row1.createCell(12).setCellValue("Ende");
            row1.createCell(14).setCellValue("Stunden");
            row1 = sheet2.createRow(rowNum1++);


            for (int i = 0; i < mGesamtList.size(); i++) {

                if (mGesamtList.get(i).getMitgliedsnummer().equals(list.getPersonalnummer())) {

                    row1.createCell(0).setCellValue(mGesamtList.get(i).getMitgliedsnummer());
                    row1.createCell(1).setCellValue(mGesamtList.get(i).getNameGesamt());

                    row1.createCell(3).setCellValue(list.getEinheitID());
                    row1.createCell(4).setCellValue(list.geteinheitName());
                    row1.createCell(5).setCellValue(mGesamtList.get(i).getVerwendung());
                    row1.createCell(6).setCellValue(mGesamtList.get(i).getAnker());
                    row1.createCell(7).setCellValue(mGesamtList.get(i).getAbt());
                    row1.createCell(8).setCellValue(mGesamtList.get(i).getDienstart());

                    row1.createCell(10).setCellValue(mGesamtList.get(i).getBeginn());
                    row1.createCell(12).setCellValue(mGesamtList.get(i).getEnde());
                    row1.createCell(14).setCellValue(mGesamtList.get(i).getStunden());
                    System.out.println("Row: " + rowNum1);
                    System.out.println("Größe: " + mGesamtList.size());
                    System.out.println("int i: " + i);
                    row1 = sheet2.createRow(rowNum1++);


                } // ende if

            }//ende for
            try (OutputStream fileOut = new FileOutputStream(filePath + list.getNachname() + " " + list.getVorname() + ".xls")) {
            	rowNum1 = rowNum1 + 3;
                row1 = sheet2.createRow(rowNum1++);
                row1.createCell(1).setCellValue("Auswertung wurde am " +  mSimpleDateFormat.format(mDate) + " erstellt.");
                row1 = sheet2.createRow(rowNum1++);
                row1.createCell(1).setCellValue("Auswertungsprogramm von Martin Klestil Version 1.6");

                wb.write(fileOut);
                wb.close();

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Es ist zu folgenden Fehler gekommen: " + e);

            } //ende try

        }// ende for user


    }
     */

}
