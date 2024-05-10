package at.mklestil.controller;

import at.mklestil.model.PriceCalculation;
import at.mklestil.view.MyView;

public class MyController {

    public MyController(MyView view) {
        PriceCalculation priceCalculation = new PriceCalculation(view.getCinemaRoom(), view.getPeople(), view.getSeat(), view.getDay());
        view.setPrice(priceCalculation.getPrice());
    }
}
