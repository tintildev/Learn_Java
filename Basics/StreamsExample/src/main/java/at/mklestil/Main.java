package at.mklestil;

import at.mklestil.controller.MyController;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! This is my Streams Example.");
        MyController controller = new MyController();

        //Test Data:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        controller.getEvenNumbers(numbers);


    }
}