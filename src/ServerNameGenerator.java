import java.util.Arrays;

public class ServerNameGenerator {
    private static String[] adjectives = {"pretty", "ugly", "nice", "mean", "deserving", "hopeful", "messy", "clean", "useful", "scary"};
    private static String[] nouns = {"table", "chair", "laptop", "apartment", "cat", "friend", "city", "teacher", "leg", "face"};


    public static String getRandomString(String[] wordArray) {

        int randomNumber = (int) (Math.random() * wordArray.length);

        return wordArray[randomNumber];
    }

    public static void main(String[] args) {
        System.out.print(getRandomString(adjectives));
        System.out.print("-");
        System.out.print(getRandomString(nouns));

    }
}
