package at.mklestil;

public class Main {
    /**
     * Main method to run the application.
     * It creates an array of vehicles and drives each one.
     * A simple OOP exercise in Java with polymorphism.
     */
    public static void main(String[] args) {
        System.out.println("Hello world Java OOP!");
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new PKW(120);
        vehicles[1] = new Motorcycle(100);

        for (Vehicle v : vehicles) {
            v.drive();
        }


    }
}