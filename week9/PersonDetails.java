import java.util.Scanner;

public class PersonDetails {

    public static void main(String[] args) {

        Person customer;
        customer = new Person();
        int states = 0;

        System.out.println("Please enter your name.");
        Scanner input = new Scanner(System.in);
        customer.name = input.next();

        System.out.println("Please enter your age.");
        customer.age = input.nextInt();

        System.out.println("Please enter your gender by entering F or M or X.");
        customer.gender = input.next().charAt(0);

        System.out.println("Please enter your zipcode (only 5 digits please).");
        customer.zipcode = input.next();

        System.out.println("Any traffic violations? Please enter true for yes, and false for no.");
        customer.violations = input.nextBoolean();

        if(customer.violations == true) {
            System.out.println("Please type 'true' if you had a DUI, or 'false' if not.");
            customer.violationDUI = input.nextBoolean();
            System.out.println("Please type 'true' if you had a red light violation, or 'false' if not.");
            customer.violationRedLight = input.nextBoolean();
            System.out.println("Have you received any speeding tickets? Please type 'true' for yes, or 'false' for no tickets.");
            customer.violationSpeeding = input.nextBoolean();
        }

        System.out.println("Please type your credit score.");
        customer.creditScore = input.nextDouble();
        customer.display();
        System.out.println(customer.identifyRegion(states));
        double surcharge = 0;
        System.out.println("Your california surcharge is " +customer.californiaRegion(surcharge));
        double adjustedRate = 0;
        System.out.println("Age category: " +customer.ageCategory(adjustedRate));
        double monthlyRate = 0;
        System.out.println("Violations and Credit Score: " +customer.getRate(monthlyRate));
        System.out.print("Your new monthly premium will be: ");
        System.out.println(customer.baselineRate
                +customer.ageCategory(adjustedRate)
                +customer.californiaRegion(surcharge)
                +customer.getRate(monthlyRate));
    }
}
