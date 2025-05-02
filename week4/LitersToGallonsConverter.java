public class LitersToGallonsConverter {

    public static void main(String[] args) {

        double liters, gallons;
        int linesCounter = 0;

        for (gallons = 1; gallons <= 100; gallons += 3){
            
            if(linesCounter % 5 == 0) {
                System.out.println();
            }

            linesCounter++;

            liters = (gallons * 3.79);

            if(gallons == 1) {
                System.out.println(gallons + " Gallon =  " + String.format("%.2f", liters) + " Liters");
            } else {
                System.out.println(gallons + " Gallons =  " + String.format("%.2f", liters) + " Liters");
            }
        }
    }
}
