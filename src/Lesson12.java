// ************ Abstraction ************

abstract class Vehicle {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing music in the car");
    }
}

class VW extends Vehicle {
    public void fly() {
        System.out.println("flying the car");
    }

    public void drive() {
        System.out.println("Driving the car");
    }
}

public class Lesson12 {
    public static void main(String[] args) {
        Vehicle vehicle = new VW();

        vehicle.drive();
        vehicle.playMusic();

    }
}
