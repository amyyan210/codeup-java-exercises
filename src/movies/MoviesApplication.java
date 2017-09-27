package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        int userNumber;
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category");
            userNumber = input.getInt("Enter your choice: ", 0, 5);
            execute(userNumber);
        } while(userNumber != 0);
    }

    public static void showMovies (String filter) {
        Movie[] allMovies = MoviesArray.findAll();
        // Movie (type) movie (variable naming here) is each iteration through the MoviesArray
        for (Movie movie : allMovies) {
            if (filter.equalsIgnoreCase(movie.getCategory()) || filter.equalsIgnoreCase("all")) {
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        }
    }


    public static void execute (int userNumber) {
        switch (userNumber) {
            case 0:
                break;
            case 1:
                //display all movies
                showMovies("all");
                break;
            case 2:
                //filter array for animated
                showMovies("animated");
                break;
            case 3:
                //filter array for drama
                showMovies("drama");
                break;
            case 4:
                //filter array for horror
                showMovies("horror");
                break;
            case 5:
                //filter array for sci-fi
                showMovies("sci-fi");
                break;
            default:
                System.out.println("That is not a valid entry. Please enter 0-5.");
        }
    }
}
