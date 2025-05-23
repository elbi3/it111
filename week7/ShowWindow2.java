import javax.swing.*;
import java.awt.*;

//please note that the screenshot for this project is in the README at the root of repo it111
public class ShowWindow2 extends JFrame {

    public static void main(String[] args) {

        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 550;
        final int WINDOW_X = 600;
        final int WINDOW_Y = 200;

        JFrame window = new JFrame();
        window.setLayout(null);

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JLabel label1 = new JLabel("My First Big Label!");
        JLabel label2 = new JLabel("My Second Big Label!");

        Font font1 = new Font("Times New Roman", 0, 20);
        Font font2 = new Font("Arial", 1, 25);

        label1.setFont(font1);
        label1.setBounds(20,20, 300, 20);
        textField1.setBounds(20, 50, 200, 20);

        label2.setFont(font2);
        label2.setBounds(20,120, 300, 30);
        textField2.setBounds(20, 155, 200, 20 );

        window.setTitle("My Simple Window");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLocation(WINDOW_X, WINDOW_Y);

        window.add(label1);
        window.add(textField1);
        window.add(label2);
        window.add(textField2);

        window.getContentPane().setBackground(Color.pink);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
