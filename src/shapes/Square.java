package shapes;

public class Square extends Rectangle {

    public Square (float side) {
        super (side, side);
    }

    public float getArea () {
        //makes reference to square class, use super.getLength() etc. if you want that method
        return this.getLength() * this.getWidth();
    }

    public float getPerimeter () {
        //makes reference to square class, use super.getLength() etc. if you want that method
        return 4 * this.getWidth();
    }

}
