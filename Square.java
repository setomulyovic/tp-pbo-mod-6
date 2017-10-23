public class Square implements Shape {
    private final double length; //sides

    public Square() {
        this(1);
    }
    public Square(double length) {
        this.length = length;
    }

    public double area() {
        // A = w * l
        return length * length;
    }
}
