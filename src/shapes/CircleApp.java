package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();

        double userDouble = input.getDouble("Please enter a double",0, 10);

        Circle circle = new Circle(userDouble);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }
}
