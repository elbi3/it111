import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();

//        input.close();

        String coffee;
        double price;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }

        switch (specials) {
            case "Monday" -> {
                coffee = "Upside-Down Mocaccino Frappuccino";
                price = 4.95;
                System.out.println(specials + "'s 'Coffee of the Day' is an " + coffee + " for $" + price);
            }
            case "Tuesday" -> {
                coffee = "Red Eye";
                price = 4.95;
                System.out.println(specials + "'s 'Coffee of the Day' is a " + coffee + " for $" + price);
            }
            case "Wednesday" -> {
                coffee = "Bone Dry Cappuccino";
                price = 3;
                System.out.println(specials + "'s 'Coffee of the Day' is a " + coffee + " for $" + price);
            }
            case "Thursday" -> {
                coffee = "Shot in the Dark";
                price = 4;
                System.out.println(specials + "'s 'Coffee of the Day' is a " + coffee + " for $" + price);
            }
            case "Friday" -> {
                coffee = "Dirty Chai";
                price = 4.95;
                System.out.println(specials + "'s 'Coffee of the Day' is a " + coffee + " for $" + price);
            }
            default ->
                    System.out.println("Please enter a valid week day (Monday, Tuesday, Wednesday, Thursday or Friday)");
        }
    }
}
