import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        String car = "Volvo";
        String[] cars = new String[4];
        cars[0] = "Volvo";
        cars[1] = "Ford";
        cars[2] = "Toyota";
        cars[3] = "Honda";

        System.out.println(cars[2].toUpperCase());
        System.out.println(Arrays.toString(cars));

        String[] books = {"The Obelisk Gate", "The Archive Undying", "Meet Me In The Future", "Witch King", "Truth of the Divine"};
        System.out.println(Arrays.toString(books));

        String[] games = new String[5];
        games[0] = "Baldur's Gate 3";
        games[1] = "Rimworld";
        games[2] = "Oxygen Not Included";
        games[3] = "Don't Starve";
        games[4] = "Stardew Valley";

        System.out.println(Arrays.toString(games));

        for(String game : games) {
            System.out.println(game);
        }

        int[] numbers = new int[3];
        numbers[0] = 22;
        numbers[1] = 312312;
        numbers[2] = 2;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]+numbers[2]+numbers[1]);
        for(int number : numbers) {
            System.out.println(number);
        }

        String[] wines = new String[5];
        wines[0] = "Peachy Canyon";
        wines[1] = "Castoro Cellars";
        wines[2] = "Pesenti";
        wines[3] = "Twisted Vine";
        wines[4] = "White Horse";

//        for(String wine : wines) {
//            System.out.println(wine);
//            System.out.println(wine.length());
//        }

        for(String wine : wines) {
            if(wine.equals("Pesenti")){
                break;
            }
            System.out.println(wine);
            System.out.println(wine.length());
        }
    }
}
