package at.martinklestil.timeproject;

import at.martinklestil.timeproject.timepackage.MyDateTimeInfo;

public class Main {

    public static void main(String[] args) {
        MyDateTimeInfo mdTi = new MyDateTimeInfo();

        System.out.println(mdTi.getMyDateTime("hh:mm"));
        System.out.println(mdTi.getMyDateTime("hh:mm:ss"));
        System.out.println(mdTi.getMyDateTime("hh"));


        System.out.println(mdTi.getMyDateTime("M"));
        System.out.println(mdTi.getMyDateTime("MM"));
        System.out.println(mdTi.getMyDateTime("MMM"));
        System.out.println(mdTi.getMyDateTime("MMMM"));

        System.out.println(mdTi.getMyDateTime("yy"));
        System.out.println(mdTi.getMyDateTime("yyyy"));
    }
}
