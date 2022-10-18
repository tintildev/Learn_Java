package at.martinklestil.lasagna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    private Recipe recipe = new Recipe();

    @Test
    void notNullIngredients(){
        assertNotNull(recipe.getIngredientsList());
    }

    @Test
    void tenIngredients(){
        assertEquals(10, recipe.getNumberOfIngredients());
    }

    @Test
    void getOneOnion(){
        //access of the HashMap with Key
        assertEquals(1, recipe.getIngredientsList().get("onion"));
    }

}