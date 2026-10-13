interface EnergyEfficient {
    void powerConsumption();
    void maintenanceCost();
}

abstract class Appliance {
    public void switchOn() {
        System.out.println("Appliance switched on.");
    }

    public abstract void operate();
}

class WashingMachine extends Appliance implements EnergyEfficient {
    @Override
    public void operate() {
        System.out.println("Washing Machine is running a wash cycle.");
    }

    @Override
    public void powerConsumption() {
        System.out.println("Power Consumption: 1.5 kWh per wash cycle.");
    }

    @Override
    public void maintenanceCost() {
        System.out.println("Maintenance Cost: ₹1,200 annually.");
    }
}

class Refrigerator extends Appliance implements EnergyEfficient {
    @Override
    public void operate() {
        System.out.println("Refrigerator is cooling contents.");
    }

    @Override
    public void powerConsumption() {
        System.out.println("Power Consumption: 250 kWh per year (5-Star BEE).");
    }

    @Override
    public void maintenanceCost() {
        System.out.println("Maintenance Cost: ₹800 annually.");
    }
}

public class ApplianceEnergyDemo {
    public static void main(String[] args) {
        System.out.println("--- Washing Machine ---");
        WashingMachine wm = new WashingMachine();
        wm.switchOn();
        wm.operate();
        wm.powerConsumption();
        wm.maintenanceCost();

        System.out.println("\n--- Refrigerator ---");
        Refrigerator ref = new Refrigerator();
        ref.switchOn();
        ref.operate();
        ref.powerConsumption();
        ref.maintenanceCost();
    }
}
