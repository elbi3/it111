package package_person_input;


public class Person {
    String name;
    char gender;
    int age;
    String zipcode;
    int cityCode;
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;
    double creditScore;
    double baselineRate;

    String carMake = "Honda";
    String carModel = "Civic";
    int carYear = 2001;
    double vehicleAgeRate;


    public void display() {
        System.out.println("Your name: " +name);
        System.out.println("Your age: " +age);
        System.out.println("Your car: " +carYear +" " +carMake +" " +carModel);
        System.out.println("Your violations: " +violations);
        System.out.println("Your Credit Score: " +creditScore);
    }

    public double getRate(double monthlyRate) {
        if(violations == true || creditScore <= 700) {
            monthlyRate = 300.00;
        } else {
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    public double ageCategory(double adjustedRate) {
        if(age <= 25 || age >= 65) {
            adjustedRate = 300.00;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    public int identifyRegion() {
        String zip2;
        zip2 = zipcode.substring(0, 2);
        cityCode = Integer.parseInt(zip2);
        if(cityCode >= 90 && cityCode <= 96) {
            System.out.println("You entered " +zipcode+ " and you're from California.");
        } else if (cityCode == 97) {
            System.out.println("You entered " +zipcode + " and you're from Oregon.");
        } else if (cityCode == 98 || cityCode == 99) {
            System.out.println("You entered " +zipcode+ " and you're from Washington.");
        } else {
            System.out.println("You're not from the PNW, please contact our National Office.");
        }
        return cityCode;
    }

    public double californiaRegion(double surcharge) {
        if(cityCode >= 90 && cityCode <=96) {
            surcharge = 200;
        } else {
            surcharge = 0;
        }
        return surcharge;
    }

    public double getCarRate(int carYear) {
        if(carYear >= 2015) {
            vehicleAgeRate = 0.00;
        } else if (carYear <= 2000) {
            vehicleAgeRate = 200.00;
        } else {
            vehicleAgeRate = 100.00;
        }
        return vehicleAgeRate;
    }
}
