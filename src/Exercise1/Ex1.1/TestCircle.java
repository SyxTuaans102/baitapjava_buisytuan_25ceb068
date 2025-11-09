import java.sql.SQLOutput;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Hình tròn có bán kính là " + c1.getRadius() + " và diện tích là " + c1.getArea());
        Circle c2 = new Circle();
        System.out.println("Hình tròn có bán kính là " + c2.getRadius() + " và diện tích là " + c2.getArea());
    }
}
