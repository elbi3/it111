import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args) {

        Person customer;
        customer = new Person();

        System.out.println("Please enter your name.");
        Scanner input = new Scanner(System.in);
        customer.name = input.next();

        System.out.println("Please enter your age.");
        customer.age = input.nextInt();

        System.out.println("Please enter your gender by entering F or M or X.");
        customer.gender = input.next().charAt(0);

        System.out.println("Please enter your zipcode (only 5 digits please).");
        customer.zipcode = input.next();

        System.out.println("Please enter the make of your car.");
        customer.carMake = input.next();
        System.out.println("Please enter the model of your car.");
        customer.carModel = input.next();
        System.out.println("Please enter the year of your car.");
        customer.carYear = input.nextInt();

        System.out.println("Any traffic violations? Please enter true for yes, and false for no.");
        customer.violations = input.nextBoolean();

        if(customer.violations) {
            System.out.println("Please type 'true' if you had a DUI, or 'false' if not.");
            customer.violationDUI = input.nextBoolean();
            System.out.println("Please type 'true' if you had a red light violation, or 'false' if not.");
            customer.violationRedLight = input.nextBoolean();
            System.out.println("Have you received any speeding tickets? Please type 'true' for yes, or 'false' for no tickets.");
            customer.violationSpeeding = input.nextBoolean();
        }

        System.out.println("Please type your credit score.");
        customer.creditScore = input.nextDouble();

        System.out.println("(Region code: " +customer.identifyRegion() +")");
        double surcharge = 0;
        System.out.println("Your california surcharge is " +customer.californiaRegion(surcharge));
        double adjustedRate = 0;
        System.out.println("Age category: " +customer.ageCategory(adjustedRate));
        double monthlyRate = 0;
        System.out.println("Violations and Credit Score: " +customer.getRate(monthlyRate));

        System.out.println("--Summary--------------------------");
        customer.display();
        System.out.print("Your new monthly premium will be: ");
        System.out.println(customer.baselineRate
                +customer.ageCategory(adjustedRate)
                +customer.californiaRegion(surcharge)
                +customer.getRate(monthlyRate)
                +customer.getCarRate(customer.carYear)
                +" dollars");
        System.out.println("Your premium is calculated based on your base monthly rate of "
                +customer.getRate(monthlyRate) +", adjustment for your your age " +customer.age +" (" +customer.ageCategory(adjustedRate) +"), adjustment for a car made in " +customer.carYear +" (" +customer.getCarRate(customer.carYear) +"), and whether you have a California surcharge (" +customer.californiaRegion(surcharge) +")");
    }
}
