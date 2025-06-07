package daily_specials;

import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;
        int drinkOrderNum;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.nextLine();

        String coffee ="";
        double price = 0;

        boolean weekend = true;

        while(weekend) {
            specials = caseFix(specials);

            switch (specials) {
                case "Saturday", "Sunday" -> {
                    weekend = true;
                    System.out.println("Please enter a weekday, not weekend!");
                    specials = input.nextLine();
                }
                case "Monday" -> {
                    coffee = "Upside-Down Mocaccino Frappuccino";
                    price = 4.95;
                    weekend = false;
                }
                case "Tuesday" -> {
                    coffee = "Red Eye";
                    price = 4.95;
                    weekend = false;
                }
                case "Wednesday" -> {
                    coffee = "Bone Dry Cappuccino";
                    price = 3;
                    weekend = false;
                }
                case "Thursday" -> {
                    coffee = "Shot in the Dark";
                    price = 4;
                    weekend = false;
                }
                case "Friday" -> {
                    coffee = "Dirty Chai";
                    price = 4.95;
                    weekend = false;
                }
                default -> {
                    System.out.println("Please enter a valid weekday, or check your spelling and exit, and try again!");
                    specials = input.nextLine();
                }
            }
        }

        System.out.println(specials +"'s 'Coffee of the Day' is a " +coffee +" for $" + price);
        System.out.println("How many " +coffee +"s would you like to order?");

        drinkOrderNum = input.nextInt();

        if(drinkOrderNum == 0) {
            System.out.println("No drinks, okay. Try a free sample of our scones. The wifi password is 'password'.");
        } else if(drinkOrderNum == 1) {
            System.out.println("Looks like you will be ordering only " +drinkOrderNum +" " +coffee);
        } else if(drinkOrderNum <= 4) {
            double total = drinkOrderNum * price;
            System.out.println(drinkOrderNum +" " +coffee +"s have been ordered totalling: ");
            System.out.printf("$%.2f dollars", total);
        } else if(drinkOrderNum <= 9) {
            double total = drinkOrderNum * price;
            double newTotal = total - (total * .10);
            System.out.println("You qualified for our 10% group discount!");
            System.out.printf(drinkOrderNum +" " +coffee +"s usually cost $%.2f dollars!! %n", total);
            System.out.printf("Your order is now $%.2f dollars", newTotal);
        } else {
            double total = drinkOrderNum * price;
            double newTotal = total - (total * .20);
            System.out.println("You qualified for our steepest group discount - 20%!");
            System.out.printf(drinkOrderNum +" " +coffee +"s usually cost $%.2f dollars!! %n", total);
            System.out.printf("Your order is now $%.2f dollars", newTotal);
        }
    }

    public static String caseFix(String day) {
        day = day.toLowerCase();
        day = day.substring(0,1).toUpperCase() + day.substring(1);
        return day;
    }
}
