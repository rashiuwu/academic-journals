import javax.swing.*;
import java.awt.event.*;

class TriangleArea extends JFrame implements ActionListener {
    JTextField baseField, heightField, resultField;
    JButton calcBtn;

    TriangleArea() {
        setTitle("Triangle Area Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel baseLabel = new JLabel("Base:");
        baseLabel.setBounds(30, 30, 80, 25);
        add(baseLabel);

        baseField = new JTextField();
        baseField.setBounds(120, 30, 100, 25);
        add(baseField);

        JLabel heightLabel = new JLabel("Height:");
        heightLabel.setBounds(30, 60, 80, 25);
        add(heightLabel);

        heightField = new JTextField();
        heightField.setBounds(120, 60, 100, 25);
        add(heightField);

        calcBtn = new JButton("Calculate");
        calcBtn.setBounds(80, 100, 120, 30);
        calcBtn.addActionListener(this);
        add(calcBtn);

        resultField = new JTextField();
        resultField.setBounds(80, 140, 120, 25);
        resultField.setEditable(false);
        add(resultField);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double base = Double.parseDouble(baseField.getText());
        double height = Double.parseDouble(heightField.getText());
        double area = 0.5 * base * height;
        resultField.setText("Area = " + area);
    }

    public static void main(String[] args) {
        new TriangleArea();
    }
}
