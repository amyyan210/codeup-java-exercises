import java.util.Scanner;
import java.lang.*;


public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(add(1, 2));
//        System.out.println(subtract(1, 2));
//        System.out.println(multiply(1, 2));
//        System.out.println(divide(10, 2));
//        System.out.println(remainder(11, 2));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial(4));
//        System.out.println(rollDice(6));
        HighLow.guessGame();
    }

//    public static int add (int a, int b) {
//        return a + b;
//    }
//
//    public static int subtract (int a, int b) {
//        return a - b;
//    }
//
//    public static int multiply (int a, int b) {
//        return a * b;
//    }
//
//    public static int divide (int a, int b) {
//        return a / b;
//    }
//
//    public static int remainder (int a, int b) {
//        return a % b;
//    }
//
//
//    public static int getInteger(int min, int max) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = scan.nextInt();
//
//        if (userInput <= max && userInput >= min) {
//            return userInput;
//        } else {
//            getInteger(1, 10); // Recursion!
//            return 0;
//        }
//    }

//    public static long factorial (int userNumber) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter a number between 1 and 10: ");
//        userNumber = scan.nextInt();
//
//        long j = 1;
//
//        for (int i = 1; i <= userNumber; i++) {
//            j *= i;
//        }
//
//        return j;
//    }


//    public static int rollDice (int n) {
//        Scanner scan = new Scanner(System.in);
//
//        String userAnswer;
//
//        do {
//            System.out.println("Enter the number of sides on your dice.");
//            n = scan.nextInt();
//
//            System.out.println("Random number 1: " + Math.ceil(Math.random() * ((n - 1) + 1)));
//            System.out.println("Random number 2: " + Math.ceil(Math.random() * ((n - 1) + 1)));
//
//            scan.nextLine();
//
//            System.out.println("Do you want to continue rolling the dice? Y | N");
//            userAnswer = scan.nextLine();
//
//            return 0;
//
//        } while (userAnswer.equalsIgnoreCase("Y"));
//    }



}
