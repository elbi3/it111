import java.util.Scanner;

public class GradeAveraging {
    public static void main(String[] args) {
        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner inputScanner = new Scanner(System.in);

        while(counter <= 5) {
            System.out.println("Enter your numerical grade #" +counter);
            grade = inputScanner.nextInt();
            total += grade;
            counter += 1;
        }

        String message;
        char letterGrade;

        counter -= 1; //otherwise counter is 6 in the next equation:

        average = total/counter;
        System.out.println("You have earned an average grade of " +average+ " after providing us with " +counter+ " grades");

        if(average >= 90 && average <= 100) {
            letterGrade = 'A';
            message = "Excellent work!";
        } else if(average >= 80 && average < 90) {
            letterGrade = 'B';
            message = "Solid work!";
        } else if(average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "More studying would help!";

        } else if(average >= 60 && average < 70) {
            letterGrade = 'D';
            message = "Squeaking by!";
        } else {
            letterGrade = 'F';
            message = "Not a passing grade. Please consult the tutoring center.";
        }

        System.out.println("You have earned the following letter grade of " +letterGrade+ ", and here is the message: " + message);
    }
}
