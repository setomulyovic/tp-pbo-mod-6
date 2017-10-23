
public class Circle implements Shape {
    private double radius;
    double pi = Math.PI;

    public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        // A = π r^2
        return pi * radius * radius;
    }

}
    
