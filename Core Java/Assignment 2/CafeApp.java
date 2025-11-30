// Save as CafeApp.java
import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CafeApp {
    private final String[] items = {"Pizza", "Burger", "Fries", "Coffee", "Iced Tea"};
    private final int[] prices = {300, 150, 100, 80, 50};

    private JFrame frame;
    private JSpinner[] qtySpinners;
    private JTextArea billArea;
    private JTextField discountField;
    private JComboBox<String> paymentBox;
    private int billNo = 1000;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CafeApp::new);
    }

    public CafeApp() {
        showLogin();
    }

    // ---------------- LOGIN ----------------
    private void showLogin() {
        JFrame login = new JFrame("Login - Czyprotex Café");
        login.setSize(280, 140);
        login.setLayout(new GridLayout(3, 2, 5, 5));
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);

        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();
        JButton loginBtn = new JButton("Login");

        login.add(new JLabel("Username:")); login.add(user);
        login.add(new JLabel("Password:")); login.add(pass);
        login.add(new JLabel(""));          login.add(loginBtn);

        loginBtn.addActionListener(e -> {
            if (user.getText().equals("admin") && new String(pass.getPassword()).equals("1234")) {
                login.dispose();
                buildMainUI();
            } else JOptionPane.showMessageDialog(login, "Invalid! Try admin / 1234");
        });

        login.setVisible(true);
    }

    // ---------------- MAIN ----------------
    private void buildMainUI() {
        frame = new JFrame("Czyprotex Café — Billing");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // LEFT: Menu + Discount + Payment
        JPanel left = new JPanel(new GridLayout(items.length + 2, 2, 5, 5));
        qtySpinners = new JSpinner[items.length];

        for (int i = 0; i < items.length; i++) {
            left.add(new JLabel(items[i] + " (₹" + prices[i] + "):"));
            qtySpinners[i] = new JSpinner(new SpinnerNumberModel(0, 0, 20, 1));
            left.add(qtySpinners[i]);
        }

        discountField = new JTextField("0");
        paymentBox = new JComboBox<>(new String[]{"Select", "Cash", "UPI"});
        left.add(new JLabel("Discount %:")); left.add(discountField);
        left.add(new JLabel("Payment:"));    left.add(paymentBox);

        // CENTER: Bill
        billArea = new JTextArea();
        billArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(billArea);

        // BOTTOM: Buttons
        JPanel bottom = new JPanel();
        JButton btnGenerate = new JButton("Generate Bill");
        JButton btnSave = new JButton("Save Bill");
        JButton btnClear = new JButton("Clear");

        bottom.add(btnGenerate); bottom.add(btnSave); bottom.add(btnClear);

        // Actions
        btnGenerate.addActionListener(e -> generateBill());
        btnSave.addActionListener(e -> saveBill());
        btnClear.addActionListener(e -> clearForm());

        frame.add(left, BorderLayout.WEST);
        frame.add(scroll, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    // ---------------- FUNCTIONS ----------------
    private void generateBill() {
        if (paymentBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(frame, "Choose payment method!");
            return;
        }
        double subtotal = 0;
        StringBuilder sb = new StringBuilder("=== Czyprotex Café ===\n");
        sb.append("Bill No: ").append(++billNo).append("\n");
        sb.append("Date: ").append(LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))).append("\n");
        sb.append("Payment: ").append(paymentBox.getSelectedItem()).append("\n");
        sb.append("------------------------------\n");

        for (int i = 0; i < items.length; i++) {
            int qty = (Integer) qtySpinners[i].getValue();
            if (qty > 0) {
                double cost = qty * prices[i];
                subtotal += cost;
                sb.append(items[i]).append(" x ").append(qty)
                  .append(" = ₹").append(cost).append("\n");
            }
        }

        double discount = parseDouble(discountField.getText());
        double discountAmt = subtotal * discount / 100;
        double afterDiscount = subtotal - discountAmt;
        double gst = afterDiscount * 0.05;
        double total = afterDiscount + gst;

        sb.append("------------------------------\n");
        if (discountAmt > 0) sb.append("Discount: -₹").append(discountAmt).append("\n");
        sb.append("Subtotal: ₹").append(subtotal).append("\n");
        sb.append("GST (5%): ₹").append(gst).append("\n");
        sb.append("Grand Total: ₹").append(total).append("\n");
        sb.append("------------------------------\n");
        sb.append("✅ PAID\nThank you! Visit Again\n");

        billArea.setText(sb.toString());
    }

    private void saveBill() {
        try (FileWriter fw = new FileWriter("Bill_" + billNo + ".txt")) {
            fw.write(billArea.getText());
            JOptionPane.showMessageDialog(frame, "Saved as Bill_" + billNo + ".txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
        }
    }

    private void clearForm() {
        for (JSpinner s : qtySpinners) s.setValue(0);
        discountField.setText("0");
        paymentBox.setSelectedIndex(0);
        billArea.setText("");
    }

    private double parseDouble(String s) {
        try { return Double.parseDouble(s); } catch (Exception e) { return 0; }
    }
}
