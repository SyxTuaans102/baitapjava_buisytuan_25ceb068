public class Circle2 implements GeometricObject {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "radius=" + radius +
                '}';
    }

    public double getArea() {
        return radius * radius;
    }
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

}
