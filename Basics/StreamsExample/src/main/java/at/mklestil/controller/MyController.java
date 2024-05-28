package at.mklestil.controller;

import at.mklestil.model.MyStreamsModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyController {
    private  MyStreamsModel model = new MyStreamsModel();

    public MyController() {
        //Test Data:

        // Even Numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        getEvenNumbers(numbers);

        // Sum
        ArrayList<String> stringNumbers = new ArrayList<>();
        stringNumbers.add("1");
        stringNumbers.add("2");
        stringNumbers.add("3");
        stringNumbers.add("4");
        stringNumbers.add("5");

        System.out.println("String Result: " + getStringResult(stringNumbers));

        // to concatenate into a single string
        List<String> words = Arrays.asList("Java", "Streams", "sind", "sehr", "nützlich");
        System.out.println("Concatenate Strings: " + concatenatedString(words));

    }

    public List<Integer> getEvenNumbers(List<Integer> numbers){
        return model.filterEvenNumbers(numbers);
    }

    public int getStringResult(ArrayList<String> list){
        return model.getStringResult(list);
    }

    private String concatenatedString(List<String> words) {
        return model.concatenateStrings(words);
    }


}
