import javax.swing.*;

import javax.swing.*;



import java.awt.*;







public class SmileySwing extends JPanel {



    public void paintComponent(Graphics g) {



        super.paintComponent(g);



        g.setColor(Color.yellow);



        g.fillOval(50, 50, 150, 150);



        g.setColor(Color.black);



        g.fillOval(90, 90, 15, 25);



        g.fillOval(150, 90, 15, 25);



        g.drawArc(90, 120, 70, 40, 0, -180);



    }



    public static void main(String[] args) {



        JFrame f = new JFrame("Smiley Face");



        f.add(new SmileySwing());



        f.setSize(300, 300);



        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        f.setVisible(true);



    }



}