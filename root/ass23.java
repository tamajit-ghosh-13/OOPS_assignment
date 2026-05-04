package root;

interface Shape {
    void area(); void draw(); void rotate(); void move(int x, int y);
}

class Circle implements Shape {
    int x, y;
    Circle(int x, int y) { this.x = x; this.y = y; }
    public void area() { System.out.println("Circle Area calculated."); }
    public void draw() { System.out.println("Drawing Circle at " + x + "," + y); }
    public void rotate() { System.out.println("Rotating Circle."); }
    public void move(int nx, int ny) { x = nx; y = ny; }
}

class Rectangle implements Shape {
    int x, y;
    Rectangle(int x, int y) { this.x = x; this.y = y; }
    public void area() { System.out.println("Rectangle Area calculated."); }
    public void draw() { System.out.println("Drawing Rectangle at " + x + "," + y); }
    public void rotate() { System.out.println("Rotating Rectangle."); }
    public void move(int nx, int ny) { x = nx; y = ny; }
}

public class ass23 {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(0,0), new Circle(1,1), 
                           new Rectangle(2,2), new Rectangle(3,3), new Rectangle(4,4) };

        System.out.println("--- Before Moving ---");
        for (Shape s : shapes) s.draw();

        System.out.println("\n--- After Moving ---");
        for (Shape s : shapes) {
            s.move(10, 10);
            s.draw();
        }
    }
}
