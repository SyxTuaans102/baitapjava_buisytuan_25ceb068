public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" +
                "radius=" + radius +
                ']';
    }

    public void resize(int percent) {
        this.radius = radius * percent;
    }
}
