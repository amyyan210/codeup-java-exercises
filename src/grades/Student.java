package grades;
import java.util.ArrayList;


public class Student {

    private String studentName;

    private ArrayList<Integer> studentGrades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGrades = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {
        studentGrades.add(grade);
    }

    public double getGradeAverage() {
        int sumOfGrades = 0;
        for (int i = 0; i < studentGrades.size(); i++) {
            sumOfGrades += studentGrades.get(i);
        }
        double average = (double) sumOfGrades / (double) studentGrades.size();
        //rounds to two decimal places
        return Math.round(average * 100.0) / 100.0;
    }

}
