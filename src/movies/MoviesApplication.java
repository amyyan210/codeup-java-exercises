package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        System.out.print("Enter your choice: ");
        System.out.println(Input.getInt(0, 5));
    }
}
