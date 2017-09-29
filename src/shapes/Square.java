package shapes;

public class Square extends Quadrilateral {

    public Square (double side) {
        super (side, side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

//    public Square (float side) {
//        super (side, side);
//    }
//
//    public float getArea () {
//        //makes reference to rectangle class, use super.getLength() etc. if you want that method
//        return this.getLength() * this.getWidth();
//    }
//
//    public float getPerimeter () {
//        //makes reference to rectangle class, use super.getLength() etc. if you want that method
//        return 4 * this.getWidth();
//    }





}
