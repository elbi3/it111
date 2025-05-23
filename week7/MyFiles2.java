import java.io.File;

import static java.lang.System.out;

public class MyFiles2 {

    public static void main(String[] args) {
//        out.println();

        File dir = new File("NewFolder");

        if(dir.exists()) {

            String[] files = dir.list();

            assert files != null;

            out.println(files.length + " files found");

            for(int i = 0; i < files.length; i++) {
                out.println(files[i]);
            }

        } else {
            out.println("Directory does not exist!");
        }
    }

}
