public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}