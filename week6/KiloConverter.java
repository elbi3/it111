import javax.swing.*;

public class KiloConverter extends JFrame {

    JPanel panel;

    JLabel messageLabel;

    JTextField kiloTextField;

    JButton calcButton;

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    public KiloConverter() {
        setTitle("Kilometer Converter");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);
        setVisible(true);


    }

    public void buildPanel() {

        messageLabel = new JLabel("Enter a distance in Kilometers");

        kiloTextField = new JTextField(10);

        calcButton = new JButton("Calculate");

        panel = new JPanel();

        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }

    public static void main(String[] args) {

        new KiloConverter();
    }
}
