package at.mklestil;

public class PKW extends Vehicle {
    public PKW(int speed) {
        super(speed);
    }

    @Override
    public void drive() {
        System.out.println(("Car travels with " + speed + " km/h"));
    }
}
