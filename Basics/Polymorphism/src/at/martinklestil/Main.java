package at.martinklestil;

import at.martinklestil.model.Animal;
import at.martinklestil.model.Dog;
import at.martinklestil.model.Pig;

public class Main {

    public static void main(String[] args) {
        /*
        Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
         */
	    Animal myAnimal = new Animal(); //Create a Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }
}
