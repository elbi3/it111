public class PersonRegular {

    public static void main(String[] args) {

        String firstPersonName = "Leona";
        String secondPersonName = "Kevin";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 34;
        int secondPersonAge = 24;
        String firstPersonCar = "Dodge Ram";
        String secondPersonCar = "BMW";
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        int firstPersonCreditScore = 620;
        int secondPersonCreditScore = 610;
        double monthlyRate1;
        double monthlyRate2;
        double adjustedRate1;
        double adjustedRate2;

        if(firstPersonViolations == true && firstPersonCreditScore <= 700) {
            monthlyRate1 = 500;
        } else {
            monthlyRate1 = 100;
        }

        if(secondPersonViolations == true && secondPersonCreditScore <= 700) {
            monthlyRate2 = 600;
        } else {
            monthlyRate2 = 100;
        }

        if(firstPersonAge <= 55 && firstPersonGender == 'F') {
            adjustedRate1 = 100;
        } else {
            adjustedRate1 = 0;
        }

        if(secondPersonAge <= 55 && secondPersonGender == 'M') {
            adjustedRate2 = 100;
        } else {
            adjustedRate2 = 0;
        }

        double total1 = monthlyRate1 + adjustedRate1;
        double total2 = monthlyRate2 + adjustedRate2;

        System.out.println("First Person Name: " +firstPersonName);
        System.out.println("First Person Gender: " +firstPersonGender);
        System.out.println("First Person Age: " +firstPersonAge);
        System.out.println("First Person Car: " +firstPersonCar);
        System.out.println("First Person Violations: " +firstPersonViolations);
        System.out.println("First Person Credit Score: " +firstPersonCreditScore);
        System.out.println("First Person Preliminary rate: " +monthlyRate1);
        System.out.println("First Person Final Monthly Rate(including gender and age): " +total1);

        System.out.println();

        System.out.println("Second Person Name: " +secondPersonName);
        System.out.println("Second Person Gender: " +secondPersonGender);
        System.out.println("Second Person Age: " +secondPersonAge);
        System.out.println("Second Person Car: " +secondPersonCar);
        System.out.println("Second Person Violations: " +secondPersonViolations);
        System.out.println("Second Person Credit Score: " +secondPersonCreditScore);
        System.out.println("Second Person Preliminary rate: " +monthlyRate2);
        System.out.println("Second Person Final Monthly Rate(including gender and age): " +total2);
    }

}
