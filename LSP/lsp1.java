abstract class Vehicle {
    public abstract void move();
}

interface EngineVehicle {
    void startEngine();
}

class Car extends Vehicle implements EngineVehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.move();
        bicycle.move();

        if (car instanceof EngineVehicle) {
            ((EngineVehicle) car).startEngine();
        }

        if (bicycle instanceof EngineVehicle) {
            ((EngineVehicle) bicycle).startEngine(); // Won't be called
        }
    }
}
