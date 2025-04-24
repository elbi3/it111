public class MyDataTypes {
    public static void main(String[] args) {
        short number1 = 32_000;
        long number2 = 3_000_000_000L;
        float number3 = 33.23F;
        double number4 = 23.52356245245;
        int number5 = 2_000_111;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);

        boolean dry = false;

        if(dry) {
            System.out.println("Bring the bedding inside!");
        } else {
            System.out.println("Let's leave it out to dry a little longer!");
        }

        char best = 'C';

        System.out.println(++best);
    }
}
