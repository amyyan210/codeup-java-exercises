package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle (double length, double width) {
        super (length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) { this.width = width; }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
//    private float length;
//    private float width;
//
//    public Rectangle (float length, float width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public float getArea () {
//        return length * width;
//    }
//
//    public float getPerimeter () {
//        return (2 * length) + (2 * width);
//    }
//
//    public float getLength() {
//        return length;
//    }
//
//    public float getWidth() {
//        return width;
//    }

}
