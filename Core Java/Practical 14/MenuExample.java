import javax.swing.*;
import java.awt.event.*;

public class MenuExample extends JFrame implements ActionListener {
    JLabel label;

    public MenuExample() {
        setTitle("Menu Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();

        JMenu colors = new JMenu("Colors");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem blue = new JMenuItem("Blue");
        colors.add(red);
        colors.add(blue);

        JMenu sy = new JMenu("SY");
        JMenuItem android = new JMenuItem("Android");
        JMenuItem java = new JMenuItem("Java");
        sy.add(android);
        sy.add(java);

        mb.add(colors);
        mb.add(sy);
        setJMenuBar(mb);

        label = new JLabel("Select from menu", SwingConstants.CENTER);
        add(label);

        red.addActionListener(this);
        blue.addActionListener(this);
        android.addActionListener(this);
        java.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String item = e.getActionCommand();
        label.setText("You selected: " + item);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
