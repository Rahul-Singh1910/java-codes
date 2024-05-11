abstract class TwoDFigure
{
    double dimension1;
    double dimension2;
    public TwoDFigure(double dimension1, double dimension2) 
    {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    public abstract double calculateArea();
}

class Rectangle extends TwoDFigure 
{
    public Rectangle(double length, double width) 
    {
        super(length, width);
    }
    public double calculateArea() 
    {
        return dimension1 * dimension2;
    }
}

class Triangle extends TwoDFigure 
{
    public Triangle(double base, double height) 
    {
        super(base, height);
    }
    public double calculateArea() 
    {
        return 0.5 * dimension1 * dimension2;
    }
}
public class assign_8c 
{
    public static void main(String[] args) 
    {
        TwoDFigure rectangle = new Rectangle(4.0, 6.0);
        TwoDFigure triangle = new Triangle(3.0, 5.0);

        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
    }
}