package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Measurable myShape = new Square(5);
        Measurable myShape2 = new Rectangle(5, 4);

        System.out.println("area: " + myShape.getArea());
        System.out.println("perimeter: " + myShape.getPerimeter());

        System.out.println("area: " + myShape2.getArea());
        System.out.println("perimeter: " + myShape2.getPerimeter());

    }
}
