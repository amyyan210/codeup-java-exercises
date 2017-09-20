import java.util.Scanner;

public class StringExercise {
    public static void main (String[] args) {
//        String message = "We don't need no education\n" +
//                "We don't need no thought control";
//        String message = "Check \"this\" out!, \"s inside of \"s!";
//        String message = "In windows, the main drive is usually C:\\";
//        String message = "I can do backslashes \\, double backslashes \\\\,\n" + "and the amazing triple backslash \\\\\\!";
//        System.out.println(message);

        Scanner scan = new Scanner(System.in);

        String answerToQuestion = "Sure.";
        String answerToYell = "Whoa, chill out!";
        String answerToAddress = "Fine. Be that way!";
        String answerToOther = "Whatever.";
        String yesOrNo;

        do {
            System.out.println("Talk to Bob.");
            String input = scan.nextLine();

            if (input.endsWith("?")) {
                System.out.println(answerToQuestion);
            } else if (input.endsWith("!")) {
                System.out.println(answerToYell);
            } else if (input.endsWith(".")) {
                System.out.println(answerToAddress);
            } else {
                System.out.println(answerToOther);
            }

            System.out.println("Would you like to continue speaking to Bob? Y | N");
            yesOrNo = scan.next();
            scan.nextLine();

            if (yesOrNo.equalsIgnoreCase("N")) {
                System.out.println("Fine then, BYE.");
            }

        } while (yesOrNo.equalsIgnoreCase("Y"));
    }
}
