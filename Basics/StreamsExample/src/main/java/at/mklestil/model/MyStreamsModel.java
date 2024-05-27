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
}
