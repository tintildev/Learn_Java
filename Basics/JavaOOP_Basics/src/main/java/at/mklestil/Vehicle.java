package at.mklestil;

public abstract class Vehicle {
    public int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public abstract void drive();
}
