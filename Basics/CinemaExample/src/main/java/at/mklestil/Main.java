package at.mklestil;

import at.mklestil.controller.MyController;
import at.mklestil.view.MyView;

public class Main {
    public static void main(String[] args) {
        /*
            A small cinema example, create and test the project with junit tests.
         */
        System.out.println("Hello world! This is the practice exercise:");
        System.out.println("A cinema has three cinema halls with the following pricing system:");
        System.out.println("cinema 1: parquet 3,8€ on all days of the week");
        System.out.println("cinema 1: loge 5,9€ on all days of the week");
        System.out.println("cinema 2: parquet 3,3€ mo-fr");
        System.out.println("cinema 2: parquet 4,8 € sa-so");
        System.out.println("cinema 2: loge 7 € on all days");
        System.out.println("cinema 3: all seat 6€ mo - do");
        System.out.println("cinema 3: all seat 7,5€ fr - so");

        MyView view = new MyView();
        MyController controller = new MyController(view);

    }
}