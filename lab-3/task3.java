// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate the area
    public abstract double calculateArea();
}

// Rectangle class that inherits from Shape
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Method to check if the Rectangle is a square
    public boolean isSquare() {
        return length == width;
    }
}

// Triangle class that inherits from Shape
class Triangle extends Shape {
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    // Constructor for Triangle
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementing the calculateArea method for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Method to check if the Triangle is a right-angled triangle
    public boolean isRightAngled() {
        // Check using Pythagoras' theorem
        return (side1 * side1 + side2 * side2 == side3 * side3) ||
               (side1 * side1 + side3 * side3 == side2 * side2) ||
               (side2 * side2 + side3 * side3 == side1 * side1);
    }
}

// Main class to demonstrate the functionality
public class task3 {
    public static void main(String[] args) {
        // Create instances of Rectangle and Triangle
        Rectangle rectangle = new Rectangle(5, 3);
        Triangle triangle = new Triangle(10, 9, 6, 8, 10);

        // Calculate and display the area of the Rectangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        if (rectangle.isSquare()) {
            System.out.println("This Rectangle is a Square.");
        } else {
            System.out.println("This Rectangle is not a Square.");
        }

        // Calculate and display the area of the Triangle
        System.out.println("Triangle Area: " + triangle.calculateArea());
        if (triangle.isRightAngled()) {
            System.out.println("This Triangle is a right-angled Triangle.");
        } else {
            System.out.println("This Triangle is not a right-angled Triangle.");
        }
    }
}
