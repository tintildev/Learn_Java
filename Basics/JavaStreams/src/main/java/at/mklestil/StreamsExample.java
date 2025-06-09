package at.mklestil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    private List<Integer> numbers = Arrays.asList(3, 5, 7, 8, 9, 10, 13, 14, 15);

    /**
     * Prints all even numbers from the list.
     */
    public void printEvenNumbers() {
        System.out.println("Even numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .forEach(System.out::println);  // Print each even number
    }

    /**
     * Calculates the square of all odd numbers and saves it as a new list.
     *
     * Prints the squares of odd numbers.
     */
    public void calculateSquareOfOddNumbers() {
        List<Integer> quadrate = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n) // Calculate square of odd numbers
                .collect(Collectors.toList()); // Collect the results into a new list
        System.out.println("Squares of odd numbers: " + quadrate);
    }

    /**
     * Prints the count of numbers greater than 10.
     */
    public void printCountOfNumbersGreaterThanTen() {
        int count = (int) numbers.stream()
                .filter(n -> n > 10)
                .count();   // Count numbers greater than 10
        System.out.println("Count of numbers greater than 10: " + count);
    }


    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    /**
     * Calls all methods to demonstrate their functionality.
     */
    public void allMethods() {
        printEvenNumbers();
        calculateSquareOfOddNumbers();
        printCountOfNumbersGreaterThanTen();
    }
}
