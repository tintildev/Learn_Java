package at.martinklestil;

import at.martinklestil.controll.CreateTestData;
import at.martinklestil.controll.FileCopier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*/Write a program that reads a file from a specified path and copies it
        to another specified path.
        */

        //creat Start Data
        CreateTestData start = new CreateTestData();

        // Use Scanner to get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den Dateinamen ein, den Sie kopieren möchten:");
        String fileName = scanner.nextLine();
        System.out.println("Es wurde " + fileName + " ausgewählt.");
        scanner.close();

        FileCopier copy = new FileCopier();
        copy.copyFile(fileName, start.getDirectory());
        start.listOfDir(start.getDirectory().toFile());



    }
}