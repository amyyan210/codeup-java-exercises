import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer.");
        int userNumber = scan.nextInt();
        System.out.println("Your number is " + userNumber + ".");

        System.out.println("Please enter three different words with a return in between.");
        String firstWord = scan.nextLine();
        String secondWord = scan.nextLine();
        String thirdWord = scan.nextLine();

        System.out.println("Your words are " + firstWord + ", " + secondWord + ", and " + thirdWord + ".");

        System.out.println("Please write a sentence.");
        String userSentence = scan.nextLine();
        System.out.println(userSentence);

        System.out.println("Please enter the width and height (in feet) of the Codeup classroom with a return in between.");
        String width = scan.nextLine();
        String height = scan.nextLine();
        float floatWidth = Float.parseFloat(width); //wrapper class to change data types from string to float
        float floatHeight = Float.parseFloat(height);
        float area = floatWidth * floatHeight;
        float perimeter = (floatWidth * 2) + (floatHeight * 2);
        System.out.println("The area of the Codeup classroom is the width(" + floatWidth + " ft.) X the height (" + floatHeight + " ft.), or " + area + " ft.");
        System.out.println("The perimeter of the Codeup classroom is " + perimeter + " ft.");


    }

}
