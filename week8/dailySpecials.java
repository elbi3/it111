import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;
        int drinkOrderNum;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.nextLine();

        specials = specials.toLowerCase();
        specials = specials.substring(0,1).toUpperCase() + specials.substring(1);


//        input.close();

        String coffee;
        double price;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.nextLine();
            specials = specials.toLowerCase();
            specials = specials.substring(0,1).toUpperCase() + specials.substring(1);
        }

        switch (specials) {
            case "Monday" -> {
                coffee = "Upside-Down Mocaccino Frappuccino";
                price = 4.95;
                System.out.println(specials + "'s 'Coffee of the Day' is an " + coffee + " for $" + price);

                System.out.println("How many " +coffee+ "s would you like to order?");

                drinkOrderNum = input.nextInt();

                if(drinkOrderNum == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s. So sad!!!");
                } else if(drinkOrderNum == 1) {
                    System.out.println("Looks like you will be ordering only " +drinkOrderNum+ " " +coffee);
                } else {
                    double total = drinkOrderNum * price;
                    System.out.println(drinkOrderNum + " " +coffee+ "s have been ordered totalling: ");
                    System.out.printf("$%.2f dollars", total);
                }
            }
            case "Tuesday" -> {
                coffee = "Red Eye";
                price = 4.95;
                System.out.println(specials + "'s 'Coffee of the Day' is a " + coffee + " for $" + price);

                System.out.println("How many " +coffee+ "s would you like to order?");

                drinkOrderNum = input.nextInt();

                if(drinkOrderNum == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s. So sad!!!");
                } else if(drinkOrderNum == 1) {
                    System.out.println("Looks like you will be ordering only " +drinkOrderNum+ " " +coffee);
                } else {
                    double total = drinkOrderNum * price;
                    System.out.println(drinkOrderNum + " " +coffee+ "s have been ordered totalling: ");
                    System.out.printf("$%.2f dollars", total);
                }

            }
            case "Wednesday" -> {
                coffee = "Bone Dry Cappuccino";
                price = 3;
                System.out.println(specials + "'s 'Coffee of the Day' is a " + coffee + " for $" + price);

                System.out.println("How many " +coffee+ "s would you like to order?");

                drinkOrderNum = input.nextInt();

                if(drinkOrderNum == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s. So sad!!!");
                } else if(drinkOrderNum == 1) {
                    System.out.println("Looks like you will be ordering only " +drinkOrderNum+ " " +coffee);
                } else {
                    double total = drinkOrderNum * price;
                    System.out.println(drinkOrderNum + " " +coffee+ "s have been ordered totalling: ");
                    System.out.printf("$%.2f dollars", total);
                }
            }
            case "Thursday" -> {
                coffee = "Shot in the Dark";
                price = 4;
                System.out.println(specials + "'s 'Coffee of the Day' is a " + coffee + " for $" + price);

                System.out.println("How many " +coffee+ "s would you like to order?");

                drinkOrderNum = input.nextInt();

                if(drinkOrderNum == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s. So sad!!!");
                } else if(drinkOrderNum == 1) {
                    System.out.println("Looks like you will be ordering only " +drinkOrderNum+ " " +coffee);
                } else {
                    double total = drinkOrderNum * price;
                    System.out.println(drinkOrderNum + " " +coffee+ "s have been ordered totalling: ");
                    System.out.printf("$%.2f dollars", total);
                }
            }
            case "Friday" -> {
                coffee = "Dirty Chai";
                price = 4.95;
                System.out.println(specials + "'s 'Coffee of the Day' is a " + coffee + " for $" + price);

                System.out.println("How many " +coffee+ "s would you like to order?");

                drinkOrderNum = input.nextInt();

                if(drinkOrderNum == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s. So sad!!!");
                } else if(drinkOrderNum == 1) {
                    System.out.println("Looks like you will be ordering only " +drinkOrderNum+ " " +coffee);
                } else {
                    double total = drinkOrderNum * price;
                    System.out.println(drinkOrderNum + " " +coffee+ "s have been ordered totalling: ");
                    System.out.printf("$%.2f dollars", total);
                }
            }
            default ->
                    System.out.println("Please enter a valid week day (Monday, Tuesday, Wednesday, Thursday or Friday)");
        }
    }
}
