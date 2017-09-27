package shapes;
import java.lang.Math;

public class Circle {
    private double radius;
    double pi = Math.PI;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * (java.lang.Math.pow(radius, 2));
    }

    public double getCircumference() {
        return 2 * pi * radius;
    }

}
