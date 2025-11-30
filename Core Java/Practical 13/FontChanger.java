import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FontChanger extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton rb1, rb2, rb3;
    ButtonGroup bg;

    FontChanger() {
        setTitle("Font Changer");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Hello Rashi!");
        add(label);

        rb1 = new JRadioButton("Serif");
        rb2 = new JRadioButton("SansSerif");
        rb3 = new JRadioButton("Monospaced");

        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        add(rb1);
        add(rb2);
        add(rb3);

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected())
            label.setFont(new Font("Serif", Font.PLAIN, 20));
        else if (rb2.isSelected())
            label.setFont(new Font("SansSerif", Font.PLAIN, 20));
        else if (rb3.isSelected())
            label.setFont(new Font("Monospaced", Font.PLAIN, 20));
    }

    public static void main(String[] args) {
        new FontChanger();
    }
}
