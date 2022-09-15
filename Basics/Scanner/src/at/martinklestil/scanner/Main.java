package at.martinklestil.scanner;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int zahl;
        int wert = 1;

        System.out.println("Bitte Zahl eingeben: ");
        Scanner input = new Scanner(System.in);

        try
        {
            zahl = input.nextInt();

            for (int i = 1; i <= zahl;i++){
                wert = i * wert;
                System.out.print(i + "*");
            }
            System.out.println("\nErgebniss:" + wert);


            input.close();
        }catch (Exception test){
            System.out.println("Fehler: " + test.getMessage());
        }//ende catch

    }//ende main

}//ende class
