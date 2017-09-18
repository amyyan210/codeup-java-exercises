public class java_syntax {
    public static void main (String[] args) {
        int myFavoriteNumber = 22;
        System.out.println(myFavoriteNumber);

        String myString = "Hello, Redwood!";

      // "Incompatible types" - string assigned to character type
//      char myString = "Hello, Redwood!";

    //  "Incompatible types" - number assigned to string type
//      String myString = 3.14159;

        System.out.println(myString);

    //  "Variable might not have been assigned"
//      long myNumber;

//      "Incompatible types - required: long, found: double" - long is for integers only
//      long myNumber = 3.14;

    //  Prints!
//      long myNumber = 123L;

    //  Also prints!
        long myNumber = 123;

//      "Incompatible types - required: float, found: double" - either change to double or add        'f' after number to fix
//      float myNumber = 3.14;

        System.out.println(myNumber);


//      int x = 5;

//      prints x out first then adds
//      System.out.println(x++);

    //  shows x with addition now
//      System.out.println(x);

        int x = 5;
    //  prints with addition already being calculated
        System.out.println(++x);
    //  prints out new x (the same)
        System.out.println(x);

    //  Doesn't work because "class" is a reserved word
//      String class = "Redwood";

        int y = 4;

//      y = y + 5;
        // Rewritten with shorthand
        y += 5;
        System.out.println(y);

        int a = 3;
        int b = 4;
//      b = b * a;

        // Rewritten with shorthand
        b *= a;

        System.out.println(b);


        int d = 10;
        int e = 2;

//      d = d / e;
     // Rewritten with shorthand
//      d /= e;

//      e = e - d;
    //  Rewritten with shorthand
        e -= d;
        System.out.println(e);

    }
}
