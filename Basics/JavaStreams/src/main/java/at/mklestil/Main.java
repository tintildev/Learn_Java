package at.mklestil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world, this is a streams example!");
        /**
         * Generate the following output using streams:
         *
         * Print all even numbers
         *
         * Calculate the square of all odd numbers and save it as a new list
         *
         * Print the number of numbers > 10
         */
        StreamsExample streamsExample = new StreamsExample();
        streamsExample.printEvenNumbers();
        streamsExample.calculateSquareOfOddNumbers();
        streamsExample.printCountOfNumbersGreaterThanTen();

        // Example of setting new numbers
        List<Integer> numbers = Arrays.asList(1, 5, 6, 8, 16, 22, 42);
        streamsExample.setNumbers(numbers);
        streamsExample.allMethods();
    }
}