
public class ShowShape {
    public void ShowShape(Shape s) {
        if (s instanceof Circle) {
            System.out.println("Circle");
        } else if (s instanceof Square) {
            System.out.println("Square");
        }
    } 
    
}
