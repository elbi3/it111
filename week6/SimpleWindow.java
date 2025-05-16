import javax.swing.*;

public class SimpleWindow extends JFrame {

    //no main method because we extended the class JFrame!
    //use the special method Constructor to display our attributes
    public SimpleWindow() {

        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 400;

        setTitle("My Second Simple Window");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
