import java.io.File;

public class MyFiles {

    public static void main(String[] args) {

        File dir = new File("NewFolder");

        if(dir.exists()) {

            System.out.println("Yippy Skippy!!! We have a directory!");
        } else {
            System.out.println("We are lost in time and space. Not sure where that directory is.");
        }
    }
}
