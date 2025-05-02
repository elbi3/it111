import java.util.Scanner;

public class MyInput {
    public static void main(String[] args) {
        String name, message;
        int age;
        double salary;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your first name, please!");
        name = myScanner.next();
        System.out.println(name+ ", please enter your age!");
        age = myScanner.nextInt();
        System.out.println(name+ ", last, but not least (I hope), please enter your annual salary!");
        salary = myScanner.nextDouble();

        if(salary < 50_000) {
            message = "I need a new job or a massive inheritance!";
        } else if(salary >= 50_000 && salary < 60_000 ) {
            message = "Not bad, but hard to survive in Seattle!";
        } else if(salary >= 60_000 && salary < 70_000) {
            message = "Salary is getting better!";
        } else if(salary >= 70_000 && salary < 80_000) {
            message = "Almost liveable in Seattle!";
        } else {
            message = "Life is good!";
        }

        System.out.println("First Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: $" +salary+ " dollars");
        System.out.println("Message: " +message);
    }
}
