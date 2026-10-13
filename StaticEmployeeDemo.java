class Employee {
    private String name;
    private static int employeeCount = 0;

    public Employee(String name) {
        this.name = name;
        employeeCount++;
    }

    // Static Method
    public static int getEmployeeCount() {
        return employeeCount;
    }

    // Instance Method
    public void displayCountFromInstance() {
        System.out.println(this.name + " observes employee count: " + employeeCount);
    }
}

public class StaticEmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ramesh");
        Employee e2 = new Employee("Suresh");
        Employee e3 = new Employee("Mahesh");

        // Calling through instance method
        e1.displayCountFromInstance();

        // Calling through static class method
        System.out.println("Total Employee Count (via Static Method): " + Employee.getEmployeeCount());
    }
}
