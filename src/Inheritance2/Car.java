package Inheritance2;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int dears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int dears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.dears = dears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + "direction " + direction);
        move(speed, direction);
    }

}
