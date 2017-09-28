package shapes;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle (float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getArea () {
        return length * width;
    }

    public float getPerimeter () {
        return (2 * length) + (2 * width);
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }
}
