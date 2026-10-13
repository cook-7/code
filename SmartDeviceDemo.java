interface SmartDevice {
    void batteryUsage();
    void maintenanceCost();
}

abstract class Device {
    public void powerOn() {
        System.out.println("Device powered on.");
    }

    public abstract void operate();
}

class Smartphone extends Device implements SmartDevice {
    @Override
    public void operate() {
        System.out.println("Smartphone is executing user apps.");
    }

    @Override
    public void batteryUsage() {
        System.out.println("Battery Usage: 10% per hour on heavy use.");
    }

    @Override
    public void maintenanceCost() {
        System.out.println("Maintenance Cost: ₹1,500 per year.");
    }
}

class SmartWatch extends Device implements SmartDevice {
    @Override
    public void operate() {
        System.out.println("SmartWatch is tracking heart rate and steps.");
    }

    @Override
    public void batteryUsage() {
        System.out.println("Battery Usage: 25% per day.");
    }

    @Override
    public void maintenanceCost() {
        System.out.println("Maintenance Cost: ₹500 per year.");
    }
}

public class SmartDeviceDemo {
    public static void main(String[] args) {
        System.out.println("--- Smartphone ---");
        Smartphone phone = new Smartphone();
        phone.powerOn();
        phone.operate();
        phone.batteryUsage();
        phone.maintenanceCost();

        System.out.println("\n--- SmartWatch ---");
        SmartWatch watch = new SmartWatch();
        watch.powerOn();
        watch.operate();
        watch.batteryUsage();
        watch.maintenanceCost();
    }
}
