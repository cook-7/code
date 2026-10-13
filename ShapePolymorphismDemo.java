abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with smooth radius.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length and breadth.");
    }
}

public class ShapePolymorphismDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(),
            new Rectangle(),
            new Circle()
        };

        for (Shape shape : shapes) {
            shape.draw(); // Dynamic method dispatch
        }
    }
}
