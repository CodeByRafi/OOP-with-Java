// Shape class (parent class)
class Shape {
    // Constructor for Shape class (can be left empty for this example)
    public Shape() {}

    // A method to be overridden by subclasses
    public void displayType() {
        System.out.println("Type of shape: Generic Shape");
    }
}

// Circle class (child class of Shape)
class Circle extends Shape {
    double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the displayType() method for Circle class
    @Override
    public void displayType() {
        System.out.println("Type of shape: Circle");
    }
}

// Rectangle class (child class of Shape)
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the displayType() method for Rectangle class
    @Override
    public void displayType() {
        System.out.println("Type of shape: Rectangle");
    }
}

// Main class to run the program
public class ShapeHierarchy {
    public static void main(String[] args) {
        // Create a Circle object with radius 5.0
        Circle circle = new Circle(5.0);

        // Create a Rectangle object with length 4.0 and width 6.0
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Call the displayType method for Circle and Rectangle objects
        circle.displayType();
        rectangle.displayType();
    }
}
