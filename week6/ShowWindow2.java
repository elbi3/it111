import javax.swing.*;

public class ShowWindow2 {

    public static void main(String[] args) {

        final int WINDOW_WIDTH = 250;
        final int WINDOW_HEIGHT = 250;

        JFrame window = new JFrame();
        window.setTitle("My Simple Window");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

}
