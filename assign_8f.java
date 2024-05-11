// First interface representing a shape
interface Shape {
    void draw();
}

// Second interface representing a color
interface Color {
    void fill();
}

// A class that implements both Shape and Color interfaces
class Circle implements Shape, Color {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void fill() {
        System.out.println("Filling Circle with color");
    }
}

public class assign_8f {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.fill();
    }
}
