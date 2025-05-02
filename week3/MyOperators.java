public class MyOperators {
    public static void main(String[] args) {
//        int regHours, overtimeHours;
//        double overtimePay, regularPay, total;
//        float wage;
//        double hourlywithOvertime;
//
//        regHours = 40;
//        overtimeHours = 5;
//        wage = 25.50F;
//        regularPay = regHours * wage;
//        overtimePay = (wage * 1.5) * overtimeHours;
//        total = overtimePay + regularPay;
//        hourlywithOvertime = total / (regHours + overtimeHours);
//
//        System.out.println("Regular pay: $" +regularPay+ " dollars");
//        System.out.println("Overtime pay: $" +overtimePay+ " dollars");
//        System.out.println("Total pay: $" +total+ " dollars");
//        System.out.println("Hourly rate with overtime: " +hourlywithOvertime+ "dollars");
//        System.out.print("Hourly rate with overtime: ");
//        System.out.printf("$%.2f", hourlywithOvertime);

        int number1, number2, number3;
        number1 = 24321;
        number2 = 2;
        number3 = number1 % number2;
        System.out.println(number3);

        if(number3 == 0) {
            System.out.println(number1+ " is an even number");
        } else {
            System.out.println(number1+ " is an odd number");
        }
        //let's go shopping!
//        double tax, priceOfItem, taxOnItem, totalPrice;
//        tax = .10;
//        priceOfItem = 100.00;
//        taxOnItem = priceOfItem * tax;
//        totalPrice = priceOfItem + taxOnItem;
//        System.out.println("Price of item $" +priceOfItem+ " dollars");
//        System.out.println("Tax $" +taxOnItem+ " dollars");
//        System.out.println("Price including tax $" +totalPrice+ " dollars");

        double priceOfItem = 100;
        priceOfItem *= 1.10;
        System.out.print("Total price of item is: ");
        System.out.printf("$%.2f", priceOfItem);
        System.out.print(" dollars");
    }
}
