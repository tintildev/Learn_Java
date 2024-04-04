package controller;

import model.ExcelDataLoader;
import model.Person;
import view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoadDataController {
    private MainFrame view;
    private Person model;

    private ExcelDataLoader excelDataLoader;

    public LoadDataController(MainFrame view, Person model, ExcelDataLoader excelDataLoader) {
        this.view = view;
        this.model = model;
        this.excelDataLoader = excelDataLoader;

        view.getDatenPanel().getSendData().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //load Data
                processLoadData();
            }
        });
    }

    private void processLoadData() {
        ArrayList<String> chosenData = new ArrayList<>();
        for(JComboBox box : view.getDatenPanel().getComboBoxesArray()){
            String temp = box.getSelectedItem().toString();
            chosenData.add(temp);
        }

        excelDataLoader.loadXlsDatas(chosenData);
        view.getDatenPanel().setPersonArrayData(model, excelDataLoader.getAllData());

        System.out.println(excelDataLoader.getAllData());
    }
}
