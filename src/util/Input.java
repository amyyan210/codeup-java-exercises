package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Type a sentence.");
        String sentence = scanner.nextLine();
        return sentence;
    }

    public boolean yesNo() {
        System.out.println("Type Y or N");
        String YesOrNo = scanner.next();

        if (YesOrNo.equalsIgnoreCase("Y") || YesOrNo.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Please type an integer between " + min + " and " + max + ".");
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            return getInt(min, max);
        }
    }

    public int getInt(){
        return 0;
    }

    public double getDouble (double min, double max) {
        System.out.println("Please type a decimal point number between " + min + " and " + max + ".");
        double userNumber = scanner.nextDouble();
        if (userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        return 0.0;
    }

}

