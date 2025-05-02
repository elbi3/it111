public class LitersToGallonsConverter {

    public static void main(String[] args) {

        double liters, gallons;
        int linesCounter = 0;

        for (gallons = 1; gallons <= 100; gallons += 3){

            if(linesCounter % 5 == 0) {
                System.out.println();
            }

            linesCounter++;

            liters = (gallons * 3.785);

            if(gallons == 1) {
                System.out.println( String.format("%.2f", liters) + " Liters = " + gallons + " Gallon");
            } else {
                System.out.println( String.format("%.2f", liters) + " Liters = " + gallons + " Gallons");
            }
        }

        System.out.println();
        System.out.println("We are done!!!");
    }
}
