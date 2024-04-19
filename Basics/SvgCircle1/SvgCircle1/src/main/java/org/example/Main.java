package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bitte x werte eingeben:");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println("Bitte y werte eingeben:");
        int y = new java.util.Scanner(System.in).nextInt();

        //Zufallszahl zwischen 10 - 20
        int range = 20 - 10 + 1;
        double r = (Math.random() * range ) + 10;

        //Ausgabe für SVG
        System.out.println("<svg height='400' width='1000'>");
        System.out.println("    <circle cx='"+ x +"' cy='"+ y +"' r='"+ r +"'>");
        System.out.println("</svg>");

        System.out.print("Ausgabe eingeben: https://www.w3schools.com/graphics/tryit.asp?filename=trysvg_circle1");
    }
}