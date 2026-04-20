import javax.swing.*;
import java.awt.*;

public class CounterGUI {
    private int count = 0;
    private JTextField textField;

    public CounterGUI() {
        JFrame frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(new JLabel("Counter"));
        textField = new JTextField("0", 10);
        textField.setEditable(false);
        frame.add(textField);

        JButton btnUp = new JButton("Count Up");
        btnUp.addActionListener(e -> {
            count++;
            textField.setText(String.valueOf(count));
        });
        frame.add(btnUp);

        JButton btnDown = new JButton("Count Down");
        btnDown.addActionListener(e -> {
            count--;
            textField.setText(String.valueOf(count));
        });
        frame.add(btnDown);

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(e -> {
            count = 0;
            textField.setText(String.valueOf(count));
        });
        frame.add(btnReset);

        frame.setSize(400, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CounterGUI();
    }
}
