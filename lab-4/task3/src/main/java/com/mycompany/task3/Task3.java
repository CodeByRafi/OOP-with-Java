// Create an abstract class called "Shape" with a final attribute "color"
// and static attribute "shapeCount". Include abstract methods
// "calculateArea()" and "calculatePerimeter()". Create two subclasses
// "Circle" and "Rectangle" that inherit from Shape and implement the
// abstract methods. Add a static method "getTotalShapes()" to the Shape
// class. Create a program that instantiates various shapes, calculates their
// areas and perimeters, and displays the total count of shapes created.

package com.mycompany.task3;

/**
 *
 * @author Gcl
 */
abstract class Shape {
    final String color;
   
    static int shapeCount = 0;

    Shape(String color) {
        this.color = color;
        shapeCount++; 
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    static int getTotalShapes() {
        return shapeCount;
    }
}

class Circle extends Shape {
    
    double radius;


    Circle(String color, double radius) {
        super(color);  // Call the parent class constructor
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Circle (" + color + "): Area = " + calculateArea() + ", Perimeter = " + calculatePerimeter());
    }
}
class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);  
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    void displayDetails() {
        System.out.println("Rectangle (" + color + "): Area = " + calculateArea() + ", Perimeter = " + calculatePerimeter());
    }
}

public class Task3 {
    public static void main(String[] args) {
        
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 5);

        
        circle.displayDetails();
        rectangle.displayDetails();
        System.out.println("Total shapes created: " + Shape.getTotalShapes());
    }
}

