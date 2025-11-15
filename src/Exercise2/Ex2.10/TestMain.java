public class TestMain {
    public static  void main(String[] args) {
        MyRectangle t1 = new MyRectangle(1, 3, 7, 9);
        System.out.println(t1);
        System.out.println("width: " + t1.getWidth());
        System.out.println("height: " + t1.getHeight());
        System.out.println("area: " + t1.getArea());
        System.out.println("perimeter: " + t1.getPerimeter());
    }
}