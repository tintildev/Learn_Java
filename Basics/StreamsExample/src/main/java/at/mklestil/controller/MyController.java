package at.mklestil.controller;

import at.mklestil.model.MyStreamsModel;

import java.util.List;

public class MyController {
    private  MyStreamsModel model = new MyStreamsModel();

    public MyController() {

    }

    public List<Integer> getEvenNumbers(List<Integer> numbers){
        return model.filterEvenNumbers(numbers);
    }


}
