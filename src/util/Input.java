package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
//        System.out.println("Type a sentence.");
        String sentence = scanner.nextLine();
        return sentence;
    }

    public boolean yesNo() {
        System.out.println("Type Y or N");
        String YesOrNo = scanner.nextLine();

        if (YesOrNo.equalsIgnoreCase("Y") || YesOrNo.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public String prompt;
    public int getInt(String prompt, int min, int max) {
        int userNumber = getInt();
        if (userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            return getInt(prompt, min, max);
        }
    }

    public int getInt(){
        try {
            int input = Integer.valueOf(getString());
            return input;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("That's not an integer! Try again!");
            return getInt();
        }
    }

    public String prompt2;
    public double getDouble (String prompt2, double min, double max) {
        double userNumber = getDouble();
        if (userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            return getDouble(prompt, min, max);
        }
    }

    public double getDouble(){
        try{
            double input = Double.valueOf(getString());
            return input;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("That's not a double! Try again!");
            return getDouble();
        }
    }

}

