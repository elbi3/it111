public class MyForLoop {
    public static void main(String[] args) {

//        int count;
//        for(count = 0; count <= 20; count = count+2) {
//            System.out.println(count);
//        }
//        System.out.println("All Done!");

        int newCount;
        for(newCount = 20; newCount > 0; newCount = newCount-1) {
            if(newCount <= 10) {
                System.out.println("We are almost at blast off! only " +newCount+ " seconds away!");
            } else {
                System.out.println(newCount);
            }
        }
        System.out.println("Blast off!");
    }
}
