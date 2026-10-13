class Employee {
    private String name;
    private static int employeeCount = 0;

    public Employee(String name) {
        this.name = name;
        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void displayCountFromInstance() {
        System.out.println(this.name +
                " observes employee count: " + employeeCount);
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ramesh");
        Employee e2 = new Employee("Suresh");
        Employee e3 = new Employee("Mahesh");

        e1.displayCountFromInstance();

        System.out.println("Total Employee Count (via Static Method): "
                + Employee.getEmployeeCount());
    }
}
