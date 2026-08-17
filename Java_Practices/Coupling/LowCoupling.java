interface Engine {

    void start();
}


class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol Engine started ⛽");
    }
}


class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Diesel Engine started 🛢️");
    }
}


class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric Engine started 🔋");
    }
}


class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {

        engine.start();

        System.out.println("Car started 🚗");
    }
}


public class Main {

    public static void main(String[] args) {

        Engine engine = new PetrolEngine();

        Car car = new Car(engine);

        car.startCar();
    }
}