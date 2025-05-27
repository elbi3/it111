package package_person;

public class PersonDetails {
    //this file will have a main method
    public static void main(String[] args) {

        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;

        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();

        firstPerson.name = "Carolyn";
        firstPerson.gender = 'X';
        firstPerson.age = 89;
        firstPerson.car = "Volvo";
        firstPerson.violations = true;
        firstPerson.creditScore = 570;

        secondPerson.name = "Kevin";
        secondPerson.gender = 'M';
        secondPerson.age = 47;
        secondPerson.car = "Ducati";
        secondPerson.violations = false;
        secondPerson.creditScore = 810;

        thirdPerson.name = "Ariel";
        thirdPerson.gender = 'F';
        thirdPerson.age = 17;
        thirdPerson.car = "Seashell";
        thirdPerson.violations = false;
        thirdPerson.creditScore = 550;

        double monthlyRate = 0;
        double adjustedRate = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for "+ firstPerson.name+ ": $" +firstPerson.getRate(monthlyRate));
        System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate)+ " dollars");
        System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: $");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate));
        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for "+ secondPerson.name+ ": $" +secondPerson.getRate(monthlyRate));
        System.out.println("Adjustments: " +secondPerson.assumeGender(adjustedRate)+ " dollars");
        System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: $");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate));
        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for "+ thirdPerson.name+ ": $" +thirdPerson.getRate(monthlyRate));
        System.out.println("Adjustments: " +thirdPerson.assumeGender(adjustedRate)+ " dollars");
        System.out.print("Here is " +thirdPerson.name+ "'s total monthly premium: $");
        System.out.println(thirdPerson.assumeGender(adjustedRate) + thirdPerson.getRate(monthlyRate));
    }
}
