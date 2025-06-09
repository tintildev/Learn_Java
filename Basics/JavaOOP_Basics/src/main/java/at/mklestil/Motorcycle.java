package at.mklestil;

public class Motorcycle extends Vehicle {
    public Motorcycle(int speed) {
        super(speed);
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle travels with " + speed + " km/h");
    }
}
