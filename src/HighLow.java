import java.util.Scanner;
import java.lang.Math;

public class HighLow {



    public static void guessGame () {

        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println(randomNumber);

        System.out.println("Enter a number between 1 and 100.");

        Scanner input = new Scanner(System.in);

        int userNumber;

        do  {
            userNumber = input.nextInt();

            if (userNumber < 1 || userNumber > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
            } else if (userNumber > randomNumber) {
                System.out.println("LOWER!");
            } else if (userNumber < randomNumber) {
                System.out.println("HIGHER!");
            } else if (userNumber == randomNumber) {
                System.out.println("GOOD GUESS!");
            }
        } while (userNumber != randomNumber);

    }
}
