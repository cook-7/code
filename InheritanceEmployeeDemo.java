class Employee {
    protected int empId;
    protected String name;
    protected double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.print("ID: " + empId + ", Name: " + name + ", Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(int empId, String name, double salary, String department) {
        super(empId, name, salary); // Constructor chaining
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println(", Department: " + department);
    }
}

public class InheritanceEmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Aniket", 50000.0);
        Manager mgr = new Manager(102, "Sneha", 95000.0, "Engineering");

        System.out.println("--- Employee Details ---");
        emp.displayDetails();
        System.out.println();

        System.out.println("\n--- Manager Details ---");
        mgr.displayDetails();
    }
}
