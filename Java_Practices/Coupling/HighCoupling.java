class PetrolEngine {

    public void start() {
        System.out.println("Petrol Engine started ⛽");
    }
}


class DieselEngine {

    public void start() {
        System.out.println("Diesel Engine started 🛢️");
    }
}


class ElectricEngine {

    public void start() {
        System.out.println("Electric Engine started 🔋");
    }
}


class Car {

    // Car directly depends on PetrolEngine
    private PetrolEngine engine = new PetrolEngine();

    public void startCar() {

        engine.start();

        System.out.println("Car started 🚗");
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.startCar();
    }
}