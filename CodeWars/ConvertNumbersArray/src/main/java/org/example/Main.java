package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Code Wars Example: Convert number to reversed array of digits");
        digitize(35213);
    }


        public static int[] digitize(long n) {
            String numberString = Long.toString(n); // Konvertiere die Zahl in einen String
            int lengthOfString = numberString.length(); // Bestimme die Länge der Zahl
            int[] result = new int[lengthOfString]; // Initialisiere das Ergebnis-Array

            for (int i = 0; i < lengthOfString; i++) {
                // Füge die Ziffern in umgekehrter Reihenfolge in das Array ein
                result[i] = Character.getNumericValue(numberString.charAt(lengthOfString - 1 - i));
            }

            return result;
        }

}