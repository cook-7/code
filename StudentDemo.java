class Student {
    private String name;
    private int age;
    private int rollNo;
    private double marks;

    // Default Constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.rollNo = 0;
        this.marks = 0.0;
    }

    // Parameterized Constructor
    public Student(String name, int age, int rollNo, double marks) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void updateMarks(double newMarks) {
        this.marks = newMarks;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + this.rollNo + ", Name: " + this.name +
                           ", Age: " + this.age + ", Marks: " + this.marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Aarav", 20, 101, 85.5);

        System.out.println("--- Initial Details ---");
        s1.displayDetails();
        s2.displayDetails();

        System.out.println("\n--- Updating s2 Marks ---");
        s2.updateMarks(92.0);
        s2.displayDetails();
    }
}
