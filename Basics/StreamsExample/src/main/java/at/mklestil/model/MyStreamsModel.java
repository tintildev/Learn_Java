package at.mklestil.model;

import java.util.List;
import java.util.stream.Collectors;

public class MyStreamsModel {
    public MyStreamsModel() {
    }

    public List<Integer> filterEvenNumbers(List<Integer> numbers){
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)  //to filter the even numbers
                .collect(Collectors.toList()); //save values in new list

                System.out.println("even numbers: " + evenNumbers);
        return evenNumbers;
    }

    public int getStringResult(List<String> stringList){
        int sum = stringList.stream()
                .mapToInt(Integer::parseInt) //convert String to int
                .sum(); // calculate the sum
        return sum;
    }

    public String concatenateStrings(List<String> words) {
        return words.stream()
                .reduce((word1, word2) -> word1 + ", " + word2)
                .orElse("");
    }
}
