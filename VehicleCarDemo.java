class Vehicle {
    protected String vehicleNo;
    protected String brand;
    protected double price;

    public Vehicle(String vehicleNo, String brand, double price) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.price = price;
    }

    public void displayDetails() {
        System.out.print("Vehicle No: " + vehicleNo + ", Brand: " + brand + ", Price: ₹" + price);
    }
}

class Car extends Vehicle {
    private String model;
    private String fuelType;

    public Car(String vehicleNo, String brand, double price, String model, String fuelType) {
        super(vehicleNo, brand, price); // Constructor chaining
        this.model = model;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling parent method
        System.out.println(", Model: " + model + ", Fuel Type: " + fuelType);
    }
}

public class VehicleCarDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("MH12AB1234", "Generic Wheels", 300000.0);
        Car c = new Car("MH14XY9876", "Tata", 1250000.0, "Nexon EV", "Electric");

        System.out.println("--- Vehicle Details ---");
        v.displayDetails();
        System.out.println();

        System.out.println("\n--- Car Details ---");
        c.displayDetails();
    }
}
