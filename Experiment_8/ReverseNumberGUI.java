import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberGUI {
    public ReverseNumberGUI() {
        JFrame frame = new JFrame("Reverse Number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(new JLabel("Enter Number:"));
        JTextField inputField = new JTextField(10);
        frame.add(inputField);

        JButton reverseBtn = new JButton("Reverse");
        JLabel resultLabel = new JLabel("Result: ");
        frame.add(reverseBtn);
        frame.add(resultLabel);

        reverseBtn.addActionListener(e -> {
            try {
                String text = inputField.getText();
                String reversed = new StringBuilder(text).reverse().toString();
                resultLabel.setText("Result: " + reversed);
            } catch (Exception ex) {
                resultLabel.setText("Invalid Input");
            }
        });

        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ReverseNumberGUI();
    }
}
