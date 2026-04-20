import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo {
    public RadioButtonDemo() {
        JFrame frame = new JFrame("Radio Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select Gender:");
        frame.add(label);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        frame.add(male);
        frame.add(female);

        JLabel resultLabel = new JLabel("Selection: None");
        frame.add(resultLabel);

        ActionListener listener = e -> {
            resultLabel.setText("Selection: " + e.getActionCommand());
        };

        male.addActionListener(listener);
        female.addActionListener(listener);

        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
