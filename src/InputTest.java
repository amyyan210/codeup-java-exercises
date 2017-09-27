import util.Input;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println(input.getString());

        System.out.println(input.yesNo());

        System.out.println(input.getInt("Please enter a number between 0 and 10", 0, 10));

        System.out.println(input.getInt());

        System.out.println(input.getDouble(0, 10));

        System.out.println(input.getDouble());

    }
}

