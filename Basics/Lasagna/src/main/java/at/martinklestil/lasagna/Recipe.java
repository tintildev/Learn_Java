package at.martinklestil.lasagna;

import java.util.ArrayList;
import java.util.HashMap;

public class Recipe {

    private HashMap<String, Integer> ingredients = new HashMap<String, Integer>();
    private ArrayList<String> list = new ArrayList<String>();

    public Recipe(){
        list.add("pumpkin");
        list.add("onion");
        list.add("vegetable soup");
        list.add("olive oil");
        list.add("salt");
        list.add("pepper");
        list.add("nutmeg");
        list.add("herbs");
        list.add("lasagna sheets");
        list.add("pumpkin seeds");

        ingredients.put(list.get(0), 250);
        ingredients.put(list.get(1), 1);
        ingredients.put(list.get(2), 80);
        ingredients.put(list.get(3), 1);
        ingredients.put(list.get(4), 1);
        ingredients.put(list.get(5), 1);
        ingredients.put(list.get(6), 1);
        ingredients.put(list.get(7), 1);
        ingredients.put(list.get(8), 12);
        ingredients.put(list.get(9), 100);


    }

    public ArrayList<String> getListofIngredients(){
        return list;
    }

    public HashMap getIngredientsList(){
        return ingredients;
    }

    public int getNumberOfIngredients(){
        return  ingredients.size();
    }

    public int getPortions(){
        return 2;
    }
}
