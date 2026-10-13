interface FuelEfficient {
    void fuelEfficiency();
    void maintenanceCost();
}

abstract class Vehicle {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public abstract void move();
}

class Car extends Vehicle implements FuelEfficient {
    @Override
    public void move() {
        System.out.println("Car moves on four wheels.");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Fuel Efficiency: 15 km per liter.");
    }

    @Override
    public void maintenanceCost() {
        System.out.println("Maintenance Cost: Approx ₹8,000 per service.");
    }
}

class Motorcycle extends Vehicle implements FuelEfficient {
    @Override
    public void move() {
        System.out.println("Motorcycle moves on two wheels.");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Fuel Efficiency: 30 km per liter.");
    }

    @Override
    public void maintenanceCost() {
        System.out.println("Maintenance Cost: Approx ₹2,500 per service.");
    }
}

public class VehicleFuelEfficiencyDemo {
    public static void main(String[] args) {
        System.out.println("--- Car Details ---");
        Car car = new Car();
        car.startEngine();
        car.move();
        car.fuelEfficiency();
        car.maintenanceCost();

        System.out.println("\n--- Motorcycle Details ---");
        Motorcycle moto = new Motorcycle();
        moto.startEngine();
        moto.move();
        moto.fuelEfficiency();
        moto.maintenanceCost();
    }
}
