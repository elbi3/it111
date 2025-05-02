public class MyOperators2 {
    public static void main(String[] args) {
        boolean tuna = true;
        boolean bread = false;
        if(tuna == true && bread == true) {
            System.out.println("We are having a sandwich!");
        } else {
            System.out.println("This is no sandwich!");
        }

        if(tuna == true || bread == true) {
            System.out.println("I can eat this.");
        } else {
            System.out.println("We are skipping lunch.");
        }

        int age = 15;
        if(age >= 18) {
            System.out.println("Yippy skippy, we can order an adult beverage and be drafted into the military! Hey, wait...");
        } else {
            System.out.println("We will have water in a beer can so we can drink with the homies.");
        }

//        int height = 4;
        float height = 3.9f;
        if(height < 4) {
            System.out.println("You will not be allowed to get on the roller coaster.");
        } else {
            System.out.println("Have a great time and good luck!");
        }
    }
}
