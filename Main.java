
public class Main {

    public static void main(String[] args) {
        ShowShape x = new ShowShape();
        Square s = new Square(10);
        System.out.println(s.area());
        x.ShowShape(s);
        Circle c = new Circle(1);
        System.out.println(c.area());
        x.ShowShape(c);    
    }
}
