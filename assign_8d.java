import java.util.*;

abstract class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject() {
        color = "White";
        weight = 1.0;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double findArea();

    public abstract double findCircumference();
}

class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double findArea() {
        // Heron's formula to calculate the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double findCircumference() {
        return side1 + side2 + side3;
    }
}

public class assign_8d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();
        GeometricObject triangle = new Triangle(side1, side2, side3);
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Weight: " + triangle.getWeight());
        System.out.println("Area of the triangle: " + triangle.findArea());
        System.out.println("Circumference of the triangle: " + triangle.findCircumference());
        scanner.close();
    }
}