package at.martinklestil.lasagna;

import java.util.HashMap;

public class Recipe {

    private HashMap<String, Integer> ingredients = new HashMap<String, Integer>();

    public Recipe(){
        ingredients.put("pumpkin g", 250);
        ingredients.put("onion", 1);
        ingredients.put("vegetable soup ml", 80);
        ingredients.put("olive oil shot", 1);
        ingredients.put("salt", 1);
        ingredients.put("pepper", 1);
        ingredients.put("nutmeg", 1);
        ingredients.put("herbs", 1);
        ingredients.put("lasagna sheets", 12);
        ingredients.put("pumpkin seeds g", 100);

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
