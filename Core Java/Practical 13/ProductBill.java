import javax.swing.*;
import java.awt.event.*;

class ProductBill extends JFrame implements ActionListener {
    JComboBox<String> combo;
    JTextField qtyField, resultField;
    JButton calcBtn;

    ProductBill() {
        setTitle("Product Billing");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel productLabel = new JLabel("Select Product:");
        productLabel.setBounds(30, 30, 120, 25);
        add(productLabel);

        String products[] = {"Pen", "Ruler", "Notebook"};
        combo = new JComboBox<>(products);
        combo.setBounds(160, 30, 120, 25);
        add(combo);

        JLabel qtyLabel = new JLabel("Quantity:");
        qtyLabel.setBounds(30, 70, 120, 25);
        add(qtyLabel);

        qtyField = new JTextField();
        qtyField.setBounds(160, 70, 120, 25);
        add(qtyField);

        calcBtn = new JButton("Calculate Bill");
        calcBtn.setBounds(120, 110, 150, 30);
        calcBtn.addActionListener(this);
        add(calcBtn);

        resultField = new JTextField();
        resultField.setBounds(80, 160, 220, 30);
        resultField.setEditable(false);
        add(resultField);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String product = (String) combo.getSelectedItem();
        int qty = Integer.parseInt(qtyField.getText());
        int price = 0;

        if (product.equals("Pen")) price = 10;
        else if (product.equals("Ruler")) price = 20;
        else if (product.equals("Notebook")) price = 50;

        int total = qty * price;
        resultField.setText("Total Bill = Rs. " + total);
    }

    public static void main(String[] args) {
        new ProductBill();
    }
}
