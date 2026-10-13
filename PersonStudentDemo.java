class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails() {
        System.out.print("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

class Student extends Person {
    private int rollNo;
    private String course;

    public Student(String name, int age, String address, int rollNo, String course) {
        super(name, age, address); // Constructor chaining
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling parent method
        System.out.println(", Roll No: " + rollNo + ", Course: " + course);
    }
}

public class PersonStudentDemo {
    public static void main(String[] args) {
        Person p = new Person("Rajesh Sharma", 48, "Pune, Maharashtra");
        Student s = new Student("Karan Sharma", 20, "Pune, Maharashtra", 1204, "Computer Engineering");

        System.out.println("--- Person Details ---");
        p.displayDetails();
        System.out.println();

        System.out.println("\n--- Student Details ---");
        s.displayDetails();
    }
}
