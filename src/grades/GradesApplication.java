package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Amy");

        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(100);


        Student student2 = new Student("Simone");

        student2.addGrade(50);
        student2.addGrade(100);
        student2.addGrade(100);

        Student student3 = new Student("Ryan");

        student3.addGrade(20);
        student3.addGrade(100);
        student3.addGrade(100);

        Student student4 = new Student("Jim");

        student4.addGrade(0);
        student4.addGrade(50);
        student4.addGrade(100);


        // Adding students to the HashMap
        students.put("amyyan210", student1);
        students.put("blahblah", student2);
        students.put("prettyGurl", student3);
        students.put("hireMe", student4);

        System.out.println(getStudentInfo(students));

    }

    public static String getStudentInfo (HashMap<String, Student> students) {

        System.out.println("Welcome! \nHere are the Github usernames of our students:");
        for (String key : students.keySet()) {
            System.out.print("|" + key + "| ");
        }

        System.out.println();
        System.out.println("What student would you like to see more information on?");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        if (students.containsKey(userInput)) {
            Student student = students.get(userInput);
            System.out.println(student.getStudentName() + " - Github username: " + userInput);
            System.out.println("Current average: " + student.getGradeAverage());
        } else {
            System.out.println("Sorry, no student found with the Github username of '" + userInput + "'.");
        }

        System.out.println("Would you like to see another student? Y | N");
        userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("Y")) {
            return getStudentInfo(students);
        } else {
            return "Goodbye, and have a wonderful day!";
        }

    }

}

